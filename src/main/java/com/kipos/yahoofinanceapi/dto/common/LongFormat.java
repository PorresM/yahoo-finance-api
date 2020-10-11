package com.kipos.yahoofinanceapi.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LongFormat {
    @JsonProperty
    Double raw;
    @JsonProperty
    String fmt;
    @JsonProperty
    String longFmt;

    public Double getRaw() {
        return raw;
    }

    public String getFmt() {
        return fmt;
    }

    public String getLongFmt() {
        return longFmt;
    }
}