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

//        QuoteSummary quoteSummary = response.body().getQuoteSummary();

        return response.body().getQuoteSummary();
    }

    public static void main(String[] args) {
        fetch("AAPL",
                Modules.ESG_SCORE,
                Modules.SEC_FILINGS,
                Modules.UPGRADE_DOWNGRADE_HISTORY,
                Modules.INSIDER_TRANSACTIONS
//                Modules.ASSET_PROFILE,
//                Modules.SUMMARY_PROFILE,
//                Modules.SUMMARY_DETAIL,
//                Modules.PRICE,
//                Modules.INCOME_STATEMENT_HISTORY,
//                Modules.INCOME_STATEMENT_HISTORY_QUARTERLY,
//                Modules.BALANCE_SHEET_HISTORY,
//                Modules.BALANCE_SHEET_HISTORY_QUARTERLY,
//                Modules.CASH_FLOW_STATEMENT_HISTORY,
//                Modules.CASH_FLOW_STATEMENT_HISTORY_QUARTERLY,
//                Modules.DEFAULT_KEY_STATISTICS,
//                Modules.FINANCIAL_DATA,
//                Modules.CALENDAR_EVENTS,
//                Modules.RECOMMENDATION_TREND,
//                Modules.INSTITUTION_OWNERSHIP,
//                Modules.FUND_OWNERSHIP,
//                Modules.MAJOR_DIRECT_HOLDERS,
//                Modules.MAJOR_HOLDERS_BREAKDOWN,
//                Modules.INSIDER_HOLDERS,
//                Modules.NET_SHARE_PURCHASE_ACTIVITY,
//                Modules.EARNINGS,
//                Modules.EARNINGS_HISTORY,
//                Modules.EARNINGS_TREND,
//                Modules.INDUSTRY_TREND,
//                Modules.INDEX_TREND,
//                Modules.SECTOR_TREND
        );
    }
}
