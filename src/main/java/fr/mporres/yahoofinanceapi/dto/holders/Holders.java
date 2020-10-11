package fr.mporres.yahoofinanceapi.dto.holders;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.Format;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Holders {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    String name;
    @JsonProperty
    String relation;
    @JsonProperty
    String url;
    @JsonProperty
    String transactionDescription;
    @JsonProperty
    Format latestTransDate;
    @JsonProperty
    LongFormat positionDirect;
    @JsonProperty
    Format positionDirectDate;

    public Integer getMaxAge() {
        return maxAge;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getUrl() {
        return url;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public Format getLatestTransDate() {
        return latestTransDate;
    }

    public LongFormat getPositionDirect() {
        return positionDirect;
    }

    public Format getPositionDirectDate() {
        return positionDirectDate;
    }
}
