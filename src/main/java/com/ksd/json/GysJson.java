package com.ksd.json;


import java.util.List;

import com.ht.entity.GysEntity;
import com.ht.jindie.JindieConfig;
import com.ht.sql.GysSql;

import net.sf.json.JSONObject;

public class GysJson {
  public static void gys() throws Exception {
	List<GysEntity> list=GysSql.uftdjbQuery();		
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
		GysEntity gysEntity= list.get(i);
		
		JSONObject F_PAEZ_OrgId = new JSONObject();
		F_PAEZ_OrgId.put("FNUMBER", gysEntity.getFzz());
    	Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
    	
    	Model.put("FNumber", "wh-"+gysEntity.getFnumber());    	
    	Model.put("FName", gysEntity.getFname()); 
    	
    	
    	

    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "k007d363910b548528521179c87926a66");
          //String sqlrs="insert into kingdee_rs values ('"+goodsJldwEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
         // GoodsJldwSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
