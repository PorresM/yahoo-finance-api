package fr.mporres.yahoofinanceapi.dto.quoteSummary.calendarevents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsDate {
    @JsonProperty
    List<Format> earningsDate;

    public List<Format> getEarningsDate() {
        return earningsDate;
    }
}
