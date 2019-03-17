package com.example.epro.test;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Publication")
public class PublicationBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pubId")
    private Integer pubId;

    @Column(name="Title")
    private String pubTitle;
/*
    @OneToOne
    @JoinColumn(name="categoryId")
    private CategoryBean category;
*/

    @Column(name="content")
    private String pubContent;

    public Integer getPubId() {
        return pubId;
    }
    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }
    public String getPubTitle() {
        return pubTitle;
    }
    public void setPubTitle(String pubTitle) {
        this.pubTitle = pubTitle;
    }
    public String getPubContent() {
        return pubContent;
    }
    /*public CategoryBean getCategory() {
        return category;
    }
    public void setCategory(CategoryBean category) {
        this.category = category;
    }*/
    public void setPubContent(String pubContent) {
        this.pubContent = pubContent;
    }
}