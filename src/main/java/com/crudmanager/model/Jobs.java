package com.crudmanager.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Jobs implements Serializable {
    @Id
   @GeneratedValue(strategy = AUTO)
     private long id;
     private String name;
     private long salary;
     private String experience;
     private String city;

     public Jobs(String name, long salary, String experience, String city) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.city = city;
    }

    public Jobs() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String company) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
