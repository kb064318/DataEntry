package com.example.dataentry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// Contains a name, age, title, and hometown of an individual
public class DataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // ID for persistent storage
    private Long id;

    private String name;
    private Integer age;
    private String title;
    private String hometown;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHometown() {
        return this.hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
}