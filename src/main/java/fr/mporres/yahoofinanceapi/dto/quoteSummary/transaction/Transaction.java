package fr.mporres.yahoofinanceapi.dto.quoteSummary.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    LongFormat shares;
    @JsonProperty
    LongFormat value;
    @JsonProperty
    String filerUrl;
    @JsonProperty
    String transactionText;
    @JsonProperty
    String filerName;
    @JsonProperty
    String filerRelation;
    @JsonProperty
    String moneyText;
    @JsonProperty
    Format startDate;
    @JsonProperty
    String ownership;

    public Integer getMaxAge() {
        return maxAge;
    }

    public LongFormat getShares() {
        return shares;
    }

    public LongFormat getValue() {
        return value;
    }

    public String getFilerUrl() {
        return filerUrl;
    }

    public String getTransactionText() {
        return transactionText;
    }

    public String getFilerName() {
        return filerName;
    }

    public String getFilerRelation() {
        return filerRelation;
    }

    public String getMoneyText() {
        return moneyText;
    }

    public Format getStartDate() {
        return startDate;
    }

    public String getOwnership() {
        return ownership;
    }
}
