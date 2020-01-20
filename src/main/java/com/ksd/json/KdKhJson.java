package com.ksd.json;


import java.util.List;

import com.ht.entity.KdKhEntity;
import com.ht.jindie.JindieConfig;
import com.ht.sql.KdKhSql;

import net.sf.json.JSONObject;

public class KdKhJson {
  public static void kdKh() throws Exception {
	List<KdKhEntity> list=KdKhSql.uftdjbQuery();		
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
		Model.put("FCUSTID", 0);
		KdKhEntity kdKhEntity= list.get(i);
		
		JSONObject FCreateOrgId = new JSONObject();
		FCreateOrgId.put("FNumber", kdKhEntity.getFzz());
    	Model.put("FCreateOrgId", FCreateOrgId);
    	
		JSONObject FUseOrgId = new JSONObject();
		FUseOrgId.put("FNumber", kdKhEntity.getFzz());
    	Model.put("FUseOrgId", FUseOrgId);
    	   	
    	Model.put("FName", kdKhEntity.getFname()); 
    	
    	JSONObject FCOUNTRY = new JSONObject();
    	FCOUNTRY.put("FNumber", "China");
    	Model.put("FCOUNTRY", FCOUNTRY);
    	Model.put("FKH", kdKhEntity.getFnumber());
    	Model.put("FIsDefPayer", false); 
    	Model.put("FIsGroup", false);
    	JSONObject FCustTypeId = new JSONObject();
    	FCustTypeId.put("FNumber", "KHLB001_SYS");
    	Model.put("FCustTypeId", FCustTypeId);
    	
    	JSONObject FGroup = new JSONObject();
    	FGroup.put("FNumber", kdKhEntity.getFgroup());
    	Model.put("FGroup", FGroup);
		
    	JSONObject FTRADINGCURRID = new JSONObject();
    	FTRADINGCURRID.put("FNumber", "PRE001");
    	Model.put("FTRADINGCURRID", FTRADINGCURRID);
    	Model.put("FInvoiceType", 1); 
    	
    	JSONObject FTaxType = new JSONObject();
    	FTaxType.put("FNumber", "SFL02_SYS");
    	Model.put("FTaxType", FTaxType);
    	Model.put("FPriority", 1);
    	
    	JSONObject FTaxRate = new JSONObject();
    	FTaxRate.put("FNumber", "SL02_SYS");
    	Model.put("FTaxRate", FTaxRate);
    	
    	Model.put("FISCREDITCHECK", true);
    	Model.put("FIsTrade", true);
    	
    	JSONObject FT_BD_CUSTOMEREXT = new JSONObject();
    	FT_BD_CUSTOMEREXT.put("FEnableSL", false);
    	Model.put("FT_BD_CUSTOMEREXT", FT_BD_CUSTOMEREXT);
    	
    	
    	 
    	Model.put("FINVOICETITLE", kdKhEntity.getFname()); 
    	
    	

    	
    
    	
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "BD_Customer");
          //String sqlrs="insert into kingdee_rs values ('"+goodsJldwEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
         // GoodsJldwSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
