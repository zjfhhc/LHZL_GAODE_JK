package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.CkEntity;
import com.ksd.utils.JdbcUtils;

public class CkSql {
	 public static List<CkEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Warehouse where cWhCode not in  (select  substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) fnumber from  PAEZ_100004_JCZLCK  where F_PAEZ_OrgId='1') ");
		 List<CkEntity> list=new ArrayList<CkEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 CkEntity ckEntity=new CkEntity();
            	 ckEntity.setFname(resultSet.getString("cWhName"));;
            	 ckEntity.setFnumber(resultSet.getString("cWhCode"));
            	 ckEntity.setFzz("100");
            	 list.add(ckEntity);
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
