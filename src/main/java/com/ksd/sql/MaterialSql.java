package com.ksd.sql;

import com.ksd.entity.MaterialEntity;
import com.ksd.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MaterialSql {
    public static List<MaterialEntity> materialQuery() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select FID,FNumber from ABC_t_Cust100008 where FID= 207825");
        List<MaterialEntity> list=new ArrayList<MaterialEntity>();
        try {
            while(resultSet.next()){
                MaterialEntity entity=new MaterialEntity();
                entity.setFName(resultSet.getString("FID"));
                entity.setFNumber("14");
                entity.setF_PAEZ_Text("hhcte");
                entity.setF_PAEZ_OrgId("湖北上升广电");
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
}
