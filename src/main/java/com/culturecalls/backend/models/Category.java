package com.culturecalls.backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "eventcategories")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cat_id")
    private Long catId;

    @Column (name = "cat_name")
    private String catName;

    @OneToMany
    @JoinColumn(name = "cat_id")
    @JsonIgnore
    private Set<Event> events = new HashSet<>();

    public Category() {
    }


    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long idCategory) {
        this.catId = idCategory;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String categoryName) {
        this.catName = categoryName;
    }


}
