package fr.mporres.yahoofinanceapi.dto.price;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format preMarketChange; // Not tested
    @JsonProperty
    Format preMarketPrice; // Not tested
    @JsonProperty
    String preMarketSource;
    @JsonProperty
    Format postMarketChangePercent;
    @JsonProperty
    Format postMarketChange;
    @JsonProperty
    Integer postMarketTime;
    @JsonProperty
    Format postMarketPrice;
    @JsonProperty
    String postMarketSource;
    @JsonProperty
    Format regularMarketChangePercent;
    @JsonProperty
    Format regularMarketChange;
    @JsonProperty
    Integer regularMarketTime;
    @JsonProperty
    LongFormat priceHint;
    @JsonProperty
    Format regularMarketPrice;
    @JsonProperty
    Format regularMarketDayHigh;
    @JsonProperty
    Format regularMarketDayLow;
    @JsonProperty
    LongFormat regularMarketVolume;
    @JsonProperty
    LongFormat averageDailyVolume10Day;
    @JsonProperty
    LongFormat averageDailyVolume3Month;
    @JsonProperty
    Format regularMarketPreviousClose;
    @JsonProperty
    String regularMarketSource;
    @JsonProperty
    Format regularMarketOpen;
    @JsonProperty
    LongFormat strikePrice; // Not tested
    @JsonProperty
    LongFormat openInterest; // Not tested
    @JsonProperty
    String exchange;
    @JsonProperty
    String exchangeName;
    @JsonProperty
    Integer exchangeDataDelayedBy;
    @JsonProperty
    String marketState;
    @JsonProperty
    String quoteType;
    @JsonProperty
    String symbol;
    @JsonProperty
    String underlyingSymbol; // Not tested
    @JsonProperty
    String shortName;
    @JsonProperty
    String longName;
    @JsonProperty
    String currency;
    @JsonProperty
    String quoteSourceName;
    @JsonProperty
    String currencySymbol;
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
    LongFormat marketCap;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getPreMarketChange() {
        return preMarketChange;
    }

    public Format getPreMarketPrice() {
        return preMarketPrice;
    }

    public String getPreMarketSource() {
        return preMarketSource;
    }

    public Format getPostMarketChangePercent() {
        return postMarketChangePercent;
    }

    public Format getPostMarketChange() {
        return postMarketChange;
    }

    public Integer getPostMarketTime() {
        return postMarketTime;
    }

    public Format getPostMarketPrice() {
        return postMarketPrice;
    }

    public String getPostMarketSource() {
        return postMarketSource;
    }

    public Format getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public Format getRegularMarketChange() {
        return regularMarketChange;
    }

    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    public LongFormat getPriceHint() {
        return priceHint;
    }

    public Format getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public Format getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public Format getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public LongFormat getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public LongFormat getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public LongFormat getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    public Format getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public String getRegularMarketSource() {
        return regularMarketSource;
    }

    public Format getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public LongFormat getStrikePrice() {
        return strikePrice;
    }

    public LongFormat getOpenInterest() {
        return openInterest;
    }

    public String getExchange() {
        return exchange;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public Integer getExchangeDataDelayedBy() {
        return exchangeDataDelayedBy;
    }

    public String getMarketState() {
        return marketState;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getUnderlyingSymbol() {
        return underlyingSymbol;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public String getCurrency() {
        return currency;
    }

    public String getQuoteSourceName() {
        return quoteSourceName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
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

    public LongFormat getMarketCap() {
        return marketCap;
    }
}
