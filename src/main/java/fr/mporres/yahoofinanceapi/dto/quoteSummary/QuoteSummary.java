package fr.mporres.yahoofinanceapi.dto.quoteSummary;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.YahooError;

import java.util.List;

public class QuoteSummary {
    @JsonProperty
    List<Result> result;
    @JsonProperty
    YahooError error;

    public List<Result> getResult() {
        return result;
    }

    public YahooError getError() {
        return error;
    }
}
