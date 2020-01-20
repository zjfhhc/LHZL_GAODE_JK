package com.ksd.sql;

import com.ksd.entity.OtherInStorageEntity;
import com.ksd.entity.OtherInStorageFEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OtherInStorageSql {
    public static List<OtherInStorageEntity> otherQuery() throws SQLException {
        List<OtherInStorageEntity> list = new ArrayList<>();
        //获取连接
        Connection conn = JdbcUtils.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select 210000006+a.id id, a.id,a.cCode,a.dDate,b.fedif100018,c.FNUMBER kdkh,e.fedif100009,g.FNUMBER kdck,a.cmaker from [UFDATA_WH].dbo.RdRecord32 a, T_EDI_H123489 b,T_BD_CUSTOMER c\n" +
                " ,PAEZ_t_Cust_Entry100002  d,T_EDI_H123484 e,PAEZ_t_Cust_Entry100006_Ck f,T_BD_stock g\n" +
                " where b.fedif100016=a.cCusCode and b.fedih123489=d.F_PAEZ_BASE1 and c.FCUSTID=d.F_PAEZ_BASE\n" +
                " and e.fedif100007=a.cWhCode  and f.F_PAEZ_BASE1=e.FEDIH123484 and g.fstockid=f.F_PAEZ_BASE\n" +
                " and c.FUseOrgId='1' and d.F_PAEZ_ORGID='1'  and f.F_PAEZ_ORGID='1'  and g.FUseOrgId='1'  and a.id='1000065791'");
        try {
            while (resultSet.next()){
                OtherInStorageEntity entity = new OtherInStorageEntity();
                //单据编号------------------------------------
                entity.setFBillNo(resultSet.getString("id"));
                //源单编号
                entity.setF_PAEZ_Text(resultSet.getString("id"));
                //出库日期
                entity.setF_PAEZ_Date(resultSet.getString("dDate"));
                //制单人
                entity.setF_PAEZ_Text2(resultSet.getString("cmaker"));
                //部门
                entity.setF_PAEZ_Base("BJ-80202");
                //币种
                entity.setF_PAEZ_Text1("人民币");
                //仓库编码
                entity.setF_PAEZ_Base4("BJ-13");
                //组织
                entity.setF_PAEZ_OrgId("100");
                //金蝶仓库
                entity.setF_PAEZ_Base3("WH12");
                //金蝶部门
                entity.setF_PAEZ_Base3("WH80201");

                entity.setOtherInStorageFEntity(entityQuery());
                list.add(entity);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtils.releaseResources(resultSet,statement,conn);
        }

        return list;
    }
    public static List<OtherInStorageFEntity> entityQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select a.cInvCode,iQuantity,iUnitCost,iPrice,cbzje,cBatch from [UFDATA_WH].dbo.rdrecords32 a,[UFDATA_WH].dbo.RdRecord32 c,\n" +
                "( select a.id,sum(a.iaoutprice) cbzje from [UFDATA_WH].dbo.IA_Subsidiary a     where  cBusType='普通销售'   group by a.ID) b\n" +
                "where a.AutoID=b.ID   and c.id=a.id and a.id='1000065791'");

        List<OtherInStorageFEntity> list=new ArrayList<OtherInStorageFEntity>();
        try {
            while(resultSet.next()){
                OtherInStorageFEntity entity=new OtherInStorageFEntity();
                //物料编码
                entity.setF_PAEZ_Base1(resultSet.getString("cInvCode"));
                //数量
                entity.setF_PAEZ_Qty(resultSet.getInt("iQuantity"));
                //单价
                entity.setF_PAEZ_Price(resultSet.getDouble("iUnitCost"));
                //金额
                entity.setF_PAEZ_Amount(resultSet.getDouble("iPrice"));
                //批号
                entity.setF_PAEZ_Text3(resultSet.getString("cBatch"));
                list.add(entity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.releaseResources(resultSet, statement, connection);
        }
        return list;
    }
}
