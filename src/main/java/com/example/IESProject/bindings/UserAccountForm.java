package com.example.IESProject.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountForm {

    public String fullName;
    public Double mobileNumber;
    public Integer dob;
    public String emailId;
    public String gender;
    public Double ssn;

}
