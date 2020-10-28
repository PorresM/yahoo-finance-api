package fr.mporres.yahoofinanceapi.dto.quoteSummary.earningstrand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EpsTrend {
    @JsonProperty
    Format current;
    @JsonProperty("7daysAgo")
    Format seventDaysAgo;
    @JsonProperty("30daysAgo")
    Format thirtyDaysAgo;
    @JsonProperty("60daysAgo")
    Format sixtyDaysAgo;
    @JsonProperty("90daysAgo")
    Format ninetyDaysAgo;

    public Format getCurrent() {
        return current;
    }

    public Format getSeventDaysAgo() {
        return seventDaysAgo;
    }

    public Format getThirtyDaysAgo() {
        return thirtyDaysAgo;
    }

    public Format getSixtyDaysAgo() {
        return sixtyDaysAgo;
    }

    public Format getNinetyDaysAgo() {
        return ninetyDaysAgo;
    }
}
