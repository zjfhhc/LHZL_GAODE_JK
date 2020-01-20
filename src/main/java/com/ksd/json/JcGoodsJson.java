package com.ksd.json;


import java.util.List;

import com.ksd.entity.JcGoodsEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.JcGoodsSql;

import net.sf.json.JSONObject;

public class JcGoodsJson {
  public static void jcGoods() throws Exception {
	List<JcGoodsEntity> list=JcGoodsSql.SkdjbQuery();		
	//System.out.println(list);
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
		JcGoodsEntity jcGoodsEntity= list.get(i);
		
		JSONObject FNUMBER_USERORDID = new JSONObject();
		FNUMBER_USERORDID.put("FNUMBER", "100");
    	Model.put("FUseOrgId", FNUMBER_USERORDID);
    	
    	
    	JSONObject FNUMBER_CREATERORDID = new JSONObject();
    	FNUMBER_CREATERORDID.put("FNUMBER", "100");
    	Model.put("FCreateOrgId", FNUMBER_CREATERORDID);
    	Model.put("FNumber", jcGoodsEntity.getFnumber());
    	Model.put("FName", jcGoodsEntity.getFname());
    	Model.put("FSpecification", jcGoodsEntity.getFspecification());
    	
    	JSONObject FNUMBER_Group = new JSONObject();
    	FNUMBER_Group.put("FNUMBER", "100.C");
    	Model.put("FMaterialGroup", FNUMBER_Group);
    	Model.put("FIsSalseByNet", false);
    	
    	JSONObject SubHeadEntity = new JSONObject();
    	SubHeadEntity.put("FErpClsID", "14");
    	
    	JSONObject SubHeadEntity_FCategoryID = new JSONObject();
    	SubHeadEntity_FCategoryID.put("FNumber", "CHLB05_SYS");
    	SubHeadEntity.put("FCategoryID", SubHeadEntity_FCategoryID);
    	JSONObject SubHeadEntity_FTaxType = new JSONObject();
    	SubHeadEntity_FTaxType.put("FNumber", "WLDSFL01_SYS");
    	SubHeadEntity.put("FTaxType", SubHeadEntity_FTaxType);
    	JSONObject SubHeadEntity_FTaxRateId = new JSONObject();
    	SubHeadEntity_FTaxRateId.put("FNumber", "SL02_SYS");
    	SubHeadEntity.put("FTaxRateId", SubHeadEntity_FTaxRateId);
    	JSONObject SubHeadEntity_FBaseUnitId = new JSONObject();
    	SubHeadEntity_FBaseUnitId.put("FNumber", "01");
    	SubHeadEntity.put("FBaseUnitId", SubHeadEntity_FBaseUnitId);
    	SubHeadEntity.put("FIsPurchase", true);
    	SubHeadEntity.put("FIsInventory", true);
    	SubHeadEntity.put("FIsSubContract", true);
    	SubHeadEntity.put("FIsSale", true);
    	SubHeadEntity.put("FIsProduce", true);
    	SubHeadEntity.put("FIsAsset", true);
    	JSONObject SubHeadEntity_FWEIGHTUNITID = new JSONObject();
    	SubHeadEntity_FWEIGHTUNITID.put("FNumber", "kg");
    	SubHeadEntity.put("FWEIGHTUNITID", SubHeadEntity_FWEIGHTUNITID);
    	JSONObject SubHeadEntity_FVOLUMEUNITID = new JSONObject();
    	SubHeadEntity_FVOLUMEUNITID.put("FNumber", "m");
    	SubHeadEntity.put("FVOLUMEUNITID", SubHeadEntity_FVOLUMEUNITID);
    	
    	Model.put("SubHeadEntity", SubHeadEntity);
    	Model.put("FMaterialGroup", FNUMBER_Group);
    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "BD_MATERIAL");
          String sqlrs="insert into kingdee_rs values ('"+jcGoodsEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
          JcGoodsSql.SkdjbInset(sqlrs);
          JSONObject json = JSONObject.fromObject(result); 
 	      JSONObject Result=(JSONObject) json.get("Result");
 	      String number=(String) Result.get("Number");
 	      JSONObject ResponseStatus=(JSONObject) Result.get("ResponseStatus");
 	       boolean ErrorCode=(boolean) ResponseStatus.get("IsSuccess");
 	       if(ErrorCode){
 		    System.out.println("k_xsckd接口同步成功"+number+","+jcGoodsEntity.getFnumber());
 	    	 String sql="insert into kingdee_rz values ('"+jcGoodsEntity.getFnumber()+"','"+number+"','k_Goods',GETDATE())";
 	    	JcGoodsSql.SkdjbInset(sql);
 	    }
 	   

	}				
  }

}
