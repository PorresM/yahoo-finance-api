package fr.mporres.yahoofinanceapi.dto.quoteSummary.secfilings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilingsWrapper {
    @JsonProperty
    List<Filing> filings;
    @JsonProperty
    Integer maxAge;

    public List<Filing> getFilings() {
        return filings;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
