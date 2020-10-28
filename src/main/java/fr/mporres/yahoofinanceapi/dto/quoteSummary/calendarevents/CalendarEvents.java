package fr.mporres.yahoofinanceapi.dto.quoteSummary.calendarevents;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarEvents {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    CalendarEarnings earnings;
    @JsonProperty
    Format exDividendDate;
    @JsonProperty
    Format dividendDate;

    public Integer getMaxAge() {
        return maxAge;
    }

    public CalendarEarnings getEarnings() {
        return earnings;
    }

    public Format getExDividendDate() {
        return exDividendDate;
    }

    public Format getDividendDate() {
        return dividendDate;
    }
}
