package com.example.epro.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "partner_preference", schema = "matrimony")
public class PartnerPreferenceEntity {
    private int id;
    private String qualification;
    private String age;
    private String height;
    private String occupation;
    private String country;
    private String monthlySalary;
    private String caste;
    private String religion;
    private String motherTongue;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "qualification")
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Basic
    @Column(name = "age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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
    @Column(name = "occupation")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "monthlySalary")
    public String getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(String monthlySalary) {
        this.monthlySalary = monthlySalary;
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
    @Column(name = "religion")
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Basic
    @Column(name = "motherTongue")
    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personId", nullable = false)
    private PersonalDetailsEntity personalDetailsEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartnerPreferenceEntity that = (PartnerPreferenceEntity) o;
        return id == that.id &&
                Objects.equals(qualification, that.qualification) &&
                Objects.equals(age, that.age) &&
                Objects.equals(height, that.height) &&
                Objects.equals(occupation, that.occupation) &&
                Objects.equals(country, that.country) &&
                Objects.equals(monthlySalary, that.monthlySalary) &&
                Objects.equals(caste, that.caste) &&
                Objects.equals(religion, that.religion) &&
                Objects.equals(motherTongue, that.motherTongue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qualification, age, height, occupation, country, monthlySalary, caste, religion, motherTongue);
    }
}
