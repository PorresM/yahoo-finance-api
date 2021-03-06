package fr.mporres.yahoofinanceapi.dto.quoteSummary.earnings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialValue {
    @JsonProperty
    String date;
    @JsonProperty
    LongFormat revenue;
    @JsonProperty
    LongFormat earnings;

    public String getDate() {
        return date;
    }

    public LongFormat getRevenue() {
        return revenue;
    }

    public LongFormat getEarnings() {
        return earnings;
    }
}
