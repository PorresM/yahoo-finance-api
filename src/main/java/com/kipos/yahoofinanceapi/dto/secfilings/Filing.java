package com.kipos.yahoofinanceapi.dto.secfilings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Filing {
    @JsonProperty
    String date;
    @JsonProperty
    Integer epochDate;
    @JsonProperty
    String type;
    @JsonProperty
    String title;
    @JsonProperty
    String edgarUrl;
    @JsonProperty
    Integer maxAge;

    public String getDate() {
        return date;
    }

    public Integer getEpochDate() {
        return epochDate;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getEdgarUrl() {
        return edgarUrl;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
