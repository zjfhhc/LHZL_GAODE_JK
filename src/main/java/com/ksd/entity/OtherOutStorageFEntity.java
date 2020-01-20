package com.ksd.entity;

public class OtherOutStorageFEntity {
    private Integer FEntryID;
    //存货编码
    private String F_PAEZ_Base1;
    //金蝶物料
    private String F_PAEZ_Base5;
    //数量
    private Integer F_PAEZ_Qty;
    //单价
    private Double F_PAEZ_Price;
    //金额
    private Double F_PAEZ_Amount;
    private Double F_PAEZ_Amount1;
    //
    private String F_PAEZ_Text3;

    public String getF_PAEZ_Base5() {
        return F_PAEZ_Base5;
    }

    public void setF_PAEZ_Base5(String f_PAEZ_Base5) {
        F_PAEZ_Base5 = f_PAEZ_Base5;
    }

    public Double getF_PAEZ_Amount1() {
        return F_PAEZ_Amount1;
    }

    public void setF_PAEZ_Amount1(Double f_PAEZ_Amount1) {
        F_PAEZ_Amount1 = f_PAEZ_Amount1;
    }

    public Integer getFEntryID() {
        return FEntryID;
    }

    public void setFEntryID(Integer FEntryID) {
        this.FEntryID = FEntryID;
    }

    public String getF_PAEZ_Base1() {
        return F_PAEZ_Base1;
    }

    public void setF_PAEZ_Base1(String f_PAEZ_Base1) {
        F_PAEZ_Base1 = f_PAEZ_Base1;
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

    public String getF_PAEZ_Text3() {
        return F_PAEZ_Text3;
    }

    public void setF_PAEZ_Text3(String f_PAEZ_Text3) {
        F_PAEZ_Text3 = f_PAEZ_Text3;
    }
}
