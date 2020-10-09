package com.kipos.yahoofinanceapi;

public class YahooFinanceApiException extends RuntimeException {
    public  YahooFinanceApiException(String message) {
        super(message);
    }

    public  YahooFinanceApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
