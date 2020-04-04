package com.dshabu.exam2.model;

import javax.persistence.*;

@Entity
@Table(name = "disease")
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "name")
    public String name;

    @Column(name = "description")
    public String description;

    @Column(name = "symptoms")
    public String symptoms;

    @Column(name = "duration")
    public String duration;

    @Column(name = "mortality")
    public String mortality;

    @Column(name = "imagecolumn")
    public String imagecolumn;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMortality() {
        return mortality;
    }

    public void setMortality(String mortality) {
        this.mortality = mortality;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagecolumn() {
        return imagecolumn;
    }

    public void setImagecolumn(String imagecolumn) {
        this.imagecolumn = imagecolumn;
    }
}
