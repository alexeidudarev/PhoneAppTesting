package com.book.tests.model;

import java.io.File;

public class Contact {
    private String name;
    private String middleName;
    private String familyName;
    private String adress;
    private String group;
    private File photo;


    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Contact setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public String getFamilyName() {
        return familyName;
    }

    public Contact setFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    public String getAdress() {
        return adress;
    }

    public Contact setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public Contact setGroup(String group) {
        this.group = group;
        return this;
    }

    public File getPhoto() {
        return photo;
    }

    public Contact setPhoto(File photo) {
        this.photo = photo;
        return this;
    }
}
