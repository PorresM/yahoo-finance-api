package fr.mporres.yahoofinanceapi.dto.incomestatement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeStatement {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format endDate;
    @JsonProperty
    LongFormat totalRevenue;
    @JsonProperty
    LongFormat costOfRevenue;
    @JsonProperty
    LongFormat grossProfit;
    @JsonProperty
    LongFormat researchDevelopment;
    @JsonProperty
    LongFormat sellingGeneralAdministrative;
    @JsonProperty
    LongFormat nonRecurring; // Not tested
    @JsonProperty
    LongFormat otherOperatingExpenses; // Not tested
    @JsonProperty
    LongFormat totalOperatingExpenses;
    @JsonProperty
    LongFormat operatingIncome;
    @JsonProperty
    LongFormat totalOtherIncomeExpenseNet;
    @JsonProperty
    LongFormat ebit;
    @JsonProperty
    LongFormat interestExpense;
    @JsonProperty
    LongFormat incomeBeforeTax;
    @JsonProperty
    LongFormat incomeTaxExpense;
    @JsonProperty
    LongFormat minorityInterest;
    @JsonProperty
    LongFormat netIncomeFromContinuingOps;
    @JsonProperty
    LongFormat discontinuedOperations; // Not tested
    @JsonProperty
    LongFormat extraordinaryItems; // Not tested
    @JsonProperty
    LongFormat effectOfAccountingCharges; // Not tested
    @JsonProperty
    LongFormat otherItems; // Not tested
    @JsonProperty
    LongFormat netIncome;
    @JsonProperty
    LongFormat netIncomeApplicableToCommonShares;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getEndDate() {
        return endDate;
    }

    public LongFormat getTotalRevenue() {
        return totalRevenue;
    }

    public LongFormat getCostOfRevenue() {
        return costOfRevenue;
    }

    public LongFormat getGrossProfit() {
        return grossProfit;
    }

    public LongFormat getResearchDevelopment() {
        return researchDevelopment;
    }

    public LongFormat getSellingGeneralAdministrative() {
        return sellingGeneralAdministrative;
    }

    public LongFormat getNonRecurring() {
        return nonRecurring;
    }

    public LongFormat getOtherOperatingExpenses() {
        return otherOperatingExpenses;
    }

    public LongFormat getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    public LongFormat getOperatingIncome() {
        return operatingIncome;
    }

    public LongFormat getTotalOtherIncomeExpenseNet() {
        return totalOtherIncomeExpenseNet;
    }

    public LongFormat getEbit() {
        return ebit;
    }

    public LongFormat getInterestExpense() {
        return interestExpense;
    }

    public LongFormat getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    public LongFormat getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public LongFormat getMinorityInterest() {
        return minorityInterest;
    }

    public LongFormat getNetIncomeFromContinuingOps() {
        return netIncomeFromContinuingOps;
    }

    public LongFormat getDiscontinuedOperations() {
        return discontinuedOperations;
    }

    public LongFormat getExtraordinaryItems() {
        return extraordinaryItems;
    }

    public LongFormat getEffectOfAccountingCharges() {
        return effectOfAccountingCharges;
    }

    public LongFormat getOtherItems() {
        return otherItems;
    }

    public LongFormat getNetIncome() {
        return netIncome;
    }

    public LongFormat getNetIncomeApplicableToCommonShares() {
        return netIncomeApplicableToCommonShares;
    }
}
