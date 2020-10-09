package com.kipos.yahoofinanceapi.dto.earnings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningValue {
    @JsonProperty
    String date;
    @JsonProperty
    Format actual;
    @JsonProperty
    Format estimate;

    public String getDate() {
        return date;
    }

    public Format getActual() {
        return actual;
    }

    public Format getEstimate() {
        return estimate;
    }
}
