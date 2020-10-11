package com.kipos.yahoofinanceapi;

import com.kipos.yahoofinanceapi.dto.common.QuoteSummary;
import com.kipos.yahoofinanceapi.dto.common.Response;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.stream.Collectors;

public class YahooFinanceApi {
    private static final String BASE_URL = "https://query2.finance.yahoo.com/v10/finance/quoteSummary/";

    public static QuoteSummary fetch(String tickerSymbol, Modules... modules) throws YahooFinanceApiException{
        if (tickerSymbol == null || tickerSymbol.isEmpty()) {
            throw new YahooFinanceApiException("tickerSymbol can't be null or empty");
        }
        if (modules == null || modules.length == 0) {
            throw new YahooFinanceApiException("Modules can't be null or empty");
        }

        String stringModules = Arrays.stream(modules).map(Modules::getName).collect(Collectors.joining(","));

        return callApi(BASE_URL + tickerSymbol + "?modules=" + stringModules);
    }

    private static QuoteSummary callApi(String uri) {
        HttpResponse<Response> response;
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
            response = client.send(request, new JsonBodyHandler<>(Response.class));
        } catch (IOException | InterruptedException e) {
            throw new YahooFinanceApiException("Error", e);
        }

        return response.body().getQuoteSummary();
    }
}
