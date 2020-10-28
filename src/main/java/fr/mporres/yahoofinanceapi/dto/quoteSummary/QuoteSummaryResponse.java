package fr.mporres.yahoofinanceapi.dto.quoteSummary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteSummaryResponse {
    @JsonProperty
    QuoteSummary quoteSummary;

    public QuoteSummary getQuoteSummary() {
        return quoteSummary;
    }
}
