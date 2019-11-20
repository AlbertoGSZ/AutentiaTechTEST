package com.ATT.Autentia.TechTEST.entities;

import javax.annotation.Generated;

public class Teacher {

    /**Attributes*/

    private int id;
    private String name;
    private String surname;



    /**Constructors*/

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    /**Getters & setters*/

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {return surname; }

    public void setSurname(String surname) { this.surname = surname; }
}
