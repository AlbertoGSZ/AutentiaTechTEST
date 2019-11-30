package com.ATT.Autentia.TechTEST.entities;

import com.ATT.Autentia.TechTEST.entities.enumerations.DifficultyLevel;

import java.util.List;

public class BBDDtoCourse {
  /**Attributes*/

  private int id;
  private String name;
  private int durationHours;
  private boolean activatedCourse;
  private DifficultyLevel difficultyLevel;
  private int teacherID;



  /**Constructors*/

   public BBDDtoCourse(int id, String name, int durationHours, boolean activatedCourse, String difficultyLevel, int teacherID) {
    this.id = id;
    this.name = name;
    this.durationHours = durationHours;
    this.activatedCourse = activatedCourse;
    switch (difficultyLevel){
      case "Basic": this.difficultyLevel = DifficultyLevel.BASIC;
        break;
      case "Intermediate": this.difficultyLevel = DifficultyLevel.INTERMEDIATE;
        break;
      case "Expert": this.difficultyLevel = DifficultyLevel.EXPERT;
        break;
    }
    this.teacherID = teacherID;
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

  public void setDurationHours(int durationHours) {
    this.durationHours = durationHours;
  }

  public boolean isActivatedCourse() {
    return activatedCourse;
  }

  public boolean getActivatedCourse() {
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

  public int getTeacherID() {
    return teacherID;
  }

  public void setTeacherIDfromTeacherOBJ(Teacher teacher) {
    this.teacherID = teacher.getId();
  }

  public void setTeacherID(int teacherID) {
    this.teacherID = teacherID;
  }


  /**Converters*/

  public Course toCourse(){
    Course aux = new Course(this.name,this.durationHours,this.activatedCourse,this.difficultyLevel,this.teacherID);
    aux.setId(this.id);
    return aux;
  }



}
