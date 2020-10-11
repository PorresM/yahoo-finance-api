package fr.mporres.yahoofinanceapi.dto.upgradedowngrade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpgradeDowngradeWrapper {
    @JsonProperty
    List<UpgradeDowngrade> history;
    @JsonProperty
    Integer maxAge;

    public List<UpgradeDowngrade> getHistory() {
        return history;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
