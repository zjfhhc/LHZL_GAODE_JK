package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.KdKhEntity;
import com.ksd.utils.JdbcUtils;

public class KdKhSql {
	 public static List<KdKhEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Customer where cCusCode not in  (select  fkh from  T_BD_CUSTOMER  where FUseOrgId='1' and fkh<>'') ");
		 List<KdKhEntity> list=new ArrayList<KdKhEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 KdKhEntity KdKhEntity=new KdKhEntity();
            	 KdKhEntity.setFnumber(resultSet.getString("cCusCode"));
            	 KdKhEntity.setFname(resultSet.getString("cCusName"));
            	 KdKhEntity.setFgroup(resultSet.getString("ccccode"));
            	 KdKhEntity.setFzz("100");
            	 list.add(KdKhEntity);
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
