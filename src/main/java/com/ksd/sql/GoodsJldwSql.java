package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.GoodsJldwEntity;
import com.ksd.utils.JdbcUtils;

public class GoodsJldwSql {
	 public static List<GoodsJldwEntity> uftdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select *  from [UFDATA_WH].dbo.ComputationUnit  where cComunitCode  not  in (   select  substring(b.FNUMBER,charindex('-',b.FNUMBER)+1,len(b.FNUMBER)) FNUMBER    from   PAEZ_100009_JCZLJLDW b   where F_PAEZ_OrgId='1') ");
		 List<GoodsJldwEntity> list=new ArrayList<GoodsJldwEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 GoodsJldwEntity goodsJldwEntity=new GoodsJldwEntity();
            	 goodsJldwEntity.setFname(resultSet.getString("cComUnitName"));;
            	 goodsJldwEntity.setFnumber(resultSet.getString("cComunitCode"));
            	 goodsJldwEntity.setFzz("100");
            	 list.add(goodsJldwEntity);
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
