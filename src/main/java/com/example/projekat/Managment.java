package com.example.projekat;

import java.util.ArrayList;
import java.util.List;

public class Managment {
    List<Member> members = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    List<Owner> owners = new ArrayList<>();

    Managment(List<Owner> owners, List<Employee> employees, List<Member> members) {
        this.owners = owners;
        this.employees = employees;
        this.members = members;
    }

    public List<Owner> getOwners() {
        return owners;
    }
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
