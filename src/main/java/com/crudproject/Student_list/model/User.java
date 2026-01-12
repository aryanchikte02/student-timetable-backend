package com.crudproject.Student_list.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // MONDAY
    private String mondaySubject;
    private String mondayTeacher;
    private String mondayLocation;

    // TUESDAY
    private String tuesdaySubject;
    private String tuesdayTeacher;
    private String tuesdayLocation;

    // WEDNESDAY
    private String wednesdaySubject;
    private String wednesdayTeacher;
    private String wednesdayLocation;

    // THURSDAY
    private String thursdaySubject;
    private String thursdayTeacher;
    private String thursdayLocation;

    // FRIDAY
    private String fridaySubject;
    private String fridayTeacher;
    private String fridayLocation;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getMondaySubject() { return mondaySubject; }
    public void setMondaySubject(String mondaySubject) { this.mondaySubject = mondaySubject; }

    public String getMondayTeacher() { return mondayTeacher; }
    public void setMondayTeacher(String mondayTeacher) { this.mondayTeacher = mondayTeacher; }

    public String getMondayLocation() { return mondayLocation; }
    public void setMondayLocation(String mondayLocation) { this.mondayLocation = mondayLocation; }

    public String getTuesdaySubject() { return tuesdaySubject; }
    public void setTuesdaySubject(String tuesdaySubject) { this.tuesdaySubject = tuesdaySubject; }

    public String getTuesdayTeacher() { return tuesdayTeacher; }
    public void setTuesdayTeacher(String tuesdayTeacher) { this.tuesdayTeacher = tuesdayTeacher; }

    public String getTuesdayLocation() { return tuesdayLocation; }
    public void setTuesdayLocation(String tuesdayLocation) { this.tuesdayLocation = tuesdayLocation; }

    public String getWednesdaySubject() { return wednesdaySubject; }
    public void setWednesdaySubject(String wednesdaySubject) { this.wednesdaySubject = wednesdaySubject; }

    public String getWednesdayTeacher() { return wednesdayTeacher; }
    public void setWednesdayTeacher(String wednesdayTeacher) { this.wednesdayTeacher = wednesdayTeacher; }

    public String getWednesdayLocation() { return wednesdayLocation; }
    public void setWednesdayLocation(String wednesdayLocation) { this.wednesdayLocation = wednesdayLocation; }

    public String getThursdaySubject() { return thursdaySubject; }
    public void setThursdaySubject(String thursdaySubject) { this.thursdaySubject = thursdaySubject; }

    public String getThursdayTeacher() { return thursdayTeacher; }
    public void setThursdayTeacher(String thursdayTeacher) { this.thursdayTeacher = thursdayTeacher; }

    public String getThursdayLocation() { return thursdayLocation; }
    public void setThursdayLocation(String thursdayLocation) { this.thursdayLocation = thursdayLocation; }

    public String getFridaySubject() { return fridaySubject; }
    public void setFridaySubject(String fridaySubject) { this.fridaySubject = fridaySubject; }

    public String getFridayTeacher() { return fridayTeacher; }
    public void setFridayTeacher(String fridayTeacher) { this.fridayTeacher = fridayTeacher; }

    public String getFridayLocation() { return fridayLocation; }
    public void setFridayLocation(String fridayLocation) { this.fridayLocation = fridayLocation; }
}
