package fr.mporres.yahoofinanceapi.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    @JsonProperty
    String exchange;
    @JsonProperty
    String shortname;
    @JsonProperty
    String quoteType;
    @JsonProperty
    String symbol;
    @JsonProperty
    String index;
    @JsonProperty
    Double score;
    @JsonProperty
    String typeDisp;
    @JsonProperty
    String longname;
    @JsonProperty
    Boolean isYahooFinance;

    public String getExchange() {
        return exchange;
    }

    public String getShortname() {
        return shortname;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getIndex() {
        return index;
    }

    public Double getScore() {
        return score;
    }

    public String getTypeDisp() {
        return typeDisp;
    }

    public String getLongname() {
        return longname;
    }

    public Boolean getYahooFinance() {
        return isYahooFinance;
    }
}
