package fr.mporres.yahoofinanceapi.dto.earningstrand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RevenueEstimate {
    @JsonProperty
    LongFormat avg;
    @JsonProperty
    LongFormat low;
    @JsonProperty
    LongFormat high;
    @JsonProperty
    LongFormat numberOfAnalysts;
    @JsonProperty
    LongFormat yearAgoRevenue;
    @JsonProperty
    Format growth;

    public LongFormat getAvg() {
        return avg;
    }

    public LongFormat getLow() {
        return low;
    }

    public LongFormat getHigh() {
        return high;
    }

    public LongFormat getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    public LongFormat getYearAgoRevenue() {
        return yearAgoRevenue;
    }

    public Format getGrowth() {
        return growth;
    }
}
