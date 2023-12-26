package com.example.springmvc;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table
public class monday {
    @Id
    String className;
    String first;
    String second;
    String third;
    String fourth;
    String fifth;
    String sixth;
    String seventh;

    public monday(){}
    

    public monday(String className, String first, String second, String third, String fourth, String fifth,
            String sixth, String seventh) {
        this.className = className;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public String getFifth() {
        return fifth;
    }

    public void setFifth(String fifth) {
        this.fifth = fifth;
    }

    public String getSixth() {
        return sixth;
    }

    public void setSixth(String sixth) {
        this.sixth = sixth;
    }

    public String getSeventh() {
        return seventh;
    }

    public void setSeventh(String seventh) {
        this.seventh = seventh;
    }

    @Override
    public String toString() {
        return "monday [ className = "+className+" first ="+first+" second = "+second+"third ="+third+" fourth ="+fourth+ "fifth ="+fifth+ "sixth ="+sixth+"seventh ="+seventh+" ]";
    }
    
}
