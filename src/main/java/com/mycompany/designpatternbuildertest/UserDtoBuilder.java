package com.mycompany.designpatternbuildertest;

import java.time.LocalDate;
import java.util.Objects;

public class UserDtoBuilder {
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate birthdate;
    private String sex;
    private String maritalStatus;

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public String getSex() {
        return this.sex;
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public UserDtoBuilder name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }

    public UserDtoBuilder lastName(String lastName) {
        Objects.requireNonNull(lastName);
        this.lastName = lastName;
        return this;
    }

    public UserDtoBuilder email(String email) {
        Objects.requireNonNull(email);
        this.email = email;
        return this;
    }

    public UserDtoBuilder phoneNumber(String phoneNumber) {
        Objects.requireNonNull(phoneNumber);
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserDtoBuilder birthdate(LocalDate birthdate) {
        Objects.requireNonNull(birthdate);
        this.birthdate = birthdate;
        return this;
    }

    public UserDtoBuilder sex(String sex) {
        Objects.requireNonNull(sex);
        this.sex = sex;
        return this;
    }

    public UserDtoBuilder maritalStatus(String maritalStatus) {
        Objects.requireNonNull(maritalStatus);
        this.maritalStatus = maritalStatus;
        return this;
    }   
    
    public UserDTO build() {
        return new UserDTO(this);
    }
}
