package fr.mporres.yahoofinanceapi.dto.profile;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.mporres.yahoofinanceapi.dto.common.LongFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyOfficers {
    @JsonProperty
    Integer maxAge;
    @JsonProperty
    String name;
    @JsonProperty
    Integer age;
    @JsonProperty
    String title;
    @JsonProperty
    Integer yearBorn;
    @JsonProperty
    Integer fiscalYear;
    @JsonProperty
    LongFormat totalPay;
    @JsonProperty
    LongFormat exercisedValue;
    @JsonProperty
    LongFormat unexercisedValue;

    public Integer getMaxAge() {
        return maxAge;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYearBorn() {
        return yearBorn;
    }

    public Integer getFiscalYear() {
        return fiscalYear;
    }

    public LongFormat getTotalPay() {
        return totalPay;
    }

    public LongFormat getExercisedValue() {
        return exercisedValue;
    }

    public LongFormat getUnexercisedValue() {
        return unexercisedValue;
    }
}
