package com.example.projekat;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String adress;
    private String jmbg;
    private String idCard;
    private String email;
    private String image;

    Person(String firstName, String lastName, Gender gender, String adress, String jmbg, String idCard, String email, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.adress = adress;
        this.jmbg = jmbg;
        this.idCard = idCard;
        this.email = email;
        this.image = image;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Gender getSex() {
        return gender;
    }

    public void setSex(Gender gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
