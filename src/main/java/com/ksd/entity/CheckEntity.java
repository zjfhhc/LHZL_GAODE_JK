package com.ksd.entity;

import java.util.List;

public class CheckEntity {
    //    实体主键：FID
    private Integer FID;
    //    单据编号：FBillNo  (必填项)
    private String FBillNo;
    //    源单编号：F_PAEZ_Text
    private String F_PAEZ_Text;
    //    币种：F_PAEZ_Text1
    private String F_PAEZ_Text1;
    //    制单人：F_PAEZ_Text2
    private String F_PAEZ_Text2;
    //    盘点日期：F_PAEZ_Date
    private String F_PAEZ_Date;
    //    部门：F_PAEZ_Base
    private String F_PAEZ_Base;
    //    组织：F_PAEZ_OrgId  (必填项)
    private String F_PAEZ_OrgId;
    //    仓库编码：F_PAEZ_Base3
    private String F_PAEZ_Base3;
    //    金蝶部门：F_PAEZ_Base4
    private String F_PAEZ_Base4;
    //    金蝶仓库：F_PAEZ_Base5
    private String F_PAEZ_Base5;
    private List<CheckFEntity> checkFEntity;

    public List<CheckFEntity> getCheckFEntity() {
        return checkFEntity;
    }

    public void setCheckFEntity(List<CheckFEntity> checkFEntity) {
        this.checkFEntity = checkFEntity;
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

    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }

    public String getF_PAEZ_Base3() {
        return F_PAEZ_Base3;
    }

    public void setF_PAEZ_Base3(String f_PAEZ_Base3) {
        F_PAEZ_Base3 = f_PAEZ_Base3;
    }

    public String getF_PAEZ_Base4() {
        return F_PAEZ_Base4;
    }

    public void setF_PAEZ_Base4(String f_PAEZ_Base4) {
        F_PAEZ_Base4 = f_PAEZ_Base4;
    }

    public String getF_PAEZ_Base5() {
        return F_PAEZ_Base5;
    }

    public void setF_PAEZ_Base5(String f_PAEZ_Base5) {
        F_PAEZ_Base5 = f_PAEZ_Base5;
    }
}
