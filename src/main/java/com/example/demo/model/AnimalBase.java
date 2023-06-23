package com.example.demo.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AnimalBase extends BaseEntity {

    protected String name;
    protected String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
