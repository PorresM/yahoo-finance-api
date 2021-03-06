package fr.mporres.yahoofinanceapi.dto.quoteSummary.earnings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsChart {
    @JsonProperty
    List<EarningValue> quarterly;
    @JsonProperty
    Format currentQuarterEstimate;
    @JsonProperty
    String currentQuarterEstimateDate;
    @JsonProperty
    Integer currentQuarterEstimateYear;
    @JsonProperty
    List<Format> earningsDate;

    public List<EarningValue> getQuarterly() {
        return quarterly;
    }

    public Format getCurrentQuarterEstimate() {
        return currentQuarterEstimate;
    }

    public String getCurrentQuarterEstimateDate() {
        return currentQuarterEstimateDate;
    }

    public Integer getCurrentQuarterEstimateYear() {
        return currentQuarterEstimateYear;
    }

    public List<Format> getEarningsDate() {
        return earningsDate;
    }
}
