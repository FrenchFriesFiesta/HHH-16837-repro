package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "humans")
public class Human extends BaseEntity {
    private String humanName;

    @ManyToMany()
//    @OrderBy("name")
    @JoinTable(name = "human_pet",
            inverseJoinColumns = @JoinColumn(name = "pet_id", referencedColumnName = "id"),
            joinColumns = @JoinColumn(name = "human_id", referencedColumnName = "id"))
    private Set<Dog> pets = new LinkedHashSet<>();
}
