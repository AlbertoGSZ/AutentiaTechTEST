package com.ATT.Autentia.TechTEST.entities;
import com.ATT.Autentia.TechTEST.entities.enumerations.DifficultyLevel;

public class Course {

  /**Attributes*/

  private int id;
  private String name;
  private float durationHours;
  private boolean activatedCourse;
  private DifficultyLevel difficultyLevel;
  private int teacherID;



  /**Constructors*/

  public Course(String name, float durationHours, boolean activatedCourse, DifficultyLevel difficultyLevel, int teacherID) {
    this.name = name;
    this.durationHours = durationHours;
    this.activatedCourse = activatedCourse;
    this.difficultyLevel = difficultyLevel;
    this.teacherID = teacherID;
  }

  public Course(int id, String name, float durationHours, boolean activatedCourse, String difficultyLevel, int teacherID) {
    this.id = id;
    this.name = name;
    this.durationHours = durationHours;
    this.activatedCourse = activatedCourse;
    switch (difficultyLevel){
      case "Basic": this.difficultyLevel = DifficultyLevel.BASIC;
            break;
      case "Intermediate": this.difficultyLevel = DifficultyLevel.INTERMEDIATE;
            break;
      case "Advanced": this.difficultyLevel = DifficultyLevel.ADVANCED;
            break;
    }
    this.teacherID = teacherID;
  }

  public Course( String name, float durationHours, boolean activatedCourse, String difficultyLevel, int teacherID) {
    this.name = name;
    this.durationHours = durationHours;
    this.activatedCourse = activatedCourse;
    switch (difficultyLevel){
      case "Basic": this.difficultyLevel = DifficultyLevel.BASIC;
        break;
      case "Intermediate": this.difficultyLevel = DifficultyLevel.INTERMEDIATE;
        break;
      case "Advanced": this.difficultyLevel = DifficultyLevel.ADVANCED;
        break;
    }
    this.teacherID = teacherID;
  }

  public Course() {
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

  public int getTeacherID() {
    return teacherID;
  }

  public void setTeacherIDfromTeacherOBJ(Teacher teacher) {
    this.teacherID = teacher.getId();
  }

  public void setTeacherID(int teacherID) {
    this.teacherID = teacherID;
  }
}

