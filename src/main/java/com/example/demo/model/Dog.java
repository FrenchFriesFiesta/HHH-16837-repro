package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dogs")
public class Dog extends Animal {

    private int barkIntensity;

    public int getBarkIntensity() {
        return barkIntensity;
    }

    public void setBarkIntensity(int barkIntensity) {
        this.barkIntensity = barkIntensity;
    }
}
