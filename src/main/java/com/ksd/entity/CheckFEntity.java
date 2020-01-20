package com.ksd.entity;

public class CheckFEntity {
    //    实体主键：FEntryID
    private Integer FEntryID;
    //    物料编码：F_PAEZ_Base1
    private String F_PAEZ_Base1;
    //    金蝶物料
    private String F_PAEZ_Base2;
    //    账面数量：F_PAEZ_Qty
    private Integer F_PAEZ_Qty;
    //    盘点数量
    private Integer F_PAEZ_Qty1;
    //    单价：F_PAEZ_Price
    private Double F_PAEZ_Price;
    //    金额：F_PAEZ_Amount
    private Double F_PAEZ_Amount;
    //    总成本金额：F_PAEZ_Amount1
    private Double F_PAEZ_Amount1;
    //    批号：F_PAEZ_Text3
    private String F_PAEZ_Text3;
    //    盘点差异：F_ABC_Qty
    private String F_ABC_Qty;

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

    public Integer getF_PAEZ_Qty1() {
        return F_PAEZ_Qty1;
    }

    public void setF_PAEZ_Qty1(Integer f_PAEZ_Qty1) {
        F_PAEZ_Qty1 = f_PAEZ_Qty1;
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

    public Double getF_PAEZ_Amount1() {
        return F_PAEZ_Amount1;
    }

    public void setF_PAEZ_Amount1(Double f_PAEZ_Amount1) {
        F_PAEZ_Amount1 = f_PAEZ_Amount1;
    }

    public String getF_PAEZ_Text3() {
        return F_PAEZ_Text3;
    }

    public void setF_PAEZ_Text3(String f_PAEZ_Text3) {
        F_PAEZ_Text3 = f_PAEZ_Text3;
    }

    public String getF_ABC_Qty() {
        return F_ABC_Qty;
    }

    public void setF_ABC_Qty(String f_ABC_Qty) {
        F_ABC_Qty = f_ABC_Qty;
    }
}
