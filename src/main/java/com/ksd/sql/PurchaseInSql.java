package com.ksd.sql;

import com.ksd.entity.PurchaseFEntity;
import com.ksd.entity.PurchaseInEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PurchaseInSql {
    public static List<PurchaseInEntity> purchaseQuery() throws SQLException {
        List<PurchaseInEntity> list = new ArrayList<>();
        //获取连接
        Connection conn = JdbcUtils.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select 200000009+a.id id,a.id, a.ccode,a.ddate,b.fedif100012,d.FNUMBER kdgys,e.fedif100009,g.FNUMBER kdck,a.cmaker from\n" +
                "[UFDATA_WH].dbo.RdRecord01 a,T_EDI_H123485 b,PAEZ_t_Cust_Entry100012 c ,t_BD_Supplier d,  T_EDI_H123484 e,PAEZ_t_Cust_Entry100006_Ck f,T_BD_stock g\n" +
                "where a.cvencode=b.fedif100010 and b.fedih123485=c.f_paez_base1 and  c.f_paez_base=d.fsupplierid \n" +
                "and a.cWhCode=e.fedif100007  and f.F_PAEZ_BASE1=e.FEDIH123484 and g.fstockid=f.F_PAEZ_BASE \n" +
                " and d.FUseOrgId='1' and c.F_PAEZ_ORGID='1'  and f.F_PAEZ_ORGID='1'  and g.FUseOrgId='1' \n" +
                " and a.ID='1000066913'");
        try {
            while (resultSet.next()){
                PurchaseInEntity entity = new PurchaseInEntity();
                //单据编号
                entity.setFBillNo(resultSet.getString("id"));
                //入库日期
                entity.setF_PAEZ_Date(resultSet.getString("ddate"));
                //部门编码//
                //entity.setF_PAEZ_Base1(resultSet.getString("fedif100009"));
                //entity.setF_PAEZ_Base1("BJ-80203");
                //币种
                entity.setF_PAEZ_Text1("人民币");
                //源单编号
                entity.setF_PAEZ_Text(resultSet.getString("ccode"));
                //业务员
                entity.setF_PAEZ_Base2(resultSet.getString("cmaker"));
                //供应商编码
                entity.setF_PAEZ_Base(resultSet.getString("fedif100012"));
                //金蝶供应商
                entity.setF_PAEZ_Base6(resultSet.getString("kdgys"));
                //组织
                entity.setF_PAEZ_OrgId("100");
                //仓库编码//
                entity.setF_PAEZ_Base5(resultSet.getString("fedif100009"));
                //金蝶仓库
                entity.setF_PAEZ_Base8(resultSet.getString("kdck"));
                //金蝶部门//
                //entity.setF_PAEZ_Base4("WH80201");

                entity.setPurchaseFEntity(entityQuery());
                list.add(entity);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtils.releaseResources(resultSet,statement,conn);
        }

        return list;
    }
    public static List<PurchaseFEntity> entityQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select cinvcode,iquantity,iunitcost,iaprice,cbatch from [UFDATA_WH].dbo.RdRecords01 where id='1000066913'");

        List<PurchaseFEntity> list=new ArrayList<PurchaseFEntity>();
        try {
            while(resultSet.next()){
                PurchaseFEntity entity=new PurchaseFEntity();
                //entity.setF_PAEZ_Base2(resultSett.getString("FID"));
                //存货编码
                entity.setF_PAEZ_Base3(resultSet.getString("cInvCode"));
                //数量
                entity.setF_PAEZ_Qty(resultSet.getInt("iQuantity"));
                //单价
                entity.setF_PAEZ_Price(resultSet.getDouble("iUnitCost"));
                //金额
                entity.setF_PAEZ_Amount(resultSet.getDouble("iaprice"));
                //批号
                entity.setF_PAEZ_Text2(resultSet.getString("cBatch"));
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
