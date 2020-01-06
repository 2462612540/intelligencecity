package com.ShanghaiUniversity.pojo;

public class Barrel {
    private Integer id;

    private Integer barrelNumber;

    private Double totalWeight;

    private Double currentWeight;

    private Double purity;

    private Double restCapacity;

    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBarrelNumber() {
        return barrelNumber;
    }

    public void setBarrelNumber(Integer barrelNumber) {
        this.barrelNumber = barrelNumber;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public Double getPurity() {
        return purity;
    }

    public void setPurity(Double purity) {
        this.purity = purity;
    }

    public Double getRestCapacity() {
        return restCapacity;
    }

    public void setRestCapacity(Double restCapacity) {
        this.restCapacity = restCapacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}