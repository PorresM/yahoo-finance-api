package com.kipos.yahoofinanceapi.dto.earningstrand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;
import com.kipos.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsEstimate {
    @JsonProperty
    Format avg;
    @JsonProperty
    Format low;
    @JsonProperty
    Format high;
    @JsonProperty
    Format yearAgoEps;
    @JsonProperty
    LongFormat numberOfAnalysts;
    @JsonProperty
    Format growth;

    public Format getAvg() {
        return avg;
    }

    public Format getLow() {
        return low;
    }

    public Format getHigh() {
        return high;
    }

    public Format getYearAgoEps() {
        return yearAgoEps;
    }

    public LongFormat getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    public Format getGrowth() {
        return growth;
    }
}
