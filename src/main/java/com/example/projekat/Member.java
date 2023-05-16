package com.example.projekat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Member extends Person {
    private LocalDateTime startDate;
    private Packs pack;

    Boolean extendMembership = false;

    List<LocalDateTime> ArrivalList = new ArrayList<>();

    Member(String firstName, String lastName, Gender gender, String adress, String jmbg, String idCard, String email, String image, LocalDateTime startDate, Packs pack) {
        super(firstName, lastName, gender, adress, jmbg, idCard, email, image);
        this.startDate = startDate;
        this.pack = pack;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Packs getPack() {
        return pack;
    }

    public void setPack(Packs pack) {
        this.pack = pack;
    }

    public Boolean getExtendMembership() {
        return extendMembership;
    }

    public void setExtendMembership(Boolean extendMembership) {
        this.extendMembership = extendMembership;
    }
}
