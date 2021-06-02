package com.culturecalls.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "locations")

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "loc_id")
    private Long locId;
    @Column (name = "loc_name")
    private String locName;
    @Column (name = "loc_city")
    private String locCity;
    @Column (name = "loc_street")
    private String locStreet;
    @Column (name = "loc_streetnumber")
    private int locNumber;
    @Column (name = "loc_zipcode")
    private int locZipCode;

    @OneToMany
    @JoinColumn(name = "loc_id")
    @JsonIgnore
    private Set<Event> events = new HashSet<>();


    public Location() {
    }

    public Long getLocId() {
        return locId;
    }

    public void setLocId(Long locId) {
        this.locId = locId;
    }

    public String getLocName() {
        return locName;
    }

    public void setLocName(String locName) {
        this.locName = locName;
    }

    public String getLocCity() {
        return locCity;
    }

    public void setLocCity(String locCity) {
        this.locCity = locCity;
    }

    public String getLocStreet() {
        return locStreet;
    }

    public void setLocStreet(String locStreet) {
        this.locStreet = locStreet;
    }

    public int getLocNumber() {
        return locNumber;
    }

    public void setLocNumber(int locNumber) {
        this.locNumber = locNumber;
    }

    public int getLocZipCode() {
        return locZipCode;
    }

    public void setLocZipCode(int locZipCode) {
        this.locZipCode = locZipCode;
    }
}
