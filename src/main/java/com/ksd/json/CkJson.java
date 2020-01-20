package com.ksd.json;


import java.util.List;

import com.ksd.entity.CkEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.CkSql;

import net.sf.json.JSONObject;

public class CkJson {
  public static void ck() throws Exception {
	List<CkEntity> list=CkSql.uftdjbQuery();		
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
		CkEntity ckEntity= list.get(i);
		
		JSONObject F_PAEZ_OrgId = new JSONObject();
		F_PAEZ_OrgId.put("FNUMBER", ckEntity.getFzz());
    	Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
    	
    	Model.put("FNumber", "wh-"+ckEntity.getFnumber());    	
    	Model.put("FName", ckEntity.getFname()); 
    	
    	
    	

    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "k42101fc9b83f45cc8bef017dfb761e39");
          //String sqlrs="insert into kingdee_rs values ('"+goodsJldwEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
         // GoodsJldwSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
