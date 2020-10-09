package com.kipos.yahoofinanceapi.dto.cashflowstatement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CashflowStatementWrapper {
    @JsonProperty
    List<CashflowStatement> cashflowStatements;
    @JsonProperty
    Integer maxAge;

    public List<CashflowStatement> getCashflowStatements() {
        return cashflowStatements;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
