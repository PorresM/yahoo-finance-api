package fr.mporres.yahoofinanceapi.dto.earnings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Earnings {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    EarningsChart earningsChart;
    @JsonProperty
    FinancialsChart financialsChart;
    @JsonProperty
    String financialCurrency;

    public Integer getMaxAge() {
        return maxAge;
    }

    public EarningsChart getEarningsChart() {
        return earningsChart;
    }

    public FinancialsChart getFinancialsChart() {
        return financialsChart;
    }

    public String getFinancialCurrency() {
        return financialCurrency;
    }
}
