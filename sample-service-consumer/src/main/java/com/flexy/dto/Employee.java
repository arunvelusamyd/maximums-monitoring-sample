package com.flexy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import lombok.Data;

@JsonApiResource(type = "employees")
@Data
public class Employee {

    @JsonApiId
    private int employeeId;

    @JsonProperty("employee-name")
    private String employeeName;

    @JsonProperty("education-qualification")
    private String educationQualification;

    private String gender;

    private String role;

}
