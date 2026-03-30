package com.youra.internship.platform.model;

import jakarta.persistence.*;

@Entity  //cette classe est une table dans la base
public class InternshipOffer {

    @Id //clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String company;
    private String city;
    private String description;
    private String technology;
    private String type;

    public InternshipOffer() {}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}