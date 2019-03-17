package com.example.epro.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "education_details", schema = "matrimony")
public class EducationDetailsEntity {
    private int id;
    private String highestQualification;
    private String institution;
    private String institutionAddress;
    private String occupation;
    private String occupationInDetail;
    private String organisation;
    private String organizationType;
    private String monthlyIncome;
    private String annualIncome;
    private String achievements;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "highestQualification")
    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    @Basic
    @Column(name = "institution")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Basic
    @Column(name = "institutionAddress")
    public String getInstitutionAddress() {
        return institutionAddress;
    }

    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
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
    @Column(name = "occupationInDetail")
    public String getOccupationInDetail() {
        return occupationInDetail;
    }

    public void setOccupationInDetail(String occupationInDetail) {
        this.occupationInDetail = occupationInDetail;
    }

    @Basic
    @Column(name = "organisation")
    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    @Basic
    @Column(name = "organizationType")
    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    @Basic
    @Column(name = "monthlyIncome")
    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Basic
    @Column(name = "annualIncome")
    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Basic
    @Column(name = "achievements")
    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personId", nullable = false)
    private PersonalDetailsEntity personalDetailsEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationDetailsEntity that = (EducationDetailsEntity) o;
        return id == that.id &&
                Objects.equals(highestQualification, that.highestQualification) &&
                Objects.equals(institution, that.institution) &&
                Objects.equals(institutionAddress, that.institutionAddress) &&
                Objects.equals(occupation, that.occupation) &&
                Objects.equals(occupationInDetail, that.occupationInDetail) &&
                Objects.equals(organisation, that.organisation) &&
                Objects.equals(organizationType, that.organizationType) &&
                Objects.equals(monthlyIncome, that.monthlyIncome) &&
                Objects.equals(annualIncome, that.annualIncome) &&
                Objects.equals(achievements, that.achievements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, highestQualification, institution, institutionAddress, occupation, occupationInDetail, organisation, organizationType, monthlyIncome, annualIncome, achievements);
    }
}
