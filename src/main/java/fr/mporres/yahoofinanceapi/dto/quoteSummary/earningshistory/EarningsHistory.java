package fr.mporres.yahoofinanceapi.dto.quoteSummary.earningshistory;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsHistory {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format epsActual;
    @JsonProperty
    Format epsEstimate;
    @JsonProperty
    Format epsDifference;
    @JsonProperty
    Format surprisePercent;
    @JsonProperty
    Format quarter;
    @JsonProperty
    String period;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getEpsActual() {
        return epsActual;
    }

    public Format getEpsEstimate() {
        return epsEstimate;
    }

    public Format getEpsDifference() {
        return epsDifference;
    }

    public Format getSurprisePercent() {
        return surprisePercent;
    }

    public Format getQuarter() {
        return quarter;
    }

    public String getPeriod() {
        return period;
    }
}
