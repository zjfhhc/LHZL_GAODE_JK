package com.ksd.entity;

/**
 * 实体主键：FEntryID
 * 	 存货编码：F_PAEZ_Base3
 * 	 数量：F_PAEZ_Qty
 * 	 规格型号：F_PAEZ_BaseProperty3
 * 	 单价：F_PAEZ_Price
 * 	 金额：F_PAEZ_Amount
 * 	 批号：F_PAEZ_Text2
 * 	 存货名称：F_PAEZ_BaseProperty4
 * 	 金蝶物料：F_PAEZ_Base7
 * 	 计量单位：F_PAEZ_BaseProperty6
 * 	 U8物料分组：F_ABC_BaseProperty1
 */
public class PurchaseFEntity {
    private Integer FEntryID;
    //存货编码
    private String F_PAEZ_Base3;
    //数量
    private Integer F_PAEZ_Qty;
    //规格型号
    private String F_PAEZ_BaseProperty3;
    // 单价：
    private Double F_PAEZ_Price;
    //金额
    private Double F_PAEZ_Amount;
    //批号
    private String F_PAEZ_Text2;
    //存货名称
    private String F_PAEZ_BaseProperty4;
    //金蝶物料
    private String F_PAEZ_Base7;
    //计量单位
    private String F_PAEZ_BaseProperty6;
    //u8物料分组
    private String F_ABC_BaseProperty1;

    public Integer getFEntryID() {
        return FEntryID;
    }

    public void setFEntryID(Integer FEntryID) {
        this.FEntryID = FEntryID;
    }

    public String getF_PAEZ_Base3() {
        return F_PAEZ_Base3;
    }

    public void setF_PAEZ_Base3(String f_PAEZ_Base3) {
        F_PAEZ_Base3 = f_PAEZ_Base3;
    }

    public Integer getF_PAEZ_Qty() {
        return F_PAEZ_Qty;
    }

    public void setF_PAEZ_Qty(Integer f_PAEZ_Qty) {
        F_PAEZ_Qty = f_PAEZ_Qty;
    }

    public String getF_PAEZ_BaseProperty3() {
        return F_PAEZ_BaseProperty3;
    }

    public void setF_PAEZ_BaseProperty3(String f_PAEZ_BaseProperty3) {
        F_PAEZ_BaseProperty3 = f_PAEZ_BaseProperty3;
    }

    public Double getF_PAEZ_Price() {
        return F_PAEZ_Price;
    }

    public void setF_PAEZ_Price(Double f_PAEZ_Price) {
        F_PAEZ_Price = f_PAEZ_Price;
    }

    public Double getF_PAEZ_Amount() {
        return F_PAEZ_Amount;
    }

    public void setF_PAEZ_Amount(Double f_PAEZ_Amount) {
        F_PAEZ_Amount = f_PAEZ_Amount;
    }

    public String getF_PAEZ_Text2() {
        return F_PAEZ_Text2;
    }

    public void setF_PAEZ_Text2(String f_PAEZ_Text2) {
        F_PAEZ_Text2 = f_PAEZ_Text2;
    }

    public String getF_PAEZ_BaseProperty4() {
        return F_PAEZ_BaseProperty4;
    }

    public void setF_PAEZ_BaseProperty4(String f_PAEZ_BaseProperty4) {
        F_PAEZ_BaseProperty4 = f_PAEZ_BaseProperty4;
    }

    public String getF_PAEZ_Base7() {
        return F_PAEZ_Base7;
    }

    public void setF_PAEZ_Base7(String f_PAEZ_Base7) {
        F_PAEZ_Base7 = f_PAEZ_Base7;
    }

    public String getF_PAEZ_BaseProperty6() {
        return F_PAEZ_BaseProperty6;
    }

    public void setF_PAEZ_BaseProperty6(String f_PAEZ_BaseProperty6) {
        F_PAEZ_BaseProperty6 = f_PAEZ_BaseProperty6;
    }

    public String getF_ABC_BaseProperty1() {
        return F_ABC_BaseProperty1;
    }

    public void setF_ABC_BaseProperty1(String f_ABC_BaseProperty1) {
        F_ABC_BaseProperty1 = f_ABC_BaseProperty1;
    }
}
