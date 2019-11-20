package com.ATT.Autentia.TechTEST.entities;

import com.ATT.Autentia.TechTEST.entities.enumerations.DifficultyLevel;

public class Course {

    /**Attributes*/

    private int id;
    private String name;
    private float durationHours;
    private boolean activatedCourse;
    private DifficultyLevel difficultyLevel;
    private Teacher teacher;



    /**Constructors*/

    public Course(String name, float durationHours, boolean activatedCourse, DifficultyLevel difficultyLevel, Teacher teacher) {
        this.name = name;
        this.durationHours = durationHours;
        this.activatedCourse = activatedCourse;
        this.difficultyLevel = difficultyLevel;
        this.teacher = teacher;
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

    public float getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(float durationHours) {
        this.durationHours = durationHours;
    }

    public boolean isActivatedCourse() {
        return activatedCourse;
    }

    public void setActivatedCourse(boolean activatedCourse) {
        this.activatedCourse = activatedCourse;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
