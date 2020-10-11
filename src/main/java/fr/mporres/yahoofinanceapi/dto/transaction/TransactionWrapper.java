package fr.mporres.yahoofinanceapi.dto.transaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionWrapper {
    @JsonProperty
    List<Transaction> transactions;
    @JsonProperty
    Integer maxAge;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
