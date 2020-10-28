package fr.mporres.yahoofinanceapi.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResult {
    @JsonProperty
    List<Quote> quotes;

    @JsonProperty
    List<News> news;

    @JsonProperty
    Finance finance;

    public List<Quote> getQuotes() {
        return quotes;
    }

    public List<News> getNews() {
        return news;
    }

    public Finance getFinance() {
        return finance;
    }
}
