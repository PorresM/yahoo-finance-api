package fr.mporres.yahoofinanceapi.dto.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class News {
    @JsonProperty
    String uuid;
    @JsonProperty
    String title;
    @JsonProperty
    String publisher;
    @JsonProperty
    String link;
    @JsonProperty
    Integer providerPublishTime;
    @JsonProperty
    String type;
}
