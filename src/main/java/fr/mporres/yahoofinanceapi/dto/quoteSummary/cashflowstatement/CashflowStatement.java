package fr.mporres.yahoofinanceapi.dto.quoteSummary.cashflowstatement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CashflowStatement {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format endDate;
    @JsonProperty
    LongFormat netIncome;
    @JsonProperty
    LongFormat depreciation;
    @JsonProperty
    LongFormat changeToNetincome;
    @JsonProperty
    LongFormat changeToAccountReceivables;
    @JsonProperty
    LongFormat changeToLiabilities;
    @JsonProperty
    LongFormat changeToInventory;
    @JsonProperty
    LongFormat changeToOperatingActivities;
    @JsonProperty
    LongFormat totalCashFromOperatingActivities;
    @JsonProperty
    LongFormat capitalExpenditures;
    @JsonProperty
    LongFormat investments;
    @JsonProperty
    LongFormat otherCashflowsFromInvestingActivities;
    @JsonProperty
    LongFormat totalCashflowsFromInvestingActivities;
    @JsonProperty
    LongFormat dividendsPaid;
    @JsonProperty
    LongFormat netBorrowings;
    @JsonProperty
    LongFormat otherCashflowsFromFinancingActivities;
    @JsonProperty
    LongFormat totalCashFromFinancingActivities;
    @JsonProperty
    LongFormat effectOfExchangeRate;
    @JsonProperty
    LongFormat changeInCash;
    @JsonProperty
    LongFormat repurchaseOfStock;
    @JsonProperty
    LongFormat issuanceOfStock;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getEndDate() {
        return endDate;
    }

    public LongFormat getNetIncome() {
        return netIncome;
    }

    public LongFormat getDepreciation() {
        return depreciation;
    }

    public LongFormat getChangeToNetincome() {
        return changeToNetincome;
    }

    public LongFormat getChangeToAccountReceivables() {
        return changeToAccountReceivables;
    }

    public LongFormat getChangeToLiabilities() {
        return changeToLiabilities;
    }

    public LongFormat getChangeToInventory() {
        return changeToInventory;
    }

    public LongFormat getChangeToOperatingActivities() {
        return changeToOperatingActivities;
    }

    public LongFormat getTotalCashFromOperatingActivities() {
        return totalCashFromOperatingActivities;
    }

    public LongFormat getCapitalExpenditures() {
        return capitalExpenditures;
    }

    public LongFormat getInvestments() {
        return investments;
    }

    public LongFormat getOtherCashflowsFromInvestingActivities() {
        return otherCashflowsFromInvestingActivities;
    }

    public LongFormat getTotalCashflowsFromInvestingActivities() {
        return totalCashflowsFromInvestingActivities;
    }

    public LongFormat getDividendsPaid() {
        return dividendsPaid;
    }

    public LongFormat getNetBorrowings() {
        return netBorrowings;
    }

    public LongFormat getOtherCashflowsFromFinancingActivities() {
        return otherCashflowsFromFinancingActivities;
    }

    public LongFormat getTotalCashFromFinancingActivities() {
        return totalCashFromFinancingActivities;
    }

    public LongFormat getEffectOfExchangeRate() {
        return effectOfExchangeRate;
    }

    public LongFormat getChangeInCash() {
        return changeInCash;
    }

    public LongFormat getRepurchaseOfStock() {
        return repurchaseOfStock;
    }

    public LongFormat getIssuanceOfStock() {
        return issuanceOfStock;
    }
}
