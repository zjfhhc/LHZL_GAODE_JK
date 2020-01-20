package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.KhEntity;
import com.ksd.utils.JdbcUtils;

public class KhSql {
	 public static List<KhEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Customer where cCusCode not in  (select  substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) fnumber from  PAEZ_100017_JCZLKH  where F_PAEZ_OrgId='1') ");
		 List<KhEntity> list=new ArrayList<KhEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 KhEntity khEntity=new KhEntity();
            	 khEntity.setFname(resultSet.getString("cCusName"));;
            	 khEntity.setFnumber(resultSet.getString("cCusCode"));
            	 khEntity.setFzz("100");
            	 list.add(khEntity);
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
