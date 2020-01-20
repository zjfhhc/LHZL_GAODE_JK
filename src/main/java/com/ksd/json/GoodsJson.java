package com.ksd.json;


import java.util.List;

import com.ht.entity.GoodsEntity;
import com.ht.entity.GoodsJldwEntity;
import com.ht.jindie.JindieConfig;
import com.ht.sql.GoodsSql;

import net.sf.json.JSONObject;

public class GoodsJson {
  public static void goodsJson() throws Exception {
	List<GoodsEntity> list=GoodsSql.goodsSql();		
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
		GoodsEntity goodsEntity= list.get(i);
		
		JSONObject F_PAEZ_OrgId = new JSONObject();
		F_PAEZ_OrgId.put("FNUMBER", goodsEntity.getFzz());
    	Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
    	
    	Model.put("FNumber", "wh-"+goodsEntity.getFnumber());    	
    	Model.put("FName", goodsEntity.getFname()); 
    	Model.put("F_PAEZ_Text2", goodsEntity.getFggxh()); 
    	
    	JSONObject F_PAEZ_Base = new JSONObject();
    	F_PAEZ_Base.put("FNUMBER", "wh-"+goodsEntity.getFjldw());
    	Model.put("F_PAEZ_Base", F_PAEZ_Base);
    	
    	JSONObject F_PAEZ_Base1 = new JSONObject();
    	F_PAEZ_Base1.put("FNUMBER", "wh-"+goodsEntity.getFfz());
    	Model.put("F_PAEZ_Base1", F_PAEZ_Base1);
    	
    	
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "k6fd60a74ce0b430fb9b130cc96e81913");
        //  String sqlrs="insert into kingdee_rs values ('"+goodsEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
        //  GoodsSql.SkdjbInset(sqlrs);
          
 	   

	}				
  }

}
