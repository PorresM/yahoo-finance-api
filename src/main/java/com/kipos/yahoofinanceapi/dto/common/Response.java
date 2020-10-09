package com.kipos.yahoofinanceapi.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.QuoteSummary;

public class Response {
    @JsonProperty
    QuoteSummary quoteSummary;

    public QuoteSummary getQuoteSummary() {
        return quoteSummary;
    }
}
