package com.ksd.json;


import java.util.List;

import com.ksd.entity.YwyEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.YwySql;

import net.sf.json.JSONObject;

public class YwyJson {
  public static void ywy() throws Exception {
	List<YwyEntity> list=YwySql.uftdjbQuery();		
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
		YwyEntity ywyEntity= list.get(i);
		
		JSONObject F_PAEZ_OrgId = new JSONObject();
		F_PAEZ_OrgId.put("FNUMBER", ywyEntity.getFzz());
    	Model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
    	
    	Model.put("FNumber", "wh-"+ywyEntity.getFnumber());    	
    	Model.put("FName", ywyEntity.getFname()); 
    	
    	
    	

    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "ke4fc984ee0924accb188e7e2fea57055");
          //String sqlrs="insert into kingdee_rs values ('"+goodsJldwEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
         // GoodsJldwSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
