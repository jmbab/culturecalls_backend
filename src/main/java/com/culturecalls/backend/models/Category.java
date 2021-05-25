package com.culturecalls.backend.models;

import javax.persistence.*;

// Entity = single object
@Entity
@Table(name = "eventcategories")

public class Category {

    // lines 12-17 declares idevents as primary key in database
    @Id
    // GeneratedValue auto-increments id value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column creates a column in database, even if it doesn't exist in database
    @Column (name = "ideventcategories")
    private Long idCategory;
    @Column (name = "eventcategories")
    private String categoryName;

    // Constructor


    public Category(Long idCategory, String categoryName) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
    }

    // Empty Constructor
    public Category() {
    }

    // Getters and Setters allow to manipulate the data


    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
