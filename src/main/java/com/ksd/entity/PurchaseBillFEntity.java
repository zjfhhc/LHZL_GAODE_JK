package com.ksd.entity;

public class PurchaseBillFEntity {
    private Integer FEntryID;
    //存货编码
    private String F_PAEZ_Base2;
    //数量
    private Integer F_PAEZ_Qty;
    // 单价：
    private Double F_PAEZ_Price;
    //金额
    private Double F_PAEZ_Amount;

    public Integer getFEntryID() {
        return FEntryID;
    }

    public void setFEntryID(Integer FEntryID) {
        this.FEntryID = FEntryID;
    }

    public String getF_PAEZ_Base2() {
        return F_PAEZ_Base2;
    }

    public void setF_PAEZ_Base2(String f_PAEZ_Base2) {
        F_PAEZ_Base2 = f_PAEZ_Base2;
    }

    public Integer getF_PAEZ_Qty() {
        return F_PAEZ_Qty;
    }

    public void setF_PAEZ_Qty(Integer f_PAEZ_Qty) {
        F_PAEZ_Qty = f_PAEZ_Qty;
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

    public String getF_PAEZ_Base4() {
        return F_PAEZ_Base4;
    }

    public void setF_PAEZ_Base4(String f_PAEZ_Base4) {
        F_PAEZ_Base4 = f_PAEZ_Base4;
    }

    //金蝶物料
    private String F_PAEZ_Base4;

}
