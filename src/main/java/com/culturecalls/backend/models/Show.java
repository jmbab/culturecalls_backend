package com.culturecalls.backend.models;

// persistence means that data from "show" is saved as an object in our database

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

// Entity = single object
@Entity
@Table (name = "events")

public class Show {

    // lines 13-18 declares idevents as primary key in database
    @Id
    // GeneratedValue auto-increments id value
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    // Column creates a column in database, even if it doesn't exist in database
    @Column (name = "idevents")
    private Long id;

    @Column (name = "eventname")
    private String eventname;

    @Temporal(TemporalType.DATE)
    @Column (name = "eventdate")
    private Date eventdate;

    @Column (name = "eventstarttime")
    private Time eventstarttime;

    @Column (name = "eventendtime")
    private Time eventendtime;

    @Column (name = "eventprice")
    private double eventprice;

    @Column (name = "eventlocation")
    private String eventlocation;

    @Column (name = "eventmaxtickets")
    private int eventmaxtickets;

    @Column (name = "eventcategory")
    private String eventcategory;

    // Constructor
    public Show(Long id, String eventname, Date eventdate, Time eventstarttime, Time eventendtime, double eventprice, String eventlocation, int eventmaxtickets, String eventcategory) {
        this.id = id;
        this.eventname = eventname;
        this.eventdate = eventdate;
        this.eventstarttime = eventstarttime;
        this.eventendtime = eventendtime;
        this.eventprice = eventprice;
        this.eventlocation = eventlocation;
        this.eventmaxtickets = eventmaxtickets;
        this.eventcategory = eventcategory;
    }
    // Empty Constructor
    public Show() {
    }

    // Getters and Setters allow to manipulate the data
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public Time getEventstarttime() {
        return eventstarttime;
    }

    public void setEventstarttime(Time eventstarttime) {
        this.eventstarttime = eventstarttime;
    }

    public Time getEventendtime() {
        return eventendtime;
    }

    public void setEventendtime(Time eventendtime) {
        this.eventendtime = eventendtime;
    }

    public double getEventprice() {
        return eventprice;
    }

    public void setEventprice(double eventprice) {
        this.eventprice = eventprice;
    }

    public String getEventlocation() {
        return eventlocation;
    }

    public void setEventlocation(String eventlocation) {
        this.eventlocation = eventlocation;
    }

    public int getEventmaxtickets() {
        return eventmaxtickets;
    }

    public void setEventmaxtickets(int eventmaxtickets) {
        this.eventmaxtickets = eventmaxtickets;
    }

    public String getEventcategory() {
        return eventcategory;
    }

    public void setEventcategory(String eventcategory) {
        this.eventcategory = eventcategory;
    }

}
