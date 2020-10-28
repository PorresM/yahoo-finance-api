package fr.mporres.yahoofinanceapi;

public class YahooFinanceApiHttpException extends RuntimeException {
    private Integer statusCode;

    public YahooFinanceApiHttpException(Integer statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public YahooFinanceApiHttpException(Integer statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
