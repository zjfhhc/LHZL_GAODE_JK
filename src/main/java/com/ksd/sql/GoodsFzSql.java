package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.GoodsFzEntity;
import com.ksd.utils.JdbcUtils;

public class GoodsFzSql {
	 public static List<GoodsFzEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select * from [UFDATA_WH].dbo.InventoryClass where cInvCCode not in (select substring(FNUMBER,charindex('-',FNUMBER)+1,len(FNUMBER)) FNUMBER from PAEZ_100010_JCZLFZ  where F_PAEZ_OrgId='1' ) ");
		 List<GoodsFzEntity> list=new ArrayList<GoodsFzEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 GoodsFzEntity goodsFzEntity=new GoodsFzEntity();
            	 goodsFzEntity.setFname(resultSet.getString("cInvCName"));;
            	 goodsFzEntity.setFnumber(resultSet.getString("cInvCCode"));
            	 goodsFzEntity.setFzz("100");
            	 list.add(goodsFzEntity);
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
