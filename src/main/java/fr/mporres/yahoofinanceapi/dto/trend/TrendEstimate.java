package fr.mporres.yahoofinanceapi.dto.trend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrendEstimate {
    @JsonProperty
    String period;
    @JsonProperty
    Format growth;

    public String getPeriod() {
        return period;
    }

    public Format getGrowth() {
        return growth;
    }
}
