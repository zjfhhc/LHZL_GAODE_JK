package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.BmEntity;
import com.ksd.utils.JdbcUtils;

public class BmSql {
	 public static List<BmEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.Department where cDepCode not in  (select  substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) fnumber from  PAEZ_100003_JCZLBM  where F_PAEZ_OrgId='1') ");
		 List<BmEntity> list=new ArrayList<BmEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 BmEntity bmEntity=new BmEntity();
            	 bmEntity.setFname(resultSet.getString("cDepName"));;
            	 bmEntity.setFnumber(resultSet.getString("cDepCode"));
            	 bmEntity.setFzz("100");
            	 list.add(bmEntity);
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
