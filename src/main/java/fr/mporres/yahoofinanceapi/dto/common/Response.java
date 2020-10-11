package fr.mporres.yahoofinanceapi.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty
    QuoteSummary quoteSummary;

    public QuoteSummary getQuoteSummary() {
        return quoteSummary;
    }
}
