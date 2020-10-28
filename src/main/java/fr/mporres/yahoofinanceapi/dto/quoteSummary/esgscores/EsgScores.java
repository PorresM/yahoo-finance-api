package fr.mporres.yahoofinanceapi.dto.quoteSummary.esgscores;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.Format;
import fr.mporres.yahoofinanceapi.dto.quoteSummary.LongFormat;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EsgScores {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    Format totalEsg;
    @JsonProperty
    Format environmentScore;
    @JsonProperty
    Format socialScore;
    @JsonProperty
    Format governanceScore;
    @JsonProperty
    Integer ratingYear;
    @JsonProperty
    Integer ratingMonth;
    @JsonProperty
    Integer highestControversy;
    @JsonProperty
    Integer peerCount;
    @JsonProperty
    String esgPerformance;
    @JsonProperty
    String peerGroup;
    @JsonProperty
    List<String> relatedControversy;
    @JsonProperty
    LongFormat peerEsgScorePerformance;
    @JsonProperty
    LongFormat peerGovernancePerformance;
    @JsonProperty
    LongFormat peerSocialPerformance;
    @JsonProperty
    LongFormat peerEnvironmentPerformance;
    @JsonProperty
    LongFormat peerHighestControversyPerformance;
    @JsonProperty
    Format percentile;
    @JsonProperty
    String environmentPercentile; // Not tested
    @JsonProperty
    String socialPercentile; // Not tested
    @JsonProperty
    String governancePercentile; // Not tested
    @JsonProperty
    Boolean adult;
    @JsonProperty
    Boolean alcoholic;
    @JsonProperty
    Boolean animalTesting;
    @JsonProperty
    Boolean catholic;
    @JsonProperty
    Boolean controversialWeapons;
    @JsonProperty
    Boolean smallArms;
    @JsonProperty
    Boolean furLeather;
    @JsonProperty
    Boolean gambling;
    @JsonProperty
    Boolean gmo;
    @JsonProperty
    Boolean militaryContract;
    @JsonProperty
    Boolean nuclear;
    @JsonProperty
    Boolean pesticides;
    @JsonProperty
    Boolean palmOil;
    @JsonProperty
    Boolean coal;
    @JsonProperty
    Boolean tobacco;

    public Integer getMaxAge() {
        return maxAge;
    }

    public Format getTotalEsg() {
        return totalEsg;
    }

    public Format getEnvironmentScore() {
        return environmentScore;
    }

    public Format getSocialScore() {
        return socialScore;
    }

    public Format getGovernanceScore() {
        return governanceScore;
    }

    public Integer getRatingYear() {
        return ratingYear;
    }

    public Integer getRatingMonth() {
        return ratingMonth;
    }

    public Integer getHighestControversy() {
        return highestControversy;
    }

    public Integer getPeerCount() {
        return peerCount;
    }

    public String getEsgPerformance() {
        return esgPerformance;
    }

    public String getPeerGroup() {
        return peerGroup;
    }

    public List<String> getRelatedControversy() {
        return relatedControversy;
    }

    public LongFormat getPeerEsgScorePerformance() {
        return peerEsgScorePerformance;
    }

    public LongFormat getPeerGovernancePerformance() {
        return peerGovernancePerformance;
    }

    public LongFormat getPeerSocialPerformance() {
        return peerSocialPerformance;
    }

    public LongFormat getPeerEnvironmentPerformance() {
        return peerEnvironmentPerformance;
    }

    public LongFormat getPeerHighestControversyPerformance() {
        return peerHighestControversyPerformance;
    }

    public Format getPercentile() {
        return percentile;
    }

    public String getEnvironmentPercentile() {
        return environmentPercentile;
    }

    public String getSocialPercentile() {
        return socialPercentile;
    }

    public String getGovernancePercentile() {
        return governancePercentile;
    }

    public Boolean getAdult() {
        return adult;
    }

    public Boolean getAlcoholic() {
        return alcoholic;
    }

    public Boolean getAnimalTesting() {
        return animalTesting;
    }

    public Boolean getCatholic() {
        return catholic;
    }

    public Boolean getControversialWeapons() {
        return controversialWeapons;
    }

    public Boolean getSmallArms() {
        return smallArms;
    }

    public Boolean getFurLeather() {
        return furLeather;
    }

    public Boolean getGambling() {
        return gambling;
    }

    public Boolean getGmo() {
        return gmo;
    }

    public Boolean getMilitaryContract() {
        return militaryContract;
    }

    public Boolean getNuclear() {
        return nuclear;
    }

    public Boolean getPesticides() {
        return pesticides;
    }

    public Boolean getPalmOil() {
        return palmOil;
    }

    public Boolean getCoal() {
        return coal;
    }

    public Boolean getTobacco() {
        return tobacco;
    }
}
