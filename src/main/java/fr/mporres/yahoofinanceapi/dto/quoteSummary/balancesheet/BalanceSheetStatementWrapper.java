package fr.mporres.yahoofinanceapi.dto.quoteSummary.balancesheet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceSheetStatementWrapper {
    @JsonProperty
    List<BalanceSheetStatement> balanceSheetStatements;
    @JsonProperty
    Integer maxAge;

    public List<BalanceSheetStatement> getBalanceSheetStatements() {
        return balanceSheetStatements;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
