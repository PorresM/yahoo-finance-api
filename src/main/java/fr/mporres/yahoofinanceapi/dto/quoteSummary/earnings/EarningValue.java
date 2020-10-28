package fr.mporres.yahoofinanceapi.dto.quoteSummary.earnings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningValue {
    @JsonProperty
    String date;
    @JsonProperty
    Format actual;
    @JsonProperty
    Format estimate;

    public String getDate() {
        return date;
    }

    public Format getActual() {
        return actual;
    }

    public Format getEstimate() {
        return estimate;
    }
}
