package com.ksd.entity;

import java.util.List;

public class AmountAdjustEntity {
    //    实体主键：FID
    private Integer FID;
    //    单据编号：FBillNo  (必填项)
    private String FBillNo;
    //    日期：F_PAEZ_Date
    private String F_PAEZ_Date;
    //    U8仓库编号：F_PAEZ_Base
    private String F_PAEZ_Base;
    //    金蝶仓库编号：F_PAEZ_Base1
    private String F_PAEZ_Base1;

    //    组织：F_PAEZ_OrgId
    private String F_PAEZ_OrgId;
    //    源单编号：F_PAEZ_Text
    private String F_PAEZ_Text;
    private List<AmountAdjustFEntity> amountAdjustFEntity;

    public List<AmountAdjustFEntity> getAmountAdjustFEntity() {
        return amountAdjustFEntity;
    }

    public void setAmountAdjustFEntity(List<AmountAdjustFEntity> amountAdjustFEntity) {
        this.amountAdjustFEntity = amountAdjustFEntity;
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

    public String getF_PAEZ_Base1() {
        return F_PAEZ_Base1;
    }

    public void setF_PAEZ_Base1(String f_PAEZ_Base1) {
        F_PAEZ_Base1 = f_PAEZ_Base1;
    }

    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }

    public String getF_PAEZ_Text() {
        return F_PAEZ_Text;
    }

    public void setF_PAEZ_Text(String f_PAEZ_Text) {
        F_PAEZ_Text = f_PAEZ_Text;
    }
}
