package com.ksd.json;

import com.ksd.entity.TestEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.TestSql;
import net.sf.json.JSONObject;

import java.util.List;

public class TestJson {
    public static void test() throws Exception {
        List<TestEntity> list= TestSql.SkdtQuery();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            JSONObject jsonobject = new JSONObject();
            int data[] = null;
            jsonobject.put("Creator", "");
            jsonobject.put("NeedUpDateFields", data);
            jsonobject.put("NeedReturnFields", data);
            jsonobject.put("IsDeleteEntry", true);
            jsonobject.put("SubSystemId", "");
            jsonobject.put("IsVerifyBaseDataField", false);
            jsonobject.put("IsEntryBatchFill", true);
            jsonobject.put("ValidateFlag", true);
            jsonobject.put("NumberSearch", true);
            jsonobject.put("InterationFlags", "");
            jsonobject.put("IsAutoSubmitAndAudit" ,true);
            JSONObject Model = new JSONObject();
            Model.put("FID", 0);
            TestEntity testEntity= list.get(i);
            Model.put("FNumber", testEntity.getFNumber());
            Model.put("FName", testEntity.getFName());
            Model.put("F_PAEZ_Text2", "123");


            JSONObject F_PAEZ_OrgId = new JSONObject();
            F_PAEZ_OrgId.put("FNumber", "100");
            Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);

//            JSONObject FNUMBER_USERORDID = new JSONObject();
//            FNUMBER_USERORDID.put("FNUMBER", "100");
//            Model.put("FUseOrgId", FNUMBER_USERORDID);
//
//
//            JSONObject FNUMBER_CREATERORDID = new JSONObject();
//            FNUMBER_CREATERORDID.put("FNUMBER", "100");
//            Model.put("FID", FNUMBER_CREATERORDID);
//            Model.put("FNumber", testEntity.getFNumber());
//            Model.put("FName", testEntity.getFName());
//            Model.put("F_PAEZ_Text", testEntity.getF_PAEZ_Text());
//
//            JSONObject FNUMBER_Group = new JSONObject();
//            FNUMBER_Group.put("FNUMBER", "100.C");
//            Model.put("FMaterialGroup", FNUMBER_Group);
//            Model.put("FIsSalseByNet", false);
//
//            JSONObject SubHeadEntity = new JSONObject();
//            SubHeadEntity.put("FErpClsID", "14");
//
//            JSONObject SubHeadEntity_FCategoryID = new JSONObject();
//            SubHeadEntity_FCategoryID.put("FNumber", "CHLB05_SYS");
//            SubHeadEntity.put("FCategoryID", SubHeadEntity_FCategoryID);
//            JSONObject SubHeadEntity_FTaxType = new JSONObject();
//            SubHeadEntity_FTaxType.put("FNumber", "WLDSFL01_SYS");
//            SubHeadEntity.put("FTaxType", SubHeadEntity_FTaxType);
//            JSONObject SubHeadEntity_FTaxRateId = new JSONObject();
//            SubHeadEntity_FTaxRateId.put("FNumber", "SL02_SYS");
//            SubHeadEntity.put("FTaxRateId", SubHeadEntity_FTaxRateId);
//            JSONObject SubHeadEntity_FBaseUnitId = new JSONObject();
//            SubHeadEntity_FBaseUnitId.put("FNumber", "01");
//            SubHeadEntity.put("FBaseUnitId", SubHeadEntity_FBaseUnitId);
//            SubHeadEntity.put("FIsPurchase", true);
//            SubHeadEntity.put("FIsInventory", true);
//            SubHeadEntity.put("FIsSubContract", true);
//            SubHeadEntity.put("FIsSale", true);
//            SubHeadEntity.put("FIsProduce", true);
//            SubHeadEntity.put("FIsAsset", true);
//            JSONObject SubHeadEntity_FWEIGHTUNITID = new JSONObject();
//            SubHeadEntity_FWEIGHTUNITID.put("FNumber", "kg");
//            SubHeadEntity.put("FWEIGHTUNITID", SubHeadEntity_FWEIGHTUNITID);
//            JSONObject SubHeadEntity_FVOLUMEUNITID = new JSONObject();
//            SubHeadEntity_FVOLUMEUNITID.put("FNumber", "m");
//            SubHeadEntity.put("FVOLUMEUNITID", SubHeadEntity_FVOLUMEUNITID);


            jsonobject.put("Model",Model);
            System.out.println(jsonobject);
            String  result= JindieConfig.name(jsonobject.toString(), "k6fd60a74ce0b430fb9b130cc96e81913");
//            String sqlrs="insert into kingdee_rs values ('"+testEntity.getFNumber()+"','"+result+"','k_Goods',GETDATE())";
//            TestSql.SkdtInset(sqlrs);
//            JSONObject json = JSONObject.fromObject(result);
//            JSONObject Result=(JSONObject) json.get("Result");
//            String number=(String) Result.get("Number");
//            JSONObject ResponseStatus=(JSONObject) Result.get("ResponseStatus");
//            boolean ErrorCode=(boolean) ResponseStatus.get("IsSuccess");
//            if(ErrorCode){
//                System.out.println("k_xsckd接口同步成功"+number+","+testEntity.getFNumber());
//                String sql="insert into kingdee_rz values ('"+testEntity.getFNumber()+"','"+number+"','k_Goods',GETDATE())";
//                JcGoodsSql.SkdjbInset(sql);
//            }
//

        }
    }
}
