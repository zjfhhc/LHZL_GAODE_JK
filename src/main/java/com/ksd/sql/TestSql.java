package com.ksd.sql;

import com.ksd.entity.TestEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestSql {
    public static List<TestEntity> SkdtQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FID,FNumber from ABC_t_Cust100008 where FID= 207823");
        List<TestEntity> list=new ArrayList<TestEntity>();
        try {
            while(resultSet.next()){
                TestEntity entity=new TestEntity();
                entity.setFName(resultSet.getString("FID"));
                entity.setFNumber("11");
                entity.setF_PAEZ_Text("hhcte");
                entity.setF_PAEZ_Text2("hhcte2");
                list.add(entity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.releaseResources(resultSet, statement, connection);
            System.out.println("finally{}");
        }
        return list;
    }


    public static void SkdtInset(String sql) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(sql);
        if (resultSet<1) {
            System.out.println("更新失败");
        }
        System.out.println("更新成功");
    }
}
