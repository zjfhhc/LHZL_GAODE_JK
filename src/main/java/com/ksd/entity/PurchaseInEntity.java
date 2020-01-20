package com.ksd.entity;

import lombok.Data;

import java.util.List;

/**
 * "Model": {
 *         "FID": 0,
 *         "FBillNo": "",
 *         "F_PAEZ_Text": "",
 *         "F_PAEZ_Base": {
 *             "FNUMBER": ""
 *         },
 *         "F_PAEZ_Date": "1900-01-01",
 *         "F_PAEZ_Base1": {
 *             "FNUMBER": ""
 *         },
 *         "F_PAEZ_Base2": {
 *             "FNUMBER": ""
 *         },
 *         "F_PAEZ_Text1": "",
 *         "F_PAEZ_Base6": {
 *             "FNUMBER": ""
 *         },
 *         "F_PAEZ_OrgId": {
 *             "FNumber": ""
 *         },
 *         "F_PAEZ_Base5": {
 *             "FNUMBER": ""
 *         },
 *         "F_PAEZ_Base4": {
 *             "FNUMBER": ""
 *         },
 *         "F_PAEZ_Base8": {
 *             "FNUMBER": ""
 *         },
 *         "FEntity": [
 *             {
 *                 "FEntryID": 0,
 *                 "F_PAEZ_Base3": {
 *                     "FNUMBER": ""
 *                 },
 *                 "F_PAEZ_Base7": {
 *                     "FNUMBER": ""
 *                 },
 *                 "F_PAEZ_Qty": 0,
 *                 "F_PAEZ_Price": 0,
 *                 "F_PAEZ_Amount": 0,
 *                 "F_PAEZ_Text2": ""
 *             }
 *         ]
 *     }
 */
@Data
public class PurchaseInEntity {
    /*
     *单据头：FBillHead
	 实体主键：FID
	 单据编号：FBillNo  (必填项)
	 数据状态：FDocumentStatus
	 源单编号：F_PAEZ_Text
	 供应商编码：F_PAEZ_Base
	 u8供应商：F_PAEZ_BaseProperty
	 入库日期：F_PAEZ_Date
	 部门编码：F_PAEZ_Base1
	 u8部门：F_PAEZ_BaseProperty1
	 业务员：F_PAEZ_Base2
	 币种：F_PAEZ_Text1
	 金蝶供应商：F_PAEZ_Base6
	 金蝶供应商名称：F_PAEZ_BaseProperty5
	 组织：F_PAEZ_OrgId  (必填项)
	 仓库编码：F_PAEZ_Base5
	 仓库名称：F_PAEZ_BaseProperty7
	 金蝶部门：F_PAEZ_Base4
	 金蝶仓库：F_PAEZ_Base8
	 仓库核算：F_ABC_BaseProperty
     */
    private Integer FID;
    private String FBillNo;
    //源单编号
    private String F_PAEZ_Text;
    //供应商编码
    private String F_PAEZ_Base;
    //入库日期
    private String F_PAEZ_Date;
    //部门编码
    private String F_PAEZ_Base1;
    //业务员
    private String F_PAEZ_Base2;
    //币种
    private String F_PAEZ_Text1;
    //金蝶供应商
    private String F_PAEZ_Base6;
    private String F_PAEZ_OrgId;
    //仓库编码
    private String F_PAEZ_Base5;
    //金蝶部门
    private String F_PAEZ_Base4;
    //金蝶仓库
    private String F_PAEZ_Base8;

    private List<PurchaseFEntity> purchaseFEntity;

    public List<PurchaseFEntity> getPurchaseFEntity() {
        return purchaseFEntity;
    }

    public void setPurchaseFEntity(List<PurchaseFEntity> purchaseFEntity) {
        this.purchaseFEntity = purchaseFEntity;
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

    public String getF_PAEZ_Base2() {
        return F_PAEZ_Base2;
    }

    public void setF_PAEZ_Base2(String f_PAEZ_Base2) {
        F_PAEZ_Base2 = f_PAEZ_Base2;
    }

    public String getF_PAEZ_Text1() {
        return F_PAEZ_Text1;
    }

    public void setF_PAEZ_Text1(String f_PAEZ_Text1) {
        F_PAEZ_Text1 = f_PAEZ_Text1;
    }

    public String getF_PAEZ_Base6() {
        return F_PAEZ_Base6;
    }

    public void setF_PAEZ_Base6(String f_PAEZ_Base6) {
        F_PAEZ_Base6 = f_PAEZ_Base6;
    }

    public String getF_PAEZ_OrgId() {
        return F_PAEZ_OrgId;
    }

    public void setF_PAEZ_OrgId(String f_PAEZ_OrgId) {
        F_PAEZ_OrgId = f_PAEZ_OrgId;
    }

    public String getF_PAEZ_Base5() {
        return F_PAEZ_Base5;
    }

    public void setF_PAEZ_Base5(String f_PAEZ_Base5) {
        F_PAEZ_Base5 = f_PAEZ_Base5;
    }

    public String getF_PAEZ_Base4() {
        return F_PAEZ_Base4;
    }

    public void setF_PAEZ_Base4(String f_PAEZ_Base4) {
        F_PAEZ_Base4 = f_PAEZ_Base4;
    }

    public String getF_PAEZ_Base8() {
        return F_PAEZ_Base8;
    }

    public void setF_PAEZ_Base8(String f_PAEZ_Base8) {
        F_PAEZ_Base8 = f_PAEZ_Base8;
    }
}
