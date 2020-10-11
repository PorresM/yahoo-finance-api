package fr.mporres.yahoofinanceapi;

public enum Modules {
    ASSET_PROFILE("assetProfile"),
    SUMMARY_PROFILE("summaryProfile"),
    SUMMARY_DETAIL("summaryDetail"),
    ESG_SCORE("esgScores"),
    PRICE("price"),
    INCOME_STATEMENT_HISTORY("incomeStatementHistory"),
    INCOME_STATEMENT_HISTORY_QUARTERLY("incomeStatementHistoryQuarterly"),
    BALANCE_SHEET_HISTORY("balanceSheetHistory"),
    BALANCE_SHEET_HISTORY_QUARTERLY("balanceSheetHistoryQuarterly"),
    CASH_FLOW_STATEMENT_HISTORY("cashflowStatementHistory"),
    CASH_FLOW_STATEMENT_HISTORY_QUARTERLY("cashflowStatementHistoryQuarterly"),
    DEFAULT_KEY_STATISTICS("defaultKeyStatistics"),
    FINANCIAL_DATA("financialData"),
    CALENDAR_EVENTS("calendarEvents"),
    SEC_FILINGS("secFilings"),
    RECOMMENDATION_TREND("recommendationTrend"),
    UPGRADE_DOWNGRADE_HISTORY("upgradeDowngradeHistory"),
    INSTITUTION_OWNERSHIP("institutionOwnership"),
    FUND_OWNERSHIP("fundOwnership"),
    MAJOR_DIRECT_HOLDERS("majorDirectHolders"),
    MAJOR_HOLDERS_BREAKDOWN("majorHoldersBreakdown"),
    INSIDER_TRANSACTIONS("insiderTransactions"),
    INSIDER_HOLDERS("insiderHolders"),
    NET_SHARE_PURCHASE_ACTIVITY("netSharePurchaseActivity"),
    EARNINGS("earnings"),
    EARNINGS_HISTORY("earningsHistory"),
    EARNINGS_TREND("earningsTrend"),
    INDUSTRY_TREND("industryTrend"),
    INDEX_TREND("indexTrend"),
    SECTOR_TREND("sectorTrend");

    Modules(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
