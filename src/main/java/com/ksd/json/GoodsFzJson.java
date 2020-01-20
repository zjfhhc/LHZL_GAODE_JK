package com.ksd.json;


import java.util.List;

import com.ksd.entity.GoodsFzEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.GoodsFzSql;

import net.sf.json.JSONObject;

public class GoodsFzJson {
  public static void jcGoods() throws Exception {
	List<GoodsFzEntity> list=GoodsFzSql.uftdjbQuery();		
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
		GoodsFzEntity goodsFzEntity= list.get(i);
		
		JSONObject F_PAEZ_OrgId = new JSONObject();
		F_PAEZ_OrgId.put("FNUMBER", goodsFzEntity.getFzz());
    	Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
    	
    	Model.put("FNumber", "wh-"+goodsFzEntity.getFnumber());    	
    	Model.put("FName", goodsFzEntity.getFname()); 
    	
    	
    	

    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "k02405c752c084c42ba75cae06924c920");
          String sqlrs="insert into kingdee_rs values ('"+goodsFzEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
          GoodsFzSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
