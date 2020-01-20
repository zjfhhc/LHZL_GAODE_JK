package com.ksd.entity;

import java.util.List;

public class PurchaseBillEntity {
    private Integer FID;
    //单据编号
    private String FBillNo;
    //源单编号
    private String F_PAEZ_Text;
    //发票号
    private String F_PAEZ_Text1;
    //开票日期
    private String F_PAEZ_Date;
    //u8供应商编码
    private String F_PAEZ_Base;
    //币种
    private String F_PAEZ_Text2;
    //制单人
    private String F_PAEZ_Text3;
    //金蝶供应商编码
    private String F_PAEZ_Base1;
    private String F_PAEZ_OrgId;
    private List<PurchaseBillFEntity> purchaseBillFEntity;

    public String getF_PAEZ_Text2() {
        return F_PAEZ_Text2;
    }

    public void setF_PAEZ_Text2(String f_PAEZ_Text2) {
        F_PAEZ_Text2 = f_PAEZ_Text2;
    }

    public String getF_PAEZ_Text3() {
        return F_PAEZ_Text3;
    }

    public void setF_PAEZ_Text3(String f_PAEZ_Text3) {
        F_PAEZ_Text3 = f_PAEZ_Text3;
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

    public String getF_PAEZ_Base() {
        return F_PAEZ_Base;
    }

    public void setF_PAEZ_Base(String f_PAEZ_Base) {
        F_PAEZ_Base = f_PAEZ_Base;
    }

    public String getF_PAEZ_Date() {
        return F_PAEZ_Date;
    }

    public void setF_PAEZ_Date(String f_PAEZ_Date) {
        F_PAEZ_Date = f_PAEZ_Date;
    }

    public String getF_PAEZ_Base1() {
        return F_PAEZ_Base1;
    }

    public void setF_PAEZ_Base1(String f_PAEZ_Base1) {
        F_PAEZ_Base1 = f_PAEZ_Base1;
    }



    public String getF_PAEZ_Text1() {
        return F_PAEZ_Text1;
    }

    public void setF_PAEZ_Text1(String f_PAEZ_Text1) {
        F_PAEZ_Text1 = f_PAEZ_Text1;
    }


    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }

    public List<PurchaseBillFEntity> getPurchaseBillFEntity() {
        return purchaseBillFEntity;
    }

    public void setPurchaseBillFEntity(List<PurchaseBillFEntity> purchaseBillFEntity) {
        this.purchaseBillFEntity = purchaseBillFEntity;
    }


}
