package com.kipos.yahoofinanceapi.dto.upgradedowngrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpgradeDowngrade {
    @JsonProperty
    Integer epochGradeDate;
    @JsonProperty
    String firm;
    @JsonProperty
    String toGrade;
    @JsonProperty
    String fromGrade;
    @JsonProperty
    String action;

    public Integer getEpochGradeDate() {
        return epochGradeDate;
    }

    public String getFirm() {
        return firm;
    }

    public String getToGrade() {
        return toGrade;
    }

    public String getFromGrade() {
        return fromGrade;
    }

    public String getAction() {
        return action;
    }
}
