package com.ksd.json;

import com.ksd.entity.MaterialEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.MaterialSql;
import net.sf.json.JSONObject;

import java.util.List;

public class MaterialJson {
    public static void test() throws Exception {
        List<MaterialEntity> list= MaterialSql.materialQuery();
        //System.out.println(list);
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
            MaterialEntity materialEntity= list.get(i);
            model.put("FNumber", materialEntity.getFNumber());
            model.put("FName", materialEntity.getFName());
            model.put("F_PAEZ_Text", "hhc123");
            JSONObject F_PAEZ_OrgId = new JSONObject();
            F_PAEZ_OrgId.put("FNumber", "100");
            model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);

            jsonObject.put("Model",model);
            System.out.println(jsonObject);
            String  result= JindieConfig.name(jsonObject.toString(), "k6fd60a74ce0b430fb9b130cc96e81913");


        }
    }
}
