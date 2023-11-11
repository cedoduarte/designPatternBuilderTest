package com.mycompany.designpatternbuildertest;

import java.time.LocalDate;

public class UserDTO {
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate birthdate;
    private String sex;
    private String maritalStatus;

    public UserDTO(String name, String lastName, String email, String phoneNumber, LocalDate birthdate, String sex, String maritalStatus) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
    }
    
    public UserDTO(UserDtoBuilder builder) {
        this.name = builder.getName();
        this.lastName = builder.getLastName();
        this.email = builder.getEmail();
        this.phoneNumber = builder.getPhoneNumber();
        this.birthdate = builder.getBirthdate();
        this.sex = builder.getSex();
        this.maritalStatus = builder.getMaritalStatus();        
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getSex() {
        return sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
