package com.ksd;

import com.ksd.json.*;
import org.junit.Test;

public class app {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        //XsthdJson.xsthd();
        //JcGoodsJson.jcGoods();
       // TestJson.test();
        OutputStorageJson.test();
    }


    public void materialTest() throws Exception {
        MaterialJson.test();
    }

    public void storageTest() throws Exception {
        OutputStorageJson.test();
    }

    @Test
    public void purchaseInTest() throws Exception {
        PurchaseInJson.test();
    }

    @Test
    public void purchaseBillTest() throws Exception{
        PurchaseBillJson.test();
    }

    @Test
    public void materialOutStorageTest() throws Exception{
        MaterialOutStorageJson.test();
    }
    @Test
    public void materialOutStorageTestTest() throws Exception{
        MaterialOutStorageJsonTest.test();
    }

    @Test
    public void OtherInStorageTest() throws Exception{
        OtherInStorageJson.test();
    }
    @Test
    public void OtherOutStorageTest() throws Exception{
        OtherOutStorageJson.test();
    }
    //金额调整单
    @Test
    public void AmountAdjustTest() throws Exception{
        AmountAdjustJson.test();
    }
    //盘点单
    @Test
    public void CheckTest() throws Exception{
        CheckJson.test();
    }

}
