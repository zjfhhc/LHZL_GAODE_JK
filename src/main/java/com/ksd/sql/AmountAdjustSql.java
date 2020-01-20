package com.ksd.sql;

import com.ksd.entity.AmountAdjustEntity;
import com.ksd.entity.AmountAdjustFEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AmountAdjustSql {
    public static List<AmountAdjustEntity> otherQuery() throws SQLException {

        List<AmountAdjustEntity> list = new ArrayList<>();
        //获取连接
        Connection conn = JdbcUtils.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select 210000005+a.id id, a.id,a.cCode,a.dDate,b.fedif100018,c.FNUMBER kdkh,e.fedif100009,g.FNUMBER kdck,a.cmaker from [UFDATA_WH].dbo.RdRecord32 a, T_EDI_H123489 b,T_BD_CUSTOMER c\n" +
                " ,PAEZ_t_Cust_Entry100002  d,T_EDI_H123484 e,PAEZ_t_Cust_Entry100006_Ck f,T_BD_stock g\n" +
                " where b.fedif100016=a.cCusCode and b.fedih123489=d.F_PAEZ_BASE1 and c.FCUSTID=d.F_PAEZ_BASE\n" +
                " and e.fedif100007=a.cWhCode  and f.F_PAEZ_BASE1=e.FEDIH123484 and g.fstockid=f.F_PAEZ_BASE\n" +
                " and c.FUseOrgId='1' and d.F_PAEZ_ORGID='1'  and f.F_PAEZ_ORGID='1'  and g.FUseOrgId='1'  and a.id='1000065791'");
        try {
            while (resultSet.next()) {
                AmountAdjustEntity entity = new AmountAdjustEntity();
                //单据编号------------------------------------
                entity.setFBillNo(resultSet.getString("id"));
                //日期
                entity.setF_PAEZ_Date(resultSet.getString("dDate"));
                //u8仓库编号
                entity.setF_PAEZ_Base("BJ-11");
                //组织
                entity.setF_PAEZ_OrgId("100");
                //金蝶仓库编号
                entity.setF_PAEZ_Base1("WH11");
                //源单编号
                entity.setF_PAEZ_Text("ddddddd");
                entity.setAmountAdjustFEntity(entityQuery());
                list.add(entity);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.releaseResources(resultSet, statement, conn);
        }

        return list;
    }

    public static List<AmountAdjustFEntity> entityQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select a.cInvCode,iQuantity,iUnitCost,iPrice,cbzje,cBatch from [UFDATA_WH].dbo.rdrecords32 a,[UFDATA_WH].dbo.RdRecord32 c,\n" +
                "( select a.id,sum(a.iaoutprice) cbzje from [UFDATA_WH].dbo.IA_Subsidiary a     where  cBusType='普通销售'   group by a.ID) b\n" +
                "where a.AutoID=b.ID   and c.id=a.id and a.id='1000065791'");

        List<AmountAdjustFEntity> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                AmountAdjustFEntity entity = new AmountAdjustFEntity();
                //存货编码
                entity.setF_PAEZ_Base2("10210398");
                //调整金额
                entity.setF_PAEZ_Amount(333.0);
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
