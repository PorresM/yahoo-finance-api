package com.kipos.yahoofinanceapi.dto.trend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trend {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    String symbol;
    @JsonProperty
    Format peRatio;
    @JsonProperty
    Format pegRatio;
    @JsonProperty
    List<TrendEstimate> estimates;

    public Integer getMaxAge() {
        return maxAge;
    }

    public String getSymbol() {
        return symbol;
    }

    public Format getPeRatio() {
        return peRatio;
    }

    public Format getPegRatio() {
        return pegRatio;
    }

    public List<TrendEstimate> getEstimates() {
        return estimates;
    }
}
