package com.example.epro.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "personal_details", schema = "matrimony")
public class PersonalDetailsEntity {
    private int personId;
    private String name;
    private String dob;
    private String maritalStatus;
    private String birthOrderNo;
    private String complexion;
    private String bloodGroup;
    private String drink;
    private String bodyType;
    private String healthInformation;
    private String height;
    private String bodyWeight;
    private String diet;
    private String smoking;
    private String others;

    @Id
    @Column(name = "personId")
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Dob")
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Basic
    @Column(name = "maritalStatus")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "birthOrderNo")
    public String getBirthOrderNo() {
        return birthOrderNo;
    }

    public void setBirthOrderNo(String birthOrderNo) {
        this.birthOrderNo = birthOrderNo;
    }

    @Basic
    @Column(name = "complexion")
    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    @Basic
    @Column(name = "bloodGroup")
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Basic
    @Column(name = "drink")
    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Basic
    @Column(name = "bodyType")
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Basic
    @Column(name = "healthInformation")
    public String getHealthInformation() {
        return healthInformation;
    }

    public void setHealthInformation(String healthInformation) {
        this.healthInformation = healthInformation;
    }

    @Basic
    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "bodyWeight")
    public String getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(String bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    @Basic
    @Column(name = "diet")
    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Basic
    @Column(name = "smoking")
    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    @Basic
    @Column(name = "others")
    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "personalDetailsEntity")
    private EducationDetailsEntity educationDetailsEntity;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "personalDetailsEntity")
    private FamilyDetailsEntity familyDetailsEntity;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "personalDetailsEntity")
    private PartnerPreferenceEntity partnerPreferenceEntity;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "personalDetailsEntity")
    private SocialBackgroundEntity socialBackgroundEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalDetailsEntity that = (PersonalDetailsEntity) o;
        return personId == that.personId &&
                Objects.equals(name, that.name) &&
                Objects.equals(dob, that.dob) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(birthOrderNo, that.birthOrderNo) &&
                Objects.equals(complexion, that.complexion) &&
                Objects.equals(bloodGroup, that.bloodGroup) &&
                Objects.equals(drink, that.drink) &&
                Objects.equals(bodyType, that.bodyType) &&
                Objects.equals(healthInformation, that.healthInformation) &&
                Objects.equals(height, that.height) &&
                Objects.equals(bodyWeight, that.bodyWeight) &&
                Objects.equals(diet, that.diet) &&
                Objects.equals(smoking, that.smoking) &&
                Objects.equals(others, that.others);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name, dob, maritalStatus, birthOrderNo, complexion, bloodGroup, drink, bodyType, healthInformation, height, bodyWeight, diet, smoking, others);
    }
}
