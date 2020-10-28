package fr.mporres.yahoofinanceapi.dto.quoteSummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Format {
    @JsonProperty
    Double raw;
    @JsonProperty
    String fmt;

    public Double getRaw() {
        return raw;
    }

    public String getFmt() {
        return fmt;
    }
}
