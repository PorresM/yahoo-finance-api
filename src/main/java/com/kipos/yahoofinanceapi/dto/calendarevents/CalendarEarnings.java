package com.kipos.yahoofinanceapi.dto.calendarevents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;
import com.kipos.yahoofinanceapi.dto.common.LongFormat;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarEarnings {
    @JsonProperty
    List<EarningsDate> earningsDate;
    @JsonProperty
    Format earningsAverage;
    @JsonProperty
    Format earningsLow;
    @JsonProperty
    Format earningsHigh;
    @JsonProperty
    LongFormat revenueAverage;
    @JsonProperty
    LongFormat revenueLow;
    @JsonProperty
    LongFormat revenueHigh;

    public List<EarningsDate> getEarningsDate() {
        return earningsDate;
    }

    public Format getEarningsAverage() {
        return earningsAverage;
    }

    public Format getEarningsLow() {
        return earningsLow;
    }

    public Format getEarningsHigh() {
        return earningsHigh;
    }

    public LongFormat getRevenueAverage() {
        return revenueAverage;
    }

    public LongFormat getRevenueLow() {
        return revenueLow;
    }

    public LongFormat getRevenueHigh() {
        return revenueHigh;
    }
}
