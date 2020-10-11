package com.kipos.yahoofinanceapi.dto.earningshistory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsHistoryWrapper {
    @JsonProperty
    List<EarningsHistory> history;
    @JsonProperty
    Integer maxAge;

    public List<EarningsHistory> getHistory() {
        return history;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
