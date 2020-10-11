package com.kipos.yahoofinanceapi.dto.recommendationtrend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendationTrendWrapper {
    @JsonProperty
    List<RecommendationTrend> trend;
    @JsonProperty
    Integer maxAge;

    public List<RecommendationTrend> getTrend() {
        return trend;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
