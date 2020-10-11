package com.kipos.yahoofinanceapi.dto.financialdata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.common.Format;
import com.kipos.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialData {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format currentPrice;
    @JsonProperty
    Format targetHighPrice;
    @JsonProperty
    Format targetLowPrice;
    @JsonProperty
    Format targetMeanPrice;
    @JsonProperty
    Format targetMedianPrice;
    @JsonProperty
    Format recommendationMean;
    @JsonProperty
    String recommendationKey;
    @JsonProperty
    LongFormat numberOfAnalystOpinions;
    @JsonProperty
    LongFormat totalCash;
    @JsonProperty
    Format totalCashPerShare;
    @JsonProperty
    LongFormat ebitda;
    @JsonProperty
    LongFormat totalDebt;
    @JsonProperty
    Format quickRatio;
    @JsonProperty
    Format currentRatio;
    @JsonProperty
    LongFormat totalRevenue;
    @JsonProperty
    Format debtToEquity;
    @JsonProperty
    Format revenuePerShare;
    @JsonProperty
    Format returnOnAssets;
    @JsonProperty
    Format returnOnEquity;
    @JsonProperty
    LongFormat grossProfits;
    @JsonProperty
    LongFormat freeCashflow;
    @JsonProperty
    LongFormat operatingCashflow;
    @JsonProperty
    Format earningsGrowth;
    @JsonProperty
    Format revenueGrowth;
    @JsonProperty
    Format grossMargins;
    @JsonProperty
    Format ebitdaMargins;
    @JsonProperty
    Format operatingMargins;
    @JsonProperty
    Format profitMargins;
    @JsonProperty
    String financialCurrency;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getCurrentPrice() {
        return currentPrice;
    }

    public Format getTargetHighPrice() {
        return targetHighPrice;
    }

    public Format getTargetLowPrice() {
        return targetLowPrice;
    }

    public Format getTargetMeanPrice() {
        return targetMeanPrice;
    }

    public Format getTargetMedianPrice() {
        return targetMedianPrice;
    }

    public Format getRecommendationMean() {
        return recommendationMean;
    }

    public String getRecommendationKey() {
        return recommendationKey;
    }

    public LongFormat getNumberOfAnalystOpinions() {
        return numberOfAnalystOpinions;
    }

    public LongFormat getTotalCash() {
        return totalCash;
    }

    public Format getTotalCashPerShare() {
        return totalCashPerShare;
    }

    public LongFormat getEbitda() {
        return ebitda;
    }

    public LongFormat getTotalDebt() {
        return totalDebt;
    }

    public Format getQuickRatio() {
        return quickRatio;
    }

    public Format getCurrentRatio() {
        return currentRatio;
    }

    public LongFormat getTotalRevenue() {
        return totalRevenue;
    }

    public Format getDebtToEquity() {
        return debtToEquity;
    }

    public Format getRevenuePerShare() {
        return revenuePerShare;
    }

    public Format getReturnOnAssets() {
        return returnOnAssets;
    }

    public Format getReturnOnEquity() {
        return returnOnEquity;
    }

    public LongFormat getGrossProfits() {
        return grossProfits;
    }

    public LongFormat getFreeCashflow() {
        return freeCashflow;
    }

    public LongFormat getOperatingCashflow() {
        return operatingCashflow;
    }

    public Format getEarningsGrowth() {
        return earningsGrowth;
    }

    public Format getRevenueGrowth() {
        return revenueGrowth;
    }

    public Format getGrossMargins() {
        return grossMargins;
    }

    public Format getEbitdaMargins() {
        return ebitdaMargins;
    }

    public Format getOperatingMargins() {
        return operatingMargins;
    }

    public Format getProfitMargins() {
        return profitMargins;
    }

    public String getFinancialCurrency() {
        return financialCurrency;
    }
}
