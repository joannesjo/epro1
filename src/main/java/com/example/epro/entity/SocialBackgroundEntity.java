package com.example.epro.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "social_background", schema = "matrimony")
public class SocialBackgroundEntity {
    private int id;
    private String caste;
    private String motherTongue;
    private String religion;
    private String denomination;
    private String parish;
    private String house;
    private String location;
    private String city;
    private String state;
    private String country;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "caste")
    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    @Basic
    @Column(name = "motherTongue")
    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    @Basic
    @Column(name = "religion")
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Basic
    @Column(name = "denomination")
    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Basic
    @Column(name = "parish")
    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    @Basic
    @Column(name = "house")
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personId", nullable = false)
    private PersonalDetailsEntity personalDetailsEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialBackgroundEntity that = (SocialBackgroundEntity) o;
        return id == that.id &&
                Objects.equals(caste, that.caste) &&
                Objects.equals(motherTongue, that.motherTongue) &&
                Objects.equals(religion, that.religion) &&
                Objects.equals(denomination, that.denomination) &&
                Objects.equals(parish, that.parish) &&
                Objects.equals(house, that.house) &&
                Objects.equals(location, that.location) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, caste, motherTongue, religion, denomination, parish, house, location, city, state, country);
    }
}
