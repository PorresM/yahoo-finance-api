package fr.mporres.yahoofinanceapi.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.YahooError;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Finance {
    @JsonProperty
    YahooError error;

    public YahooError getError() {
        return error;
    }
}
