package com.culturecalls.backend.models;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "events")

public class Event {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "event_id")
    private Long evtId;

    @Column (name = "evt_name")
    private String evtName;

    @Temporal(TemporalType.DATE)
    @Column (name = "evt_date")
    private java.util.Date evtDate;

    @Temporal(TemporalType.TIME)
    @JsonFormat(pattern = "HH:mm")
    @Column (name = "evt_time")
    private Date evtTime;

    @Column (name = "evt_price")
    private double evtPrice;

    @ManyToOne
    @JoinColumn (name = "loc_id")
    private Location evtLocation;

    @Column (name = "evt_tickets")
    private int evtTickets;

    @ManyToOne
    @JoinColumn (name = "cat_id")
    private Category evtCategory;

    public Event() {
    }

    public Long getEvtId() {
        return evtId;
    }

    public void setEvtId(Long evtId) {
        this.evtId = evtId;
    }

    public String getEvtName() {
        return evtName;
    }

    public void setEvtName(String evtName) {
        this.evtName = evtName;
    }

    public Date getEvtDate() {
        return evtDate;
    }

    public void setEvtDate(Date evtDate) {
        this.evtDate = evtDate;
    }

    public Date getEvtTime() {
        return evtTime;
    }

    public void setEvtTime(Date evtTime) {
        this.evtTime = evtTime;
    }

    public double getEvtPrice() {
        return evtPrice;
    }

    public void setEvtPrice(double evtPrice) {
        this.evtPrice = evtPrice;
    }

    public Location getEvtLocation() {
        return evtLocation;
    }

    public void setEvtLocation(Location evtLocation) {
        this.evtLocation = evtLocation;
    }

    public int getEvtTickets() {
        return evtTickets;
    }

    public void setEvtTickets(int evtTickets) {
        this.evtTickets = evtTickets;
    }

    public Category getEvtCategory() {
        return evtCategory;
    }

    public void setEvtCategory(Category evtCategory) {
        this.evtCategory = evtCategory;
    }
}
