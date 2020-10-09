package com.kipos.yahoofinanceapi.dto.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kipos.yahoofinanceapi.dto.balancesheet.BalanceSheetStatementWrapper;
import com.kipos.yahoofinanceapi.dto.breakdown.MajorHoldersBreakdown;
import com.kipos.yahoofinanceapi.dto.calendarevents.CalendarEvents;
import com.kipos.yahoofinanceapi.dto.cashflowstatement.CashflowStatementWrapper;
import com.kipos.yahoofinanceapi.dto.earnings.Earnings;
import com.kipos.yahoofinanceapi.dto.earningshistory.EarningsHistoryWrapper;
import com.kipos.yahoofinanceapi.dto.earningstrand.EarningsTrendWrapper;
import com.kipos.yahoofinanceapi.dto.esgscores.EsgScores;
import com.kipos.yahoofinanceapi.dto.financialdata.FinancialData;
import com.kipos.yahoofinanceapi.dto.ownership.OwnershipWrapper;
import com.kipos.yahoofinanceapi.dto.holders.HoldersWrapper;
import com.kipos.yahoofinanceapi.dto.incomestatement.IncomeStatementWrapper;
import com.kipos.yahoofinanceapi.dto.keystatistics.DefaultKeyStatistics;
import com.kipos.yahoofinanceapi.dto.price.Price;
import com.kipos.yahoofinanceapi.dto.profile.SummaryProfile;
import com.kipos.yahoofinanceapi.dto.secfilings.FilingsWrapper;
import com.kipos.yahoofinanceapi.dto.share.NetSharePurchaseActivity;
import com.kipos.yahoofinanceapi.dto.summarydetail.SummaryDetail;
import com.kipos.yahoofinanceapi.dto.transaction.TransactionWrapper;
import com.kipos.yahoofinanceapi.dto.trend.Trend;
import com.kipos.yahoofinanceapi.dto.recommendationtrend.RecommendationTrendWrapper;
import com.kipos.yahoofinanceapi.dto.profile.AssetProfile;
import com.kipos.yahoofinanceapi.dto.upgradedowngrade.UpgradeDowngradeWrapper;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    @JsonProperty
    AssetProfile assetProfile;
    @JsonProperty
    RecommendationTrendWrapper recommendationTrend;
    @JsonProperty
    CashflowStatementWrapper cashflowStatementHistory;
    @JsonProperty
    Trend indexTrend;
    @JsonProperty
    DefaultKeyStatistics defaultKeyStatistics;
    @JsonProperty
    Trend industryTrend;
    @JsonProperty
    IncomeStatementWrapper incomeStatementHistory;
    @JsonProperty
    OwnershipWrapper fundOwnership;
    @JsonProperty
    SummaryDetail summaryDetail;
    @JsonProperty
    HoldersWrapper insiderHolders;
    @JsonProperty
    CalendarEvents calendarEvents;
    @JsonProperty
    UpgradeDowngradeWrapper upgradeDowngradeHistory;
    @JsonProperty
    Price price;
    @JsonProperty
    BalanceSheetStatementWrapper balanceSheetHistory;
    @JsonProperty
    EarningsTrendWrapper earningsTrend;
    @JsonProperty
    FilingsWrapper secFilings;
    @JsonProperty
    OwnershipWrapper institutionOwnership;
    @JsonProperty
    MajorHoldersBreakdown majorHoldersBreakdown;
    @JsonProperty
    BalanceSheetStatementWrapper balanceSheetHistoryQuarterly;
    @JsonProperty
    EarningsHistoryWrapper earningsHistory;
    @JsonProperty
    HoldersWrapper majorDirectHolders;
    @JsonProperty
    EsgScores esgScores;
    @JsonProperty
    SummaryProfile summaryProfile;
    @JsonProperty
    NetSharePurchaseActivity netSharePurchaseActivity;
    @JsonProperty
    TransactionWrapper insiderTransactions;
    @JsonProperty
    Trend sectorTrend;
    @JsonProperty
    IncomeStatementWrapper incomeStatementHistoryQuarterly;
    @JsonProperty
    CashflowStatementWrapper cashflowStatementHistoryQuarterly;
    @JsonProperty
    Earnings earnings;
    @JsonProperty
    FinancialData financialData;

    public AssetProfile getAssetProfile() {
        return assetProfile;
    }

    public RecommendationTrendWrapper getRecommendationTrend() {
        return recommendationTrend;
    }

    public CashflowStatementWrapper getCashflowStatementHistory() {
        return cashflowStatementHistory;
    }

    public Trend getIndexTrend() {
        return indexTrend;
    }

    public DefaultKeyStatistics getDefaultKeyStatistics() {
        return defaultKeyStatistics;
    }

    public Trend getIndustryTrend() {
        return industryTrend;
    }

    public IncomeStatementWrapper getIncomeStatementHistory() {
        return incomeStatementHistory;
    }

    public OwnershipWrapper getFundOwnership() {
        return fundOwnership;
    }

    public SummaryDetail getSummaryDetail() {
        return summaryDetail;
    }

    public HoldersWrapper getInsiderHolders() {
        return insiderHolders;
    }

    public CalendarEvents getCalendarEvents() {
        return calendarEvents;
    }

    public UpgradeDowngradeWrapper getUpgradeDowngradeHistory() {
        return upgradeDowngradeHistory;
    }

    public Price getPrice() {
        return price;
    }

    public BalanceSheetStatementWrapper getBalanceSheetHistory() {
        return balanceSheetHistory;
    }

    public EarningsTrendWrapper getEarningsTrend() {
        return earningsTrend;
    }

    public FilingsWrapper getSecFilings() {
        return secFilings;
    }

    public OwnershipWrapper getInstitutionOwnership() {
        return institutionOwnership;
    }

    public MajorHoldersBreakdown getMajorHoldersBreakdown() {
        return majorHoldersBreakdown;
    }

    public BalanceSheetStatementWrapper getBalanceSheetHistoryQuarterly() {
        return balanceSheetHistoryQuarterly;
    }

    public EarningsHistoryWrapper getEarningsHistory() {
        return earningsHistory;
    }

    public HoldersWrapper getMajorDirectHolders() {
        return majorDirectHolders;
    }

    public EsgScores getEsgScores() {
        return esgScores;
    }

    public SummaryProfile getSummaryProfile() {
        return summaryProfile;
    }

    public NetSharePurchaseActivity getNetSharePurchaseActivity() {
        return netSharePurchaseActivity;
    }

    public TransactionWrapper getInsiderTransactions() {
        return insiderTransactions;
    }

    public Trend getSectorTrend() {
        return sectorTrend;
    }

    public IncomeStatementWrapper getIncomeStatementHistoryQuarterly() {
        return incomeStatementHistoryQuarterly;
    }

    public CashflowStatementWrapper getCashflowStatementHistoryQuarterly() {
        return cashflowStatementHistoryQuarterly;
    }

    public Earnings getEarnings() {
        return earnings;
    }

    public FinancialData getFinancialData() {
        return financialData;
    }
}