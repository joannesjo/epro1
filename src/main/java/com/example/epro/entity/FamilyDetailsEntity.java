package com.example.epro.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "family_details", schema = "matrimony")
public class FamilyDetailsEntity {
    private int id;
    private String fathersName;
    private String mothersName;
    private String fathersOccupation;
    private String mothersOccupation;
    private String fathersNativePlace;
    private String mothersNativePlace;
    private String elderBrothers;
    private String elderSisters;
    private String youngerBrothers;
    private String youngerSisters;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fathersName")
    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    @Basic
    @Column(name = "mothersName")
    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    @Basic
    @Column(name = "fathersOccupation")
    public String getFathersOccupation() {
        return fathersOccupation;
    }

    public void setFathersOccupation(String fathersOccupation) {
        this.fathersOccupation = fathersOccupation;
    }

    @Basic
    @Column(name = "mothersOccupation")
    public String getMothersOccupation() {
        return mothersOccupation;
    }

    public void setMothersOccupation(String mothersOccupation) {
        this.mothersOccupation = mothersOccupation;
    }

    @Basic
    @Column(name = "fathersNativePlace")
    public String getFathersNativePlace() {
        return fathersNativePlace;
    }

    public void setFathersNativePlace(String fathersNativePlace) {
        this.fathersNativePlace = fathersNativePlace;
    }

    @Basic
    @Column(name = "mothersNativePlace")
    public String getMothersNativePlace() {
        return mothersNativePlace;
    }

    public void setMothersNativePlace(String mothersNativePlace) {
        this.mothersNativePlace = mothersNativePlace;
    }

    @Basic
    @Column(name = "elderBrothers")
    public String getElderBrothers() {
        return elderBrothers;
    }

    public void setElderBrothers(String elderBrothers) {
        this.elderBrothers = elderBrothers;
    }

    @Basic
    @Column(name = "elderSisters")
    public String getElderSisters() {
        return elderSisters;
    }

    public void setElderSisters(String elderSisters) {
        this.elderSisters = elderSisters;
    }

    @Basic
    @Column(name = "youngerBrothers")
    public String getYoungerBrothers() {
        return youngerBrothers;
    }

    public void setYoungerBrothers(String youngerBrothers) {
        this.youngerBrothers = youngerBrothers;
    }

    @Basic
    @Column(name = "youngerSisters")
    public String getYoungerSisters() {
        return youngerSisters;
    }

    public void setYoungerSisters(String youngerSisters) {
        this.youngerSisters = youngerSisters;
    }


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "personId", nullable = false)
    private PersonalDetailsEntity personalDetailsEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilyDetailsEntity that = (FamilyDetailsEntity) o;
        return id == that.id &&
                Objects.equals(fathersName, that.fathersName) &&
                Objects.equals(mothersName, that.mothersName) &&
                Objects.equals(fathersOccupation, that.fathersOccupation) &&
                Objects.equals(mothersOccupation, that.mothersOccupation) &&
                Objects.equals(fathersNativePlace, that.fathersNativePlace) &&
                Objects.equals(mothersNativePlace, that.mothersNativePlace) &&
                Objects.equals(elderBrothers, that.elderBrothers) &&
                Objects.equals(elderSisters, that.elderSisters) &&
                Objects.equals(youngerBrothers, that.youngerBrothers) &&
                Objects.equals(youngerSisters, that.youngerSisters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fathersName, mothersName, fathersOccupation, mothersOccupation, fathersNativePlace, mothersNativePlace, elderBrothers, elderSisters, youngerBrothers, youngerSisters);
    }
}
