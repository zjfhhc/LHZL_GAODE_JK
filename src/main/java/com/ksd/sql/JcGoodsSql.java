package com.ksd.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ksd.entity.JcGoodsEntity;
import com.ksd.utils.JdbcUtils;

public class JcGoodsSql {
	 public static List<JcGoodsEntity> SkdjbQuery() throws SQLException {
		 Connection connection = JdbcUtils.getConnection();
		 Statement statement = connection.createStatement();
		 ResultSet resultSet = statement.executeQuery("select spbh,spmch,shpgg from spkfk where denglrq<'2019-11-22' and denglrq>='2019-11-10' ");
		 List<JcGoodsEntity> list=new ArrayList<JcGoodsEntity>();
         try {
        	 
             
             while(resultSet.next()){
            	 JcGoodsEntity jcGoodsEntity=new JcGoodsEntity();
            	 jcGoodsEntity.setFname(resultSet.getString("spmch"));;
            	 jcGoodsEntity.setFnumber(resultSet.getString("spbh"));
            	 jcGoodsEntity.setFspecification(resultSet.getString("shpgg"));
            	 jcGoodsEntity.setFmaterialgroup("100.C");
            	 list.add(jcGoodsEntity);
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
