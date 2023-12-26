package com.example.springmvc.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Alien {

    public Alien(int aid, String aName) {
        this.aid = aid;
        this.aName = aName;
    }

    @Id
    private int aid;

    private String aName;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAName() {
        return aName;
    }

    public void setAName(String aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Alien [aid = " + aid + ", aName = " + aName + "]";
    }
}
