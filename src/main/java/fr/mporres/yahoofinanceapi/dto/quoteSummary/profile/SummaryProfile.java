package fr.mporres.yahoofinanceapi.dto.quoteSummary.profile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryProfile {
    @JsonProperty
    String address1;
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
    Integer maxAge;

    public String getAddress1() {
        return address1;
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

    public Integer getMaxAge() {
        return maxAge;
    }
}