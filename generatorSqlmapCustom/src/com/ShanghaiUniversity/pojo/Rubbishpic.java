package com.ShanghaiUniversity.pojo;

import java.util.Date;

public class Rubbishpic {
    private Integer id;

    private Integer rubbishNumber;

    private String rubbishPath;

    private Date rubbishTime;

    private String rubbishLocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRubbishNumber() {
        return rubbishNumber;
    }

    public void setRubbishNumber(Integer rubbishNumber) {
        this.rubbishNumber = rubbishNumber;
    }

    public String getRubbishPath() {
        return rubbishPath;
    }

    public void setRubbishPath(String rubbishPath) {
        this.rubbishPath = rubbishPath == null ? null : rubbishPath.trim();
    }

    public Date getRubbishTime() {
        return rubbishTime;
    }

    public void setRubbishTime(Date rubbishTime) {
        this.rubbishTime = rubbishTime;
    }

    public String getRubbishLocation() {
        return rubbishLocation;
    }

    public void setRubbishLocation(String rubbishLocation) {
        this.rubbishLocation = rubbishLocation == null ? null : rubbishLocation.trim();
    }
}