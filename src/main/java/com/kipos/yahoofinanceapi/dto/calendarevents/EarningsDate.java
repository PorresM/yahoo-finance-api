package com.kipos.yahoofinanceapi.dto.calendarevents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsDate {
    @JsonProperty
    List<Format> earningsDate;

    public List<Format> getEarningsDate() {
        return earningsDate;
    }
}
