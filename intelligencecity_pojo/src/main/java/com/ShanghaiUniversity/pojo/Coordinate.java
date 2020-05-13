package com.ShanghaiUniversity.pojo;

import java.io.Serializable;

public class Coordinate implements Serializable {
    private Integer id;

    private Double longitude;

    private Double latitude;

    private String picture;

    private String other;

    @Override
    public String toString() {
        return "Coordinate{" +
                "id=" + id +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", picture='" + picture + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}