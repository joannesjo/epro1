package com.example.epro.test;

import javax.persistence.*;

@Entity
@Table(name="category")
public class CategoryBean {

    @Id
    @Column(name="categoryId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer categoryId;

    @Column(name="categoryName")
    private String categoryName;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
