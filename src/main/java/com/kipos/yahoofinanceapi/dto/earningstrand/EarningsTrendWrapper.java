package com.kipos.yahoofinanceapi.dto.earningstrand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsTrendWrapper {
    @JsonProperty
    List<EarningsTrend> trend;
    @JsonProperty
    Integer maxAge;

    public List<EarningsTrend> getTrend() {
        return trend;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
