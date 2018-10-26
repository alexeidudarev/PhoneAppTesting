package com.book.tests.model;

public class Contact {
    public String name;
    public String middleName;
    public String familyName;
    public String adress;


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
}
