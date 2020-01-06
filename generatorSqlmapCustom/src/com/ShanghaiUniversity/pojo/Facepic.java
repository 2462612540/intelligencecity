package com.ShanghaiUniversity.pojo;

import java.util.Date;

public class Facepic {
    private Integer id;

    private Integer faceNumber;

    private String facePath;

    private Date faceTime;

    private String faceLocation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFaceNumber() {
        return faceNumber;
    }

    public void setFaceNumber(Integer faceNumber) {
        this.faceNumber = faceNumber;
    }

    public String getFacePath() {
        return facePath;
    }

    public void setFacePath(String facePath) {
        this.facePath = facePath == null ? null : facePath.trim();
    }

    public Date getFaceTime() {
        return faceTime;
    }

    public void setFaceTime(Date faceTime) {
        this.faceTime = faceTime;
    }

    public String getFaceLocation() {
        return faceLocation;
    }

    public void setFaceLocation(String faceLocation) {
        this.faceLocation = faceLocation == null ? null : faceLocation.trim();
    }
}