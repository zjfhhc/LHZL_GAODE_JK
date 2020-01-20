package com.ksd.json;


import java.util.List;

import com.ksd.entity.BmEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.BmSql;

import net.sf.json.JSONObject;

public class BmJson {
  public static void bm() throws Exception {
	List<BmEntity> list=BmSql.uftdjbQuery();		
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
		BmEntity bmEntity= list.get(i);
		
		JSONObject F_PAEZ_OrgId = new JSONObject();
		F_PAEZ_OrgId.put("FNUMBER", bmEntity.getFzz());
    	Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
    	
    	Model.put("FNumber", "wh-"+bmEntity.getFnumber());    	
    	Model.put("FName", bmEntity.getFname()); 
    	
    	
    	

    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "keaff265986234d1289d137e38ac30be6");
          //String sqlrs="insert into kingdee_rs values ('"+goodsJldwEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
         // GoodsJldwSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
