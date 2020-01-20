package com.ksd.json;


import java.util.List;

import com.ht.entity.KdKhEntity;
import com.ht.jindie.JindieConfig;
import com.ht.sql.KdCkSql;

import net.sf.json.JSONObject;

public class KdCkJson {
  public static void kdCk() throws Exception {
	List<KdKhEntity> list=KdCkSql.uftdjbQuery();		
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
		Model.put("FStockId", 0);
		KdKhEntity kdKhEntity= list.get(i);
		
		JSONObject FCreateOrgId = new JSONObject();
		FCreateOrgId.put("FNUMBER", kdKhEntity.getFzz());
    	Model.put("FCreateOrgId", FCreateOrgId);
    	
    	Model.put("FNumber", "wh"+kdKhEntity.getFnumber());    	
    	Model.put("FName", kdKhEntity.getFname()); 
    	
    	JSONObject FUseOrgId = new JSONObject();
    	FUseOrgId.put("FNUMBER", kdKhEntity.getFzz());
    	Model.put("FUseOrgId", FUseOrgId);
    	
    	Model.put("FStockProperty", 1); 
    	Model.put("FStockStatusType", 0); 
    	
    	JSONObject FDefReceiveStatusId = new JSONObject();
    	FDefReceiveStatusId.put("FNUMBER", "KCZT01_SYS");
    	Model.put("FDefReceiveStatusId", FDefReceiveStatusId);
    	JSONObject FDefStockStatusId = new JSONObject();
    	FDefStockStatusId.put("FNUMBER", "KCZT01_SYS");
    	Model.put("FDefStockStatusId", FDefStockStatusId);
    	Model.put("FAllowMinusQty", false); 
    	Model.put("FIsGYStock", false); 
    	Model.put("FAllowLock", true); 
    	Model.put("FIsOpenLocation", false); 
    	Model.put("FAllowMRPPlan", true); 
    	Model.put("FAvailablePicking", true); 
    	Model.put("FAvailableAlert", true); 
    	Model.put("FSortingPriority", 1); 
    	JSONObject F_ABC_Base = new JSONObject();
    	F_ABC_Base.put("FNUMBER", "WHK");
    	Model.put("F_ABC_Base", F_ABC_Base);
    	Model.put("FUCK", kdKhEntity.getFnumber()); 
    	

    	  
    	jsonobject.put("Model",Model);
        System.out.println(jsonobject);
         String  result=JindieConfig.name(jsonobject.toString(), "BD_STOCK");
          //String sqlrs="insert into kingdee_rs values ('"+goodsJldwEntity.getFnumber()+"','"+result+"','k_Goods',GETDATE())";
         // GoodsJldwSql.SkdjbInset(sqlrs);
 	   

	}				
  }

}
