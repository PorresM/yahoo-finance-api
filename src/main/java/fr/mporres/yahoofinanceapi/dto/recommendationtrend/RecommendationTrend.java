package fr.mporres.yahoofinanceapi.dto.recommendationtrend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendationTrend {
    @JsonProperty
    String period;
    @JsonProperty
    Integer strongBuy;
    @JsonProperty
    Integer buy;
    @JsonProperty
    Integer hold;
    @JsonProperty
    Integer sell;
    @JsonProperty
    Integer strongSell;

    public String getPeriod() {
        return period;
    }

    public Integer getStrongBuy() {
        return strongBuy;
    }

    public Integer getBuy() {
        return buy;
    }

    public Integer getHold() {
        return hold;
    }

    public Integer getSell() {
        return sell;
    }

    public Integer getStrongSell() {
        return strongSell;
    }
}
