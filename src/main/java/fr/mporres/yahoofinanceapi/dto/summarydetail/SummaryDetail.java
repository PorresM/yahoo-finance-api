package fr.mporres.yahoofinanceapi.dto.summarydetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryDetail {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    LongFormat priceHint;
    @JsonProperty
    Format previousClose;
    @JsonProperty
    Format open;
    @JsonProperty
    Format dayLow;
    @JsonProperty
    Format dayHigh;
    @JsonProperty
    Format regularMarketPreviousClose;
    @JsonProperty
    Format regularMarketOpen;
    @JsonProperty
    Format regularMarketDayLow;
    @JsonProperty
    Format regularMarketDayHigh;
    @JsonProperty
    Format dividendRate;
    @JsonProperty
    Format dividendYield;
    @JsonProperty
    Format exDividendDate;
    @JsonProperty
    Format payoutRatio;
    @JsonProperty
    Format fiveYearAvgDividendYield;
    @JsonProperty
    Format beta;
    @JsonProperty
    Format trailingPE;
    @JsonProperty
    Format forwardPE;
    @JsonProperty
    LongFormat volume;
    @JsonProperty
    LongFormat regularMarketVolume;
    @JsonProperty
    LongFormat averageVolume;
    @JsonProperty
    LongFormat averageVolume10days;
    @JsonProperty
    LongFormat averageDailyVolume10Day;
    @JsonProperty
    Format bid;
    @JsonProperty
    Format ask;
    @JsonProperty
    LongFormat bidSize;
    @JsonProperty
    LongFormat askSize;
    @JsonProperty
    LongFormat marketCap;
    @JsonProperty
    LongFormat yield; // Not tested
    @JsonProperty
    LongFormat ytdReturn; // Not tested
    @JsonProperty
    LongFormat totalAssets; // Not tested
    @JsonProperty
    Format expireDate; // Not tested
    @JsonProperty
    LongFormat strikePrice; // Not tested
    @JsonProperty
    LongFormat openInterest; // Not tested
    @JsonProperty
    Format fiftyTwoWeekLow;
    @JsonProperty
    Format fiftyTwoWeekHigh;
    @JsonProperty
    Format priceToSalesTrailing12Months;
    @JsonProperty
    Format fiftyDayAverage;
    @JsonProperty
    Format twoHundredDayAverage;
    @JsonProperty
    Format trailingAnnualDividendRate;
    @JsonProperty
    Format trailingAnnualDividendYield;
    @JsonProperty
    LongFormat navPrice; // Not tested
    @JsonProperty
    String currency;
    @JsonProperty
    String fromCurrency; // Not tested
    @JsonProperty
    String toCurrency; // Not tested
    @JsonProperty
    String lastMarket; // Not tested
    @JsonProperty
    LongFormat volume24Hr; // Not tested
    @JsonProperty
    LongFormat volumeAllCurrencies; // Not tested
    @JsonProperty
    LongFormat circulatingSupply; // Not tested
    @JsonProperty
    String algorithm; // Not tested
    @JsonProperty
    LongFormat maxSupply; // Not tested
    @JsonProperty
    LongFormat startDate; // Not tested
    @JsonProperty
    Boolean tradeable;

    public Integer getMaxAge() {
        return maxAge;
    }

    public LongFormat getPriceHint() {
        return priceHint;
    }

    public Format getPreviousClose() {
        return previousClose;
    }

    public Format getOpen() {
        return open;
    }

    public Format getDayLow() {
        return dayLow;
    }

    public Format getDayHigh() {
        return dayHigh;
    }

    public Format getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public Format getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public Format getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public Format getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public Format getDividendRate() {
        return dividendRate;
    }

    public Format getDividendYield() {
        return dividendYield;
    }

    public Format getExDividendDate() {
        return exDividendDate;
    }

    public Format getPayoutRatio() {
        return payoutRatio;
    }

    public Format getFiveYearAvgDividendYield() {
        return fiveYearAvgDividendYield;
    }

    public Format getBeta() {
        return beta;
    }

    public Format getTrailingPE() {
        return trailingPE;
    }

    public Format getForwardPE() {
        return forwardPE;
    }

    public LongFormat getVolume() {
        return volume;
    }

    public LongFormat getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public LongFormat getAverageVolume() {
        return averageVolume;
    }

    public LongFormat getAverageVolume10days() {
        return averageVolume10days;
    }

    public LongFormat getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public Format getBid() {
        return bid;
    }

    public Format getAsk() {
        return ask;
    }

    public LongFormat getBidSize() {
        return bidSize;
    }

    public LongFormat getAskSize() {
        return askSize;
    }

    public LongFormat getMarketCap() {
        return marketCap;
    }

    public LongFormat getYield() {
        return yield;
    }

    public LongFormat getYtdReturn() {
        return ytdReturn;
    }

    public LongFormat getTotalAssets() {
        return totalAssets;
    }

    public Format getExpireDate() {
        return expireDate;
    }

    public LongFormat getStrikePrice() {
        return strikePrice;
    }

    public LongFormat getOpenInterest() {
        return openInterest;
    }

    public Format getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public Format getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public Format getPriceToSalesTrailing12Months() {
        return priceToSalesTrailing12Months;
    }

    public Format getFiftyDayAverage() {
        return fiftyDayAverage;
    }

    public Format getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    public Format getTrailingAnnualDividendRate() {
        return trailingAnnualDividendRate;
    }

    public Format getTrailingAnnualDividendYield() {
        return trailingAnnualDividendYield;
    }

    public LongFormat getNavPrice() {
        return navPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public String getLastMarket() {
        return lastMarket;
    }

    public LongFormat getVolume24Hr() {
        return volume24Hr;
    }

    public LongFormat getVolumeAllCurrencies() {
        return volumeAllCurrencies;
    }

    public LongFormat getCirculatingSupply() {
        return circulatingSupply;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public LongFormat getMaxSupply() {
        return maxSupply;
    }

    public LongFormat getStartDate() {
        return startDate;
    }

    public Boolean getTradeable() {
        return tradeable;
    }
}
