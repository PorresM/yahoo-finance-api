package com.kipos.yahoofinanceapi.dto.ownership;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OwnershipWrapper {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    List<Ownership> ownershipList;

    public Integer getMaxAge() {
        return maxAge;
    }

    public List<Ownership> getOwnershipList() {
        return ownershipList;
    }
}
