package com.example.epro.test;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="personform")
public class PersonForm {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @NotEmpty
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}