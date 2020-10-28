package fr.mporres.yahoofinanceapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YahooError {
    @JsonProperty
    String code;
    @JsonProperty
    String description;

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
