package com.ksd.entity;

import java.util.List;

public class MaterialOutStorageEntity {
    private List<MaterialOutStorageFEntity> materialOutStorageFEntity;
    //    实体主键：FID
    private Integer FID;
    //    单据编号：FBillNo  (必填项)
    private String FBillNo;
    //    源单编号：F_PAEZ_Text
    private String F_PAEZ_Text;
    //    出库日期：F_PAEZ_Date
    private String F_PAEZ_Date;
    //    币种：F_PAEZ_Text1
    private String F_PAEZ_Text1;
    //    制单人：F_PAEZ_Text2
    private String F_PAEZ_Text2;
    //    部门：F_PAEZ_Base
    private String F_PAEZ_Base;
    //    组织：F_PAEZ_OrgId  (必填项)
    private String F_PAEZ_OrgId;
    //    仓库编码：F_PAEZ_Base2
    private String F_PAEZ_Base2;

    public List<MaterialOutStorageFEntity> getMaterialOutStorageFEntity() {
        return materialOutStorageFEntity;
    }

    public void setMaterialOutStorageFEntity(List<MaterialOutStorageFEntity> materialOutStorageFEntity) {
        this.materialOutStorageFEntity = materialOutStorageFEntity;
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

    public String getF_PAEZ_Base2() {
        return F_PAEZ_Base2;
    }

    public void setF_PAEZ_Base2(String f_PAEZ_Base2) {
        F_PAEZ_Base2 = f_PAEZ_Base2;
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

    public String getF_PAEZ_Text4() {
        return F_PAEZ_Text4;
    }

    public void setF_PAEZ_Text4(String f_PAEZ_Text4) {
        F_PAEZ_Text4 = f_PAEZ_Text4;
    }

    public String getF_PAEZ_Base6() {
        return F_PAEZ_Base6;
    }

    public void setF_PAEZ_Base6(String f_PAEZ_Base6) {
        F_PAEZ_Base6 = f_PAEZ_Base6;
    }

    public String getF_PAEZ_Text5() {
        return F_PAEZ_Text5;
    }

    public void setF_PAEZ_Text5(String f_PAEZ_Text5) {
        F_PAEZ_Text5 = f_PAEZ_Text5;
    }

    public String getF_PAEZ_Text6() {
        return F_PAEZ_Text6;
    }

    public void setF_PAEZ_Text6(String f_PAEZ_Text6) {
        F_PAEZ_Text6 = f_PAEZ_Text6;
    }

    public String getF_PAEZ_Base7() {
        return F_PAEZ_Base7;
    }

    public void setF_PAEZ_Base7(String f_PAEZ_Base7) {
        F_PAEZ_Base7 = f_PAEZ_Base7;
    }

    public String getF_PAEZ_Base8() {
        return F_PAEZ_Base8;
    }

    public void setF_PAEZ_Base8(String f_PAEZ_Base8) {
        F_PAEZ_Base8 = f_PAEZ_Base8;
    }

    //    金蝶部门：F_PAEZ_Base4
    private String F_PAEZ_Base4;
    //    金蝶仓库：F_PAEZ_Base5
    private String F_PAEZ_Base5;
    //    项目编号：F_PAEZ_Text4
    private String F_PAEZ_Text4;
    //    研发项目：F_PAEZ_Base6
    private String F_PAEZ_Base6;
    //    北京研发项目：F_PAEZ_Text5
    private String F_PAEZ_Text5;
    //    北京地区：F_PAEZ_Text6
    private String F_PAEZ_Text6;
    //    北京研发项目G：F_PAEZ_Base7
    private String F_PAEZ_Base7;
    //    北京地区G：F_PAEZ_Base8
    private String F_PAEZ_Base8;
}
