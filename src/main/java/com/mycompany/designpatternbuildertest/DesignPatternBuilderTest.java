package com.mycompany.designpatternbuildertest;

import java.time.LocalDate;

public class DesignPatternBuilderTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        UserDTO userDto = new UserDtoBuilder()
            .name("Carlos")
            .lastName("Duarte")
            .email("carlosduarte.1@hotmail.com")
            .phoneNumber("+526622769242")
            .birthdate(LocalDate.of(1995,2,5))
            .sex("Male")
            .maritalStatus("Single")
            .build();
        printUserDto(userDto);
    }
    
    public static void printUserDto(UserDTO dto) {
        System.out.println("Name: " + dto.getName());
        System.out.println("Lastname: " + dto.getLastName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Phone number: " + dto.getPhoneNumber());
        System.out.println("Birthdate: " + dto.getBirthdate().toString());
        System.out.println("Sex: " + dto.getSex());
        System.out.println("Marital status: " + dto.getMaritalStatus());
    }
}
