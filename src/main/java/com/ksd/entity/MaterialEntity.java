package com.ksd.entity;

public class MaterialEntity {
    //实体主键
    private Integer FID;
    //编码
    private String FNumber;
    //名称
    private String FName;
    //金蝶仓库关联编码
    private String F_PAEZ_Text;
    //组织
    private String F_PAEZ_OrgId;

    public Integer getFID() {
        return FID;
    }

    public void setFID(Integer FID) {
        this.FID = FID;
    }

    public String getFNumber() {
        return FNumber;
    }

    public void setFNumber(String FNumber) {
        this.FNumber = FNumber;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getF_PAEZ_Text() {
        return F_PAEZ_Text;
    }

    public void setF_PAEZ_Text(String f_PAEZ_Text) {
        F_PAEZ_Text = f_PAEZ_Text;
    }

    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }
}
