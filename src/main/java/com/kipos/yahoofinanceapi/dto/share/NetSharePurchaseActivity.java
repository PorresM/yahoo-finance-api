package com.kipos.yahoofinanceapi.dto.share;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;
import com.kipos.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NetSharePurchaseActivity {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    String period;
    @JsonProperty
    LongFormat buyInfoCount;
    @JsonProperty
    LongFormat buyInfoShares;
    @JsonProperty
    Format buyPercentInsiderShares;
    @JsonProperty
    LongFormat sellInfoCount;
    @JsonProperty
    LongFormat sellInfoShares;
    @JsonProperty
    Format sellPercentInsiderShares;
    @JsonProperty
    LongFormat netInfoCount;
    @JsonProperty
    LongFormat netInfoShares;
    @JsonProperty
    Format netPercentInsiderShares;
    @JsonProperty
    LongFormat totalInsiderShares;

    public Integer getMaxAge() {
        return maxAge;
    }

    public String getPeriod() {
        return period;
    }

    public LongFormat getBuyInfoCount() {
        return buyInfoCount;
    }

    public LongFormat getBuyInfoShares() {
        return buyInfoShares;
    }

    public Format getBuyPercentInsiderShares() {
        return buyPercentInsiderShares;
    }

    public LongFormat getSellInfoCount() {
        return sellInfoCount;
    }

    public LongFormat getSellInfoShares() {
        return sellInfoShares;
    }

    public Format getSellPercentInsiderShares() {
        return sellPercentInsiderShares;
    }

    public LongFormat getNetInfoCount() {
        return netInfoCount;
    }

    public LongFormat getNetInfoShares() {
        return netInfoShares;
    }

    public Format getNetPercentInsiderShares() {
        return netPercentInsiderShares;
    }

    public LongFormat getTotalInsiderShares() {
        return totalInsiderShares;
    }
}
