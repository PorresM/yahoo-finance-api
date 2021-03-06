package fr.mporres.yahoofinanceapi.dto.quoteSummary.ownership;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ownership {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format reportDate;
    @JsonProperty
    String organization;
    @JsonProperty
    Format pctHeld;
    @JsonProperty
    LongFormat position;
    @JsonProperty
    LongFormat value;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getReportDate() {
        return reportDate;
    }

    public String getOrganization() {
        return organization;
    }

    public Format getPctHeld() {
        return pctHeld;
    }

    public LongFormat getPosition() {
        return position;
    }

    public LongFormat getValue() {
        return value;
    }
}
