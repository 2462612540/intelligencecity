package com.ShanghaiUniversity.pojo;

import java.util.Date;

public class TbWeight {
    private Long id;

    private Date createtime;

    private Double weight;

    private Integer barrelId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getBarrelId() {
        return barrelId;
    }

    public void setBarrelId(Integer barrelId) {
        this.barrelId = barrelId;
    }
}