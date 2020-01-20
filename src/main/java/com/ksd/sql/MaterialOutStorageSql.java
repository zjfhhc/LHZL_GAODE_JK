package com.ksd.sql;

import com.ksd.entity.MaterialOutStorageEntity;
import com.ksd.entity.MaterialOutStorageFEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MaterialOutStorageSql {
    public static List<MaterialOutStorageEntity> materialQuery() throws SQLException {
        List<MaterialOutStorageEntity> list = new ArrayList<>();
        //获取连接
        Connection conn = JdbcUtils.getConnection();
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(" select 200000006+a.id id,a.ccode,a.ddate,FEDIF100006,d.FNUMBER kdbm,e.fedif100009,g.FNUMBER kdck,a.cmaker, h.fnumber ckhs , i.fnumber ptxm from [UFDATA_WH].dbo.rdrecord11 a\n" +
                " left join  T_EDI_H123483 b on a.cDepCode=b.FEDIF100004\n" +
                " left join PAEZ_t_Cust_Entry100007_BM c on b.FEDIH123483=c.F_PAEZ_BASE1 and c.F_PAEZ_ORGID=1\n" +
                " left join T_BD_DEPARTMENT d on c.F_PAEZ_BASE=d.FDEPTID  and d.FUSEORGID=1\n" +
                " left join T_EDI_H123484 e on  e.fedif100007=a.cWhCode \n" +
                " left join PAEZ_t_Cust_Entry100006_Ck f on  f.F_PAEZ_BASE1=e.FEDIH123484 and f.F_PAEZ_ORGID=1\n" +
                " left join T_BD_stock g on g.fstockid=f.F_PAEZ_BASE  and g.FUSEORGID=1\n" +
                " left join ABC_t_Cust100009 h on g.F_ABC_Base=h.fid \n" +
                " left join ABC_t_Cust100010 i on g.F_ABC_Base1=i.fid\n" +
                " where     a.id='1000065726' ");
        try {
            while (resultSet.next()){
                MaterialOutStorageEntity entity = new MaterialOutStorageEntity();
                //单据编号------------------------------------
                entity.setFBillNo(resultSet.getString("id"));
                //源单编号
                entity.setF_PAEZ_Text(resultSet.getString("ccode"));
                //出库日期
                entity.setF_PAEZ_Date(resultSet.getString("ddate"));
                //北京研发项目
                entity.setF_PAEZ_Text5("bjyfxm");
                //币种
                entity.setF_PAEZ_Text1("人民币");
                //制单人
                entity.setF_PAEZ_Text2(resultSet.getString("cmaker"));
                //部门BJ-80202
                entity.setF_PAEZ_Base(resultSet.getString("FEDIF100006"));
                //北京地区
                //entity.setF_PAEZ_Text6("ddd");
                //仓库编码
                entity.setF_PAEZ_Base2(resultSet.getString("fedif100009"));
                //组织
                entity.setF_PAEZ_OrgId("100");
                //北京研发项目G
                //entity.setF_PAEZ_Base7("WH805006");
                //北京地区G
                //entity.setF_PAEZ_Base8("1201");
                //金蝶部门
                entity.setF_PAEZ_Base4(resultSet.getString("kdbm"));
                //金蝶仓库
                entity.setF_PAEZ_Base5(resultSet.getString("kdck"));
                //项目编号
                entity.setF_PAEZ_Text4(resultSet.getString("ptxm"));
                //研发项目
                //entity.setF_PAEZ_Base6("WH805005");
                entity.setMaterialOutStorageFEntity(entityQuery());
                list.add(entity);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            JdbcUtils.releaseResources(resultSet,statement,conn);
        }

        return list;
    }
    public static List<MaterialOutStorageFEntity> entityQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(" select a.cinvcode,a.iquantity,a.iUnitCost,a.iPrice,a.cBatch,b.cbzje from [UFDATA_WH].dbo.rdrecords11 a,\n" +
                "  (select a.id,sum(a.iaoutprice) cbzje from [UFDATA_WH].dbo.IA_Subsidiary a      group by a.ID) b  where a.AutoID=b.id\n" +
                "  and   a.id='1000065726'");

        List<MaterialOutStorageFEntity> list=new ArrayList<MaterialOutStorageFEntity>();
        try {
            while(resultSet.next()){
                MaterialOutStorageFEntity entity=new MaterialOutStorageFEntity();
                //物料编码
                entity.setF_PAEZ_Base1(resultSet.getString("cInvCode"));
                //数量
                entity.setF_PAEZ_Qty(resultSet.getInt("iquantity"));
                //单价
                entity.setF_PAEZ_Price(resultSet.getDouble("iUnitCost"));
                //金额
                entity.setF_PAEZ_Amount(resultSet.getDouble("iPrice"));
                //成本总金额
                entity.setF_PAEZ_Amount1(resultSet.getDouble("cbzje"));
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
