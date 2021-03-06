package fr.mporres.yahoofinanceapi.dto.quoteSummary.breakdown;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MajorHoldersBreakdown {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format insidersPercentHeld;
    @JsonProperty
    Format institutionsPercentHeld;
    @JsonProperty
    Format institutionsFloatPercentHeld;
    @JsonProperty
    LongFormat institutionsCount;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getInsidersPercentHeld() {
        return insidersPercentHeld;
    }

    public Format getInstitutionsPercentHeld() {
        return institutionsPercentHeld;
    }

    public Format getInstitutionsFloatPercentHeld() {
        return institutionsFloatPercentHeld;
    }

    public LongFormat getInstitutionsCount() {
        return institutionsCount;
    }
}
