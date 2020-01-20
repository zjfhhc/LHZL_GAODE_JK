package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.YwyEntity;
import com.ksd.utils.JdbcUtils;

public class YwySql {
	 public static List<YwyEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Person where cPersonCode not in  (select  substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) fnumber from  PAEZ_100008_JCZLYWY  where F_PAEZ_OrgId='1') ");
		 List<YwyEntity> list=new ArrayList<YwyEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 YwyEntity ywyEntity=new YwyEntity();
            	 ywyEntity.setFname(resultSet.getString("cPersonName"));;
            	 ywyEntity.setFnumber(resultSet.getString("cPersonCode"));
            	 ywyEntity.setFzz("100");
            	 list.add(ywyEntity);
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
