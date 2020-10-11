package fr.mporres.yahoofinanceapi.dto.earningstrand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EpsRevisions {
    @JsonProperty
    LongFormat upLast7days;
    @JsonProperty
    LongFormat upLast30days;
    @JsonProperty
    LongFormat downLast30days;
    @JsonProperty
    LongFormat downLast90days;

    public LongFormat getUpLast7days() {
        return upLast7days;
    }

    public LongFormat getUpLast30days() {
        return upLast30days;
    }

    public LongFormat getDownLast30days() {
        return downLast30days;
    }

    public LongFormat getDownLast90days() {
        return downLast90days;
    }
}
