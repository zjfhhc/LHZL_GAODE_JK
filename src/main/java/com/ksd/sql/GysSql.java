package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ht.entity.GysEntity;
import com.ht.utils.JdbcUtils;

public class GysSql {
	 public static List<GysEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Vendor where cvencode not in  (select  substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) fnumber from  PAEZ_100002_JCZLGYS  where F_PAEZ_OrgId='1') ");
		 List<GysEntity> list=new ArrayList<GysEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 GysEntity gysEntity=new GysEntity();
            	 gysEntity.setFname(resultSet.getString("cVenName"));;
            	 gysEntity.setFnumber(resultSet.getString("cVenCode"));
            	 gysEntity.setFzz("100");
            	 list.add(gysEntity);
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
