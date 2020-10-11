# Yahoo Finance API [![Build Status](https://travis-ci.org/PorresM/yahoo-finance-api.svg?branch=develop)](https://travis-ci.org/PorresM/yahoo-finance-api)

Library for accessing stock market data using the Yahoo Finance API.

## Dependencies

* [Jackson Databind](https://github.com/FasterXML/jackson-databind)

## Usage

The `fetch` method requires a stock symbol followed by Modules provided as varargs.

### Example

The following example requests `summaryProfile` and `price` modules using the Yahoo Finance API.

```java
import com.mporres.yahoofinanceapi.*;

public static void main(String[] args) {
    QuoteSummary quoteSummary = YahooFinanceApi.fetch(
            "AAPL",
            Modules.SUMMARY_PROFILE,
            Modules.PRICE);

    SummaryProfile summaryProfile = quoteSummary.getResult().get(0).getSummaryProfile();
    Price price = quoteSummary.getResult().get(0).getPrice();

    System.out.println(price.getShortName());
    System.out.println(price.getSymbol());
    System.out.println(summaryProfile.getIndustry());
    System.out.println(summaryProfile.getSector());
}
```

Here is the result:

```shell
Apple Inc.
AAPL
Consumer Electronics
Technology
```

### Modules available

* assetProfile
* summaryProfile
* summaryDetail
* esgScores
* price
* incomeStatementHistory
* incomeStatementHistoryQuarterly
* balanceSheetHistory
* balanceSheetHistoryQuarterly
* cashflowStatementHistory
* cashflowStatementHistoryQuarterly
* defaultKeyStatistics
* financialData
* calendarEvents
* secFilings
* recommendationTrend
* upgradeDowngradeHistory
* institutionOwnership
* fundOwnership
* majorDirectHolders
* majorHoldersBreakdown
* insiderTransactions
* insiderHolders
* netSharePurchaseActivity
* earnings
* earningsHistory
* earningsTrend
* industryTrend
* indexTrend
* sectorTrend
