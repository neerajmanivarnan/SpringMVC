package com.example.springmvc.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;

    private String aName;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aName;
    }

    public void setAname(String aName) {
        this.aName = aName;
    }

    @Override
    public String toString() {
        return "Alien [aid = " + aid + ", aname= " + aName + " ]";
    }
}
