package com.ShanghaiUniversity.pojo;

public class TbBarrel {
    private Long id;

    private Double totalweight;

    private Integer purity;

    private Double restweight;

    private String address;

    private String company;

    private String status;

    private String other;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(Double totalweight) {
        this.totalweight = totalweight;
    }

    public Integer getPurity() {
        return purity;
    }

    public void setPurity(Integer purity) {
        this.purity = purity;
    }

    public Double getRestweight() {
        return restweight;
    }

    public void setRestweight(Double restweight) {
        this.restweight = restweight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}