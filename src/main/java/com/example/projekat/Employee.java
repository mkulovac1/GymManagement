package com.example.projekat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private String userName;
    private String password;
    private String salary;
    private final LocalDateTime startWorkingDate;

    List<LocalDateTime> arrivalList = new ArrayList<>();
    Employee(String firstName, String lastName, Gender gender, String adress, String jmbg, String idCard, String email, String image, String username, String password, String salary, LocalDateTime startWorkingDate) {
        super(firstName, lastName, gender, adress, jmbg, idCard, email, image);
        this.userName = username;
        this.password = password;
        this.salary = salary;
        this.startWorkingDate = startWorkingDate;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDateTime getStartWorkingDate() {
        return startWorkingDate;
    }
    /* public void setStartWorkingDate(LocalDateTime startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    } */
}
