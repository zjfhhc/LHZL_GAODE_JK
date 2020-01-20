package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ht.entity.GoodsEntity;
import com.ht.utils.JdbcUtils;

public class GoodsSql {
	 public static List<GoodsEntity> goodsSql() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from  [UFDATA_WH].dbo.Inventory where cInvCode  not  in (select  substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) fnumber from  PAEZ_t_Cust_Entry100033  where F_PAEZ_OrgId='1') and  cinvcode='110310821' ");
		 List<GoodsEntity> list=new ArrayList<GoodsEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 GoodsEntity goodsEntity=new GoodsEntity();
            	 goodsEntity.setFname(resultSet.getString("cInvName"));;
            	 goodsEntity.setFnumber(resultSet.getString("cInvCode"));
            	 goodsEntity.setFggxh(resultSet.getString("cInvStd"));
            	 goodsEntity.setFjldw(resultSet.getString("cComUnitCode"));
            	 goodsEntity.setFfz(resultSet.getString("cInvCCode"));
            	 goodsEntity.setFzz("100");
            	 list.add(goodsEntity);
             }
             
        } catch (SQLException e) {
             e.printStackTrace();
         } finally {
             JdbcUtils.releaseResources(resultSet, statement, connection);
         }
		return list;
     }
	 
	 
	 public static void SkdjbInset(String sql) throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 int resultSet = statement.executeUpdate(sql);
		 if (resultSet<1) {
			System.out.println("更新失败");
		 }
		 System.out.println("更新成功");
     }

}
