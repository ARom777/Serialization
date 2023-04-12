package com.example.full_serialization;

import androidx.annotation.NonNull;

public class User {
    private String firstname;
    private String lastname;
    private int school;

    User(String firstname, String lastname, int school) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.school = school;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @NonNull
    @Override
    public String toString() {
        return "Имя: " + firstname + ";\nФамилия: " + lastname + ";\nШкола №" + school;
    }
}
