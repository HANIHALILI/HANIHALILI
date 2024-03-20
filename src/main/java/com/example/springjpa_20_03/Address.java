package com.example.springjpa_20_03;
import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Table(name = "addresses")
//@Entity
public class Address {
    private int codeStreet;
    private String streetName;
    private int houseNum;
    private String city;
    private Floor f;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id_address", nullable = false )
    private Long id;

    public Address(int codeStreet, String streetName, int houseNum, String city, Floor f) {
        this.codeStreet = codeStreet;
        this.streetName = streetName;
        this.houseNum = houseNum;
        this.city = city;
        this.f = f;
    }

    public Address() {

    }

    public int getCodeStreet() {
        return codeStreet;
    }

    public void setCodeStreet(int codeStreet) {
        this.codeStreet = codeStreet;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Floor getF() {
        return f;
    }

    public void setF(Floor f) {
        this.f = f;
    }


}
