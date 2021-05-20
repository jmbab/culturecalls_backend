package com.culturecalls.backend.models;

import javax.persistence.*;

// Entity = single object
@Entity
@Table(name = "locations")

public class Location {

    // lines 12-17 declares idevents as primary key in database
    @Id
    // GeneratedValue auto-increments id value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column creates a column in database, even if it doesn't exist in database
    @Column (name = "idlocations")
    private Long idLocation;
    @Column (name = "locationname")
    private String locationName;
    @Column (name = "locationcategory")
    private String locationCategory;
    @Column (name = "city")
    private String city;
    @Column (name = "streetname")
    private String streetName;
    @Column (name = "streetnumber")
    private int streetNumber;
    @Column (name = "postalcode")
    private int postalCode;

    // Constructor
    public Location(Long idLocation, String locationName, String locationCategory, String city, String streetName, int streetNumber, int postalCode) {
        this.idLocation = idLocation;
        this.locationName = locationName;
        this.locationCategory = locationCategory;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    // Empty Constructor
    public Location() {
    }

    // Getters and Setters allow to manipulate the data
    public Long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Long idLocation) {
        this.idLocation = idLocation;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCategory() {
        return locationCategory;
    }

    public void setLocationCategory(String locationCategory) {
        this.locationCategory = locationCategory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

}
