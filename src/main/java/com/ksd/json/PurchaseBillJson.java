package com.ksd.json;

import com.ksd.entity.PurchaseBillEntity;
import com.ksd.entity.PurchaseBillFEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.PurchaseBillSql;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PurchaseBillJson {
    public static void test() throws Exception {
        List<PurchaseBillEntity> list= PurchaseBillSql.purchaseBillQuery();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            JSONObject jsonObject = new JSONObject();
            //data：JSON格式数据 ，必录
            int data[] = null;
            //创建者内码（非必录）
            jsonObject.put("Creator", "");
            //需要更新的字段，数组类型，格式：[key1,key2,...]
            jsonObject.put("NeedUpDateFields", data);
            //需返回结果的字段集合，数组类型，格式：[key,entitykey.key,...]（非必录） 注（返回单据体字段格式：entitykey.key）
            jsonObject.put("NeedReturnFields", data);
            //是否删除已存在的分录，布尔类型，默认true（非必录）
            jsonObject.put("IsDeleteEntry", true);
            //表单所在的子系统内码，字符串类型（非必录）
            jsonObject.put("SubSystemId", "");
            //是否验证所有的基础资料有效性，布尔类，默认false（非必录）
            jsonObject.put("IsVerifyBaseDataField", false);
            //是否批量填充分录，默认true（非必录）
            jsonObject.put("IsEntryBatchFill", true);
            //是否验证标志，布尔类型，默认true（非必录）
            jsonObject.put("ValidateFlag", true);
            //是否用编码搜索基础资料，布尔类型，默认true（非必录）
            jsonObject.put("NumberSearch", true);
            //交互标志集合，字符串类型，分号分隔，格式："flag1;flag2;..."（非必录） 例如（允许负库存标识：STK_InvCheckResult）
            jsonObject.put("InterationFlags", "");
            //是否自动提交与审核，布尔类型，默认false（非必录） 注（启用此参数，保存，提交和审核是在一个事务中）
            jsonObject.put("IsAutoSubmitAndAudit" ,false);
            //Model：表单数据包，JSON类型（必录）
            JSONObject model = new JSONObject();
            model.put("FID", 0);
            //从查询到的容器中获得实体对象
            PurchaseBillEntity purchaseBillEntity= list.get(i);

            //单据编号
            model.put("FBillNo", purchaseBillEntity.getFBillNo());
            //源单编号
            model.put("F_PAEZ_Text", purchaseBillEntity.getF_PAEZ_Text());
            //发票号
            model.put("F_PAEZ_Text1", purchaseBillEntity.getF_PAEZ_Text1());
            //u8供应商编码
            JSONObject F_PAEZ_Base = new JSONObject();
            F_PAEZ_Base.put("FNUMBER", purchaseBillEntity.getF_PAEZ_Base());
            model.put("F_PAEZ_Base", F_PAEZ_Base);
            //开票日期
            model.put("F_PAEZ_Date",purchaseBillEntity.getF_PAEZ_Date());
            //币种
            model.put("F_PAEZ_Text2", purchaseBillEntity.getF_PAEZ_Text2());
            //制单人
            model.put("F_PAEZ_Text3", purchaseBillEntity.getF_PAEZ_Text3());
            //金蝶供应商编码
            JSONObject F_PAEZ_Base1 = new JSONObject();
            F_PAEZ_Base1.put("FNUMBER", purchaseBillEntity.getF_PAEZ_Base1());
            model.put("F_PAEZ_Base1", F_PAEZ_Base1);
            //组织
            JSONObject F_PAEZ_OrgId = new JSONObject();
            F_PAEZ_OrgId.put("FNUMBER", "100");
            model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);

            List<PurchaseBillFEntity>  purchaseBillFEntity=	PurchaseBillSql.entityQuery();
            JSONArray FEntity = new JSONArray();
            for (int j = 0; j < purchaseBillFEntity.size(); j++) {
                PurchaseBillFEntity entity= purchaseBillFEntity.get(j);
                Map<String,Object> paramss=new HashMap<>();

                //存货编码
                JSONObject F_PAEZ_Base2 = new JSONObject();
                F_PAEZ_Base2.put("FNUMBER",entity.getF_PAEZ_Base2());
                paramss.put("F_PAEZ_Base2",F_PAEZ_Base2);
                //数量
                paramss.put("F_PAEZ_Qty",entity.getF_PAEZ_Qty());
                //单价
                paramss.put("F_PAEZ_Price",entity.getF_PAEZ_Price());
                //金额
                paramss.put("F_PAEZ_Amount",entity.getF_PAEZ_Amount());

                FEntity.add(paramss);

            }
            model.put("FEntity",FEntity);
            jsonObject.put("Model",model);
            System.out.println(jsonObject);
            String  result= JindieConfig.name(jsonObject.toString(), "kdcb99ec7cdfa4aa5bf5adaeee56f2fe4");


        }
    }
}
