package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.KdKhEntity;
import com.ksd.utils.JdbcUtils;

public class KdCkSql {
	 public static List<KdKhEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Warehouse where cWhCode not in  (select FUCK from T_BD_stock where  FUseOrgId='1'  and FUCK<>'') ");
		 List<KdKhEntity> list=new ArrayList<KdKhEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 KdKhEntity kdKhEntity=new KdKhEntity();
            	 kdKhEntity.setFname(resultSet.getString("cWhName"));;
            	 kdKhEntity.setFnumber(resultSet.getString("cWhCode"));
            	 kdKhEntity.setFzz("100");
            	 list.add(kdKhEntity);
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
