package fr.mporres.yahoofinanceapi.dto.keystatistics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DefaultKeyStatistics {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    LongFormat priceHint;
    @JsonProperty
    LongFormat enterpriseValue;
    @JsonProperty
    Format forwardPE;
    @JsonProperty
    Format profitMargins;
    @JsonProperty
    LongFormat floatShares;
    @JsonProperty
    LongFormat sharesOutstanding;
    @JsonProperty
    LongFormat sharesShort;
    @JsonProperty
    LongFormat sharesShortPriorMonth;
    @JsonProperty
    Format sharesShortPreviousMonthDate;
    @JsonProperty
    Format dateShortInterest;
    @JsonProperty
    Format sharesPercentSharesOut;
    @JsonProperty
    Format heldPercentInsiders;
    @JsonProperty
    Format heldPercentInstitutions;
    @JsonProperty
    Format shortRatio;
    @JsonProperty
    Format shortPercentOfFloat;
    @JsonProperty
    Format beta;
    @JsonProperty
    LongFormat morningStarOverallRating; // Not tested
    @JsonProperty
    LongFormat morningStarRiskRating; // Not tested
    @JsonProperty
    String category; // Not tested
    @JsonProperty
    Format bookValue;
    @JsonProperty
    Format priceToBook;
    @JsonProperty
    LongFormat annualReportExpenseRatio; // Not tested
    @JsonProperty
    LongFormat ytdReturn; // Not tested
    @JsonProperty
    Format beta3Year; // Not tested
    @JsonProperty
    LongFormat totalAssets; // Not tested
    @JsonProperty
    LongFormat yield; // Not tested
    @JsonProperty
    String fundFamily; // Not tested
    @JsonProperty
    Format fundInceptionDate; // Not tested
    @JsonProperty
    String legalType; // Not tested
    @JsonProperty
    LongFormat threeYearAverageReturn; // Not tested
    @JsonProperty
    LongFormat fiveYearAverageReturn; // Not tested
    @JsonProperty
    Format priceToSalesTrailing12Months; // Not tested
    @JsonProperty
    Format lastFiscalYearEnd;
    @JsonProperty
    Format nextFiscalYearEnd;
    @JsonProperty
    Format mostRecentQuarter;
    @JsonProperty
    Format earningsQuarterlyGrowth;
    @JsonProperty
    LongFormat revenueQuarterlyGrowth; // Not tested
    @JsonProperty
    LongFormat netIncomeToCommon;
    @JsonProperty
    Format trailingEps;
    @JsonProperty
    Format forwardEps;
    @JsonProperty
    Format pegRatio;
    @JsonProperty
    String lastSplitFactor;
    @JsonProperty
    Format lastSplitDate;
    @JsonProperty
    Format enterpriseToRevenue;
    @JsonProperty
    Format enterpriseToEbitda;
    @JsonProperty("52WeekChange")
    Format weekChange;
    @JsonProperty("SandP52WeekChange")
    Format sandP52WeekChange;
    @JsonProperty
    Format lastDividendValue;
    @JsonProperty
    Format lastDividendDate;
    @JsonProperty
    LongFormat lastCapGain; // Not tested
    @JsonProperty
    LongFormat annualHoldingsTurnover; // Not tested


    public Integer getMaxAge() {
        return maxAge;
    }

    public LongFormat getPriceHint() {
        return priceHint;
    }

    public LongFormat getEnterpriseValue() {
        return enterpriseValue;
    }

    public Format getForwardPE() {
        return forwardPE;
    }

    public Format getProfitMargins() {
        return profitMargins;
    }

    public LongFormat getFloatShares() {
        return floatShares;
    }

    public LongFormat getSharesOutstanding() {
        return sharesOutstanding;
    }

    public LongFormat getSharesShort() {
        return sharesShort;
    }

    public LongFormat getSharesShortPriorMonth() {
        return sharesShortPriorMonth;
    }

    public Format getSharesShortPreviousMonthDate() {
        return sharesShortPreviousMonthDate;
    }

    public Format getDateShortInterest() {
        return dateShortInterest;
    }

    public Format getSharesPercentSharesOut() {
        return sharesPercentSharesOut;
    }

    public Format getHeldPercentInsiders() {
        return heldPercentInsiders;
    }

    public Format getHeldPercentInstitutions() {
        return heldPercentInstitutions;
    }

    public Format getShortRatio() {
        return shortRatio;
    }

    public Format getShortPercentOfFloat() {
        return shortPercentOfFloat;
    }

    public Format getBeta() {
        return beta;
    }

    public LongFormat getMorningStarOverallRating() {
        return morningStarOverallRating;
    }

    public LongFormat getMorningStarRiskRating() {
        return morningStarRiskRating;
    }

    public String getCategory() {
        return category;
    }

    public Format getBookValue() {
        return bookValue;
    }

    public Format getPriceToBook() {
        return priceToBook;
    }

    public LongFormat getAnnualReportExpenseRatio() {
        return annualReportExpenseRatio;
    }

    public LongFormat getYtdReturn() {
        return ytdReturn;
    }

    public Format getBeta3Year() {
        return beta3Year;
    }

    public LongFormat getTotalAssets() {
        return totalAssets;
    }

    public LongFormat getYield() {
        return yield;
    }

    public String getFundFamily() {
        return fundFamily;
    }

    public Format getFundInceptionDate() {
        return fundInceptionDate;
    }

    public String getLegalType() {
        return legalType;
    }

    public LongFormat getThreeYearAverageReturn() {
        return threeYearAverageReturn;
    }

    public LongFormat getFiveYearAverageReturn() {
        return fiveYearAverageReturn;
    }

    public Format getPriceToSalesTrailing12Months() {
        return priceToSalesTrailing12Months;
    }

    public Format getLastFiscalYearEnd() {
        return lastFiscalYearEnd;
    }

    public Format getNextFiscalYearEnd() {
        return nextFiscalYearEnd;
    }

    public Format getMostRecentQuarter() {
        return mostRecentQuarter;
    }

    public Format getEarningsQuarterlyGrowth() {
        return earningsQuarterlyGrowth;
    }

    public LongFormat getRevenueQuarterlyGrowth() {
        return revenueQuarterlyGrowth;
    }

    public LongFormat getNetIncomeToCommon() {
        return netIncomeToCommon;
    }

    public Format getTrailingEps() {
        return trailingEps;
    }

    public Format getForwardEps() {
        return forwardEps;
    }

    public Format getPegRatio() {
        return pegRatio;
    }

    public String getLastSplitFactor() {
        return lastSplitFactor;
    }

    public Format getLastSplitDate() {
        return lastSplitDate;
    }

    public Format getEnterpriseToRevenue() {
        return enterpriseToRevenue;
    }

    public Format getEnterpriseToEbitda() {
        return enterpriseToEbitda;
    }

    public Format getWeekChange() {
        return weekChange;
    }

    public Format getSandP52WeekChange() {
        return sandP52WeekChange;
    }

    public Format getLastDividendValue() {
        return lastDividendValue;
    }

    public Format getLastDividendDate() {
        return lastDividendDate;
    }

    public LongFormat getLastCapGain() {
        return lastCapGain;
    }

    public LongFormat getAnnualHoldingsTurnover() {
        return annualHoldingsTurnover;
    }
}
