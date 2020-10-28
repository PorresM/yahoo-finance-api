package fr.mporres.yahoofinanceapi;

import fr.mporres.yahoofinanceapi.dto.quoteSummary.QuoteSummary;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.QuoteSummaryResponse;
import fr.mporres.yahoofinanceapi.dto.search.SearchResult;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.stream.Collectors;

public class YahooFinanceApi {
    private static final String QUOTE_SUMMARY = "https://query2.finance.yahoo.com/v10/finance/quoteSummary/";
    private static final String SEARCH = "https://query2.finance.yahoo.com/v1/finance/search";

    /**
     * Fetch stock informations
     * @param tickerSymbol
     * @param modules
     * @return
     * @throws YahooFinanceApiException
     */
    public static QuoteSummary fetch(String tickerSymbol, Modules... modules) throws YahooFinanceApiException{
        if (tickerSymbol == null || tickerSymbol.isEmpty()) {
            throw new YahooFinanceApiException("tickerSymbol can't be null or empty");
        }
        if (modules == null || modules.length == 0) {
            throw new YahooFinanceApiException("Modules can't be null or empty");
        }

        String stringModules = Arrays.stream(modules).map(Modules::getName).collect(Collectors.joining(","));

        HttpResponse<QuoteSummaryResponse> response = callApi(QUOTE_SUMMARY + tickerSymbol + "?modules=" + stringModules, QuoteSummaryResponse.class);

        if (response.statusCode() != 200) {
            throw new YahooFinanceApiHttpException(response.statusCode(), response.body().getQuoteSummary().getError().getDescription());
        }

        return response.body().getQuoteSummary();
    }

    public static SearchResult search(String query) {
        return search(query, 5, 0);
    }

    public static SearchResult search(String query, Integer quotesCount) {
        return search(query, quotesCount, 0);
    }

    /**
     * Search a stock by name or symbol
     * @param query
     * @param quotesCount
     * @param newsCount
     * @return
     */
    public static SearchResult search(String query, Integer quotesCount, Integer newsCount) {
        if (query == null || query.isEmpty()) {
            throw new YahooFinanceApiException("Query can't be null or empty");
        }
        if (quotesCount < 0) {
            throw new YahooFinanceApiException("QuotesCount must be a positive number");
        }
        if (newsCount < 0) {
            throw new YahooFinanceApiException("NewsCount must be a positive number");
        }

        HttpResponse<SearchResult> response = callApi(SEARCH + "?q=" + query + "&quotesCount=" + quotesCount + "&newsCount=" + newsCount, SearchResult.class);

        if (response.statusCode() != 200) {
            throw new YahooFinanceApiHttpException(response.statusCode(), response.body().getFinance().getError().getDescription());
        }

        return response.body();
    }

    private static <T> HttpResponse<T> callApi(String uri, Class<T> responseClass) {
        HttpResponse<T> response;
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .timeout(Duration.ofSeconds(30))
                .header("Accept", "application/json")
                .GET()
                .build();

        try {
            response = client.send(request, new JsonBodyHandler<>(responseClass));
        } catch (IOException | InterruptedException e) {
            throw new YahooFinanceApiException("Error while fetching Yahoo API", e);
        }

        return response;
    }
}
