package com.ksd.json;

import com.ksd.entity.MaterialOutStorageEntity;
import com.ksd.entity.MaterialOutStorageFEntity;
import com.ksd.jindie.JindieConfig;
import com.ksd.sql.MaterialOutStorageSqlTest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaterialOutStorageJsonTest {
    public static void test() throws Exception {
        List<MaterialOutStorageEntity> list= MaterialOutStorageSqlTest.materialQuery();
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
            MaterialOutStorageEntity materialOutStorageEntity= list.get(i);
            //单据编号
            model.put("FBillNo", materialOutStorageEntity.getFBillNo());
            //源单编号
            model.put("F_PAEZ_Text", materialOutStorageEntity.getF_PAEZ_Text());
            //出库日期
            model.put("F_PAEZ_Date",materialOutStorageEntity.getF_PAEZ_Date());
            //北京研发项目
            model.put("F_PAEZ_Text5",materialOutStorageEntity.getF_PAEZ_Text5());
            //币种
            model.put("F_PAEZ_Text1", materialOutStorageEntity.getF_PAEZ_Text1());
            //制单人
            model.put("F_PAEZ_Text2", materialOutStorageEntity.getF_PAEZ_Text2());
            //部门
            JSONObject F_PAEZ_Base = new JSONObject();
            F_PAEZ_Base.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base());
            model.put("F_PAEZ_Base", F_PAEZ_Base);
            //北京地区
            model.put("F_PAEZ_Text6", materialOutStorageEntity.getF_PAEZ_Text6());
            //仓库编码
            JSONObject F_PAEZ_Base2 = new JSONObject();
            F_PAEZ_Base2.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base2());
            model.put("F_PAEZ_Base2", F_PAEZ_Base2);
            //组织
            JSONObject F_PAEZ_OrgId = new JSONObject();
            F_PAEZ_OrgId.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_OrgId());
            model.put("F_PAEZ_OrgId", F_PAEZ_OrgId);
            //北京研发项目G
            JSONObject F_PAEZ_Base7 = new JSONObject();
            F_PAEZ_Base7.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base7());
            model.put("F_PAEZ_Base7", F_PAEZ_Base7);
            //北京地区G
            JSONObject F_PAEZ_Base8 = new JSONObject();
            F_PAEZ_Base8.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base8());
            model.put("F_PAEZ_Base8", F_PAEZ_Base8);
            //金蝶部门
            JSONObject F_PAEZ_Base4 = new JSONObject();
            F_PAEZ_Base4.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base4());
            model.put("F_PAEZ_Base4", F_PAEZ_Base4);
            //金蝶仓库
            JSONObject F_PAEZ_Base5 = new JSONObject();
            F_PAEZ_Base5.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base5());
            model.put("F_PAEZ_Base5", F_PAEZ_Base5);
            //项目编号
            model.put("F_PAEZ_Text4", materialOutStorageEntity.getF_PAEZ_Text4());
            //研发项目
            JSONObject F_PAEZ_Base6 = new JSONObject();
            F_PAEZ_Base6.put("FNUMBER", materialOutStorageEntity.getF_PAEZ_Base6());
            model.put("F_PAEZ_Base6", F_PAEZ_Base6);

            List<MaterialOutStorageFEntity>  materialOutStorageFEntity=	MaterialOutStorageSqlTest.entityQuery();
            JSONArray FEntity = new JSONArray();
            for (int j = 0; j < 1; j++) {
                MaterialOutStorageFEntity entity= materialOutStorageFEntity.get(j);
                Map<String,Object> paramss=new HashMap<>();

                //物料编码
                JSONObject F_PAEZ_Base1 = new JSONObject();
                F_PAEZ_Base1.put("FNUMBER",entity.getF_PAEZ_Base1());
                paramss.put("F_PAEZ_Base1",F_PAEZ_Base1);
                //批号
                paramss.put("F_PAEZ_Text3",entity.getF_PAEZ_Text3());
                //数量
                paramss.put("F_PAEZ_Qty",entity.getF_PAEZ_Qty());
                //单价
                paramss.put("F_PAEZ_Price",entity.getF_PAEZ_Price());
                //金额
                paramss.put("F_PAEZ_Amount",entity.getF_PAEZ_Amount());
                //成本总金额
                paramss.put("F_PAEZ_Amount1",entity.getF_PAEZ_Amount1());

                FEntity.add(paramss);

            }
            model.put("FEntity",FEntity);
            jsonObject.put("Model",model);
            System.out.println(jsonObject);
            String  result= JindieConfig.name(jsonObject.toString(), "kabf297e022974510a6a04e49e03c9022");


        }
    }
}
