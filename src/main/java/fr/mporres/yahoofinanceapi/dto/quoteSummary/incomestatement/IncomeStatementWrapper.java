package fr.mporres.yahoofinanceapi.dto.quoteSummary.incomestatement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeStatementWrapper {
    @JsonProperty
    List<IncomeStatement> incomeStatementHistory;
    @JsonProperty
    Integer maxAge;

    public List<IncomeStatement> getIncomeStatementHistory() {
        return incomeStatementHistory;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
