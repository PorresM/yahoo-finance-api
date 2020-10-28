package fr.mporres.yahoofinanceapi.dto.quoteSummary.balancesheet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceSheetStatement {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format endDate;
    @JsonProperty
    LongFormat cash;
    @JsonProperty
    LongFormat shortTermInvestments;
    @JsonProperty
    LongFormat netReceivables;
    @JsonProperty
    LongFormat inventory;
    @JsonProperty
    LongFormat otherCurrentAssets;
    @JsonProperty
    LongFormat totalCurrentAssets;
    @JsonProperty
    LongFormat longTermInvestments;
    @JsonProperty
    LongFormat propertyPlantEquipment;
    @JsonProperty
    LongFormat goodWill;
    @JsonProperty
    LongFormat intangibleAssets;
    @JsonProperty
    LongFormat otherAssets;
    @JsonProperty
    LongFormat deferredLongTermAssetCharges;
    @JsonProperty
    LongFormat totalAssets;
    @JsonProperty
    LongFormat accountsPayable;
    @JsonProperty
    LongFormat shortLongTermDebt;
    @JsonProperty
    LongFormat otherCurrentLiab;
    @JsonProperty
    LongFormat longTermDebt;
    @JsonProperty
    LongFormat otherLiab;
    @JsonProperty
    LongFormat minorityInterest;
    @JsonProperty
    LongFormat totalCurrentLiabilities;
    @JsonProperty
    LongFormat totalLiab;
    @JsonProperty
    LongFormat commonStock;
    @JsonProperty
    LongFormat retainedEarnings;
    @JsonProperty
    LongFormat treasuryStock;
    @JsonProperty
    LongFormat capitalSurplus;
    @JsonProperty
    LongFormat otherStockholderEquity;
    @JsonProperty
    LongFormat totalStockholderEquity;
    @JsonProperty
    LongFormat netTangibleAssets;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getEndDate() {
        return endDate;
    }

    public LongFormat getCash() {
        return cash;
    }

    public LongFormat getShortTermInvestments() {
        return shortTermInvestments;
    }

    public LongFormat getNetReceivables() {
        return netReceivables;
    }

    public LongFormat getInventory() {
        return inventory;
    }

    public LongFormat getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    public LongFormat getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    public LongFormat getLongTermInvestments() {
        return longTermInvestments;
    }

    public LongFormat getPropertyPlantEquipment() {
        return propertyPlantEquipment;
    }

    public LongFormat getGoodWill() {
        return goodWill;
    }

    public LongFormat getIntangibleAssets() {
        return intangibleAssets;
    }

    public LongFormat getOtherAssets() {
        return otherAssets;
    }

    public LongFormat getDeferredLongTermAssetCharges() {
        return deferredLongTermAssetCharges;
    }

    public LongFormat getTotalAssets() {
        return totalAssets;
    }

    public LongFormat getAccountsPayable() {
        return accountsPayable;
    }

    public LongFormat getShortLongTermDebt() {
        return shortLongTermDebt;
    }

    public LongFormat getOtherCurrentLiab() {
        return otherCurrentLiab;
    }

    public LongFormat getLongTermDebt() {
        return longTermDebt;
    }

    public LongFormat getOtherLiab() {
        return otherLiab;
    }

    public LongFormat getMinorityInterest() {
        return minorityInterest;
    }

    public LongFormat getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    public LongFormat getTotalLiab() {
        return totalLiab;
    }

    public LongFormat getCommonStock() {
        return commonStock;
    }

    public LongFormat getRetainedEarnings() {
        return retainedEarnings;
    }

    public LongFormat getTreasuryStock() {
        return treasuryStock;
    }

    public LongFormat getCapitalSurplus() {
        return capitalSurplus;
    }

    public LongFormat getOtherStockholderEquity() {
        return otherStockholderEquity;
    }

    public LongFormat getTotalStockholderEquity() {
        return totalStockholderEquity;
    }

    public LongFormat getNetTangibleAssets() {
        return netTangibleAssets;
    }
}
