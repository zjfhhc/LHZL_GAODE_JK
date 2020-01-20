package com.ksd.sql;

import com.ksd.entity.PurchaseBillEntity;
import com.ksd.entity.PurchaseBillFEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PurchaseBillSql {
    public static List<PurchaseBillEntity> purchaseBillQuery() throws SQLException {
        List<PurchaseBillEntity> list = new ArrayList<>();
        //获取连接
        Connection conn = JdbcUtils.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select a.pbvid+2000008 id,a.dSDate,a.cInCode,a.cpbvcode,b.fedif100012,a.cPBVMaker,d.FNUMBER kdgys from [UFDATA_WH].dbo.PurBillVouch a,T_EDI_H123485 b,PAEZ_t_Cust_Entry100012 c \n" +
                ",t_BD_Supplier d\n" +
                "where  a.cvencode=b.fedif100010 and b.fedih123485=c.f_paez_base1 and  c.f_paez_base=d.fsupplierid and \n" +
                "c.F_PAEZ_ORGID=1 and d.FUSEORGID=1 and pbvid='1000006777'");
        try {
            while (resultSet.next()){
                PurchaseBillEntity entity = new PurchaseBillEntity();
                //单据编号
                entity.setFBillNo(resultSet.getString("id"));
                //源单编号
                entity.setF_PAEZ_Text(resultSet.getString("cInCode"));
                //发票号
                entity.setF_PAEZ_Text1(resultSet.getString("cpbvcode"));
                //u8供应商编码
                entity.setF_PAEZ_Base(resultSet.getString("fedif100012"));
                //开票日期
                entity.setF_PAEZ_Date(resultSet.getString("DSDate"));
                //币种
                entity.setF_PAEZ_Text2("人民币");
                //制单人
                entity.setF_PAEZ_Text3 (resultSet.getString("cPBVMaker"));
                //金蝶供应商编码
                entity.setF_PAEZ_Base1(resultSet.getString("kdgys"));
                //组织
                entity.setF_PAEZ_OrgId("100");

                entity.setPurchaseBillFEntity(entityQuery());
                list.add(entity);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtils.releaseResources(resultSet,statement,conn);
        }

        return list;
    }
    public static List<PurchaseBillFEntity> entityQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select  cinvcode,ipbvquantity,ioricost,iSum from [UFDATA_WH].dbo.PurBillVouchs where pbvid='1000006777'");

        List<PurchaseBillFEntity> list=new ArrayList<PurchaseBillFEntity>();
        try {
            while(resultSet.next()){
                PurchaseBillFEntity entity=new PurchaseBillFEntity();
                //entity.setF_PAEZ_Base2(resultSett.getString("FID"));
                //存货编码
                entity.setF_PAEZ_Base2(resultSet.getString("cinvCode"));
                //数量
                entity.setF_PAEZ_Qty(resultSet.getInt("ipbvquantity"));
                //单价
                entity.setF_PAEZ_Price(resultSet.getDouble("ioricost"));
                //金额
                entity.setF_PAEZ_Amount(resultSet.getDouble("iSum"));
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
