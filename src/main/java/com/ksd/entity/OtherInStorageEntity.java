package com.ksd.entity;

import java.util.List;

public class OtherInStorageEntity {
    private Integer FID;
    private String FBillNo;
    //源单编号
    private String F_PAEZ_Text;
    //入库日期
    private String F_PAEZ_Date;
    //币种
    private String F_PAEZ_Text1;
    //制单人
    private String F_PAEZ_Text2;
    //部门
    private String F_PAEZ_Base;

    private String F_PAEZ_OrgId;
    //仓库编码
    private String F_PAEZ_Base4;
    //金蝶部门
    private String F_PAEZ_Base2;
    //金蝶仓库
    private String F_PAEZ_Base3;

    public String getF_PAEZ_Base2() {
        return F_PAEZ_Base2;
    }

    public void setF_PAEZ_Base2(String f_PAEZ_Base2) {
        F_PAEZ_Base2 = f_PAEZ_Base2;
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

    public String getF_PAEZ_Base() {
        return F_PAEZ_Base;
    }

    public void setF_PAEZ_Base(String f_PAEZ_Base) {
        F_PAEZ_Base = f_PAEZ_Base;
    }

    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }

    public String getF_PAEZ_Base4() {
        return F_PAEZ_Base4;
    }

    public void setF_PAEZ_Base4(String f_PAEZ_Base4) {
        F_PAEZ_Base4 = f_PAEZ_Base4;
    }

    public String getF_PAEZ_Base3() {
        return F_PAEZ_Base3;
    }

    public void setF_PAEZ_Base3(String f_PAEZ_Base3) {
        F_PAEZ_Base3 = f_PAEZ_Base3;
    }

    public List<OtherInStorageFEntity> getOtherInStorageFEntity() {
        return otherInStorageFEntity;
    }

    public void setOtherInStorageFEntity(List<OtherInStorageFEntity> otherInStorageFEntity) {
        this.otherInStorageFEntity = otherInStorageFEntity;
    }

    private List<OtherInStorageFEntity> otherInStorageFEntity;
}
