package fr.mporres.yahoofinanceapi.dto.earningstrand;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EarningsTrend {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    String period;
    @JsonProperty
    String endDate;
    @JsonProperty
    Format growth;
    @JsonProperty
    EarningsEstimate earningsEstimate;
    @JsonProperty
    RevenueEstimate revenueEstimate;
    @JsonProperty
    EpsTrend epsTrend;
    @JsonProperty
    EpsRevisions epsRevisions;

    public Integer getMaxAge() {
        return maxAge;
    }

    public String getPeriod() {
        return period;
    }

    public String getEndDate() {
        return endDate;
    }

    public Format getGrowth() {
        return growth;
    }

    public EarningsEstimate getEarningsEstimate() {
        return earningsEstimate;
    }

    public RevenueEstimate getRevenueEstimate() {
        return revenueEstimate;
    }

    public EpsTrend getEpsTrend() {
        return epsTrend;
    }

    public EpsRevisions getEpsRevisions() {
        return epsRevisions;
    }
}
