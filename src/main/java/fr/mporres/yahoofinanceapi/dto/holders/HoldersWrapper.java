package fr.mporres.yahoofinanceapi.dto.holders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HoldersWrapper {
    @JsonProperty
    List<Holders> holders;
    @JsonProperty
    Integer maxAge;

    public List<Holders> getHolders() {
        return holders;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}