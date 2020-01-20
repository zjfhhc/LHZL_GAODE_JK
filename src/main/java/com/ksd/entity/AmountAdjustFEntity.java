package com.ksd.entity;

public class AmountAdjustFEntity {
    //    实体主键：FEntryID
    private Integer FEntryID;
    //    存货编码
    private String F_PAEZ_Base2;
    //    调整金额
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

    public Double getF_PAEZ_Amount() {
        return F_PAEZ_Amount;
    }

    public void setF_PAEZ_Amount(Double f_PAEZ_Amount) {
        F_PAEZ_Amount = f_PAEZ_Amount;
    }
}
