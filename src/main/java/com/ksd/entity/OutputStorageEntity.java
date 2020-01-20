package com.ksd.entity;

import java.util.List;

public class OutputStorageEntity {
    // 实体主键：FID
    private Integer FID;
    // 单据编号：FBillNo  (必填项)
    private String FBillNo;
    //源单编号
    private String F_PAEZ_Text;
    //出库日期
    private String F_PAEZ_Date;
    //u8客户编码
    private String F_PAEZ_Base;
    //币种
    private String F_PAEZ_Text1;
    //制单人
    private String F_PAEZ_Text2;
    //金蝶客户编码
    private String F_PAEZ_Base1;
    //仓库编码
    private String F_PAEZ_Base3;
    //组织
    private String F_PAEZ_OrgId;
    //金蝶仓库
    private String F_ABC_Base;
    //实体主键
    private String FEntity;

    private List<StorageFEntity> StorageFEntity;

    public List<com.ksd.entity.StorageFEntity> getStorageFEntity() {
        return StorageFEntity;
    }

    public void setStorageFEntity(List<com.ksd.entity.StorageFEntity> storageFEntity) {
        StorageFEntity = storageFEntity;
    }

    public Integer getFID() {
        return FID;
    }

    public void setFID(Integer FID) {
        this.FID = FID;
    }

    public String getFBillNo() {
        return FBillNo;
    }

    public void setFBillNo(String FBillNo) {
        this.FBillNo = FBillNo;
    }

    public String getF_PAEZ_Text() {
        return F_PAEZ_Text;
    }

    public void setF_PAEZ_Text(String f_PAEZ_Text) {
        F_PAEZ_Text = f_PAEZ_Text;
    }

    public String getF_PAEZ_Date() {
        return F_PAEZ_Date;
    }

    public void setF_PAEZ_Date(String f_PAEZ_Date) {
        F_PAEZ_Date = f_PAEZ_Date;
    }

    public String getF_PAEZ_Base() {
        return F_PAEZ_Base;
    }

    public void setF_PAEZ_Base(String f_PAEZ_Base) {
        F_PAEZ_Base = f_PAEZ_Base;
    }

    public String getF_PAEZ_Text1() {
        return F_PAEZ_Text1;
    }

    public void setF_PAEZ_Text1(String f_PAEZ_Text1) {
        F_PAEZ_Text1 = f_PAEZ_Text1;
    }

    public String getF_PAEZ_Text2() {
        return F_PAEZ_Text2;
    }

    public void setF_PAEZ_Text2(String f_PAEZ_Text2) {
        F_PAEZ_Text2 = f_PAEZ_Text2;
    }

    public String getF_PAEZ_Base1() {
        return F_PAEZ_Base1;
    }

    public void setF_PAEZ_Base1(String f_PAEZ_Base1) {
        F_PAEZ_Base1 = f_PAEZ_Base1;
    }

    public String getF_PAEZ_Base3() {
        return F_PAEZ_Base3;
    }

    public void setF_PAEZ_Base3(String f_PAEZ_Base3) {
        F_PAEZ_Base3 = f_PAEZ_Base3;
    }

    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }

    public String getF_ABC_Base() {
        return F_ABC_Base;
    }

    public void setF_ABC_Base(String f_ABC_Base) {
        F_ABC_Base = f_ABC_Base;
    }

    public String getFEntity() {
        return FEntity;
    }

    public void setFEntity(String FEntity) {
        this.FEntity = FEntity;
    }
}
