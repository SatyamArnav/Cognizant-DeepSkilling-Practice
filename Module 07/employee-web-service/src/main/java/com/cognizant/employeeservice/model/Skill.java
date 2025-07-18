package com.cognizant.employeeservice.model;

public class Skill {
    private int id;
    private String name;

    // Required: setters (Spring XML uses setters to inject values)
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    // Optional: Add getters if needed for response display
    public int getId() { return id; }
    public String getName() { return name; }
}
