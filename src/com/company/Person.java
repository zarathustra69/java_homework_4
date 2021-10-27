package com.company;

import java.io.Console;

public class Person {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;
    boolean vaccinated;

    public Person(String fullName, String position, String email, String phoneNumber, int salary, int age, boolean vaccinated) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public void info() {
        System.out.println("Full name: " + fullName + "; Position: " + position +
                "; Email: " + email + "; Phone number: " + phoneNumber +
                "; Salary: " + salary + "; Age: " + age + "; Vaccinated: " + vaccinated
        );
    }
}
