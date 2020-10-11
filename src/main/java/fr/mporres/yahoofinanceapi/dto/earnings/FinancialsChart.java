package fr.mporres.yahoofinanceapi.dto.earnings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialsChart {
    @JsonProperty
    List<FinancialValue> yearly;
    @JsonProperty
    List<FinancialValue> quarterly;

    public List<FinancialValue> getYearly() {
        return yearly;
    }

    public List<FinancialValue> getQuarterly() {
        return quarterly;
    }
}
