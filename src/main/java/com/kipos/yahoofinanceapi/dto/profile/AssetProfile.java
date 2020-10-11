package com.kipos.yahoofinanceapi.dto.profile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AssetProfile {
    @JsonProperty
    String address1;
    @JsonProperty
    String address2;
    @JsonProperty
    String city;
    @JsonProperty
    String state;
    @JsonProperty
    String zip;
    @JsonProperty
    String country;
    @JsonProperty
    String phone;
    @JsonProperty
    String fax;
    @JsonProperty
    String website;
    @JsonProperty
    String industry;
    @JsonProperty
    String sector;
    @JsonProperty
    String longBusinessSummary;
    @JsonProperty
    Integer fullTimeEmployees;
    @JsonProperty
    List<CompanyOfficers> companyOfficers;
    @JsonProperty
    Integer auditRisk;
    @JsonProperty
    Integer boardRisk;
    @JsonProperty
    Integer compensationRisk;
    @JsonProperty
    Integer shareHolderRightsRisk;
    @JsonProperty
    Integer overallRisk;
    @JsonProperty
    Integer governanceEpochDate;
    @JsonProperty
    Integer compensationAsOfEpochDate;
    @JsonProperty
    Integer maxAge;

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public String getIndustry() {
        return industry;
    }

    public String getSector() {
        return sector;
    }

    public String getLongBusinessSummary() {
        return longBusinessSummary;
    }

    public Integer getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public List<CompanyOfficers> getCompanyOfficers() {
        return companyOfficers;
    }

    public Integer getAuditRisk() {
        return auditRisk;
    }

    public Integer getBoardRisk() {
        return boardRisk;
    }

    public Integer getCompensationRisk() {
        return compensationRisk;
    }

    public Integer getShareHolderRightsRisk() {
        return shareHolderRightsRisk;
    }

    public Integer getOverallRisk() {
        return overallRisk;
    }

    public Integer getGovernanceEpochDate() {
        return governanceEpochDate;
    }

    public Integer getCompensationAsOfEpochDate() {
        return compensationAsOfEpochDate;
    }

    public Integer getMaxAge() {
        return maxAge;
    }
}
