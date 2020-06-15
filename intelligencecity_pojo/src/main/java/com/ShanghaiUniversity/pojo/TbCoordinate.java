package com.ShanghaiUniversity.pojo;

import java.io.Serializable;

public class TbCoordinate implements Serializable {
    private Long id;

    private Double longitude;

    private Double latitude;

    private String address;

    private String picture;

    private String othher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getOthher() {
        return othher;
    }

    public void setOthher(String othher) {
        this.othher = othher == null ? null : othher.trim();
    }
}