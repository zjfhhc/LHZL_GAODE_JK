package com.ksd.utils;

import java.sql.*;

public class JdbcUtils {
	 private static String driverName;
	 private static String url;
	 private static String user;
	 private static String password;
	 static {
		              // 加载驱动
		              try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		      }
		  
		      /*
		       * 获取连接
		       */
		     public static Connection getConnection() throws SQLException {
		          return DriverManager.getConnection("jdbc:sqlserver://LAPTOP-1C8I08F9:1433; DatabaseName=AIS20190319144501", "sa", "zjfhhc11");
		      }
		  
		      /*
		       * 释放资源
		       */
		      public static void releaseResources(ResultSet resultSet,
		              Statement statement, Connection connection) {
		  
		          try {
		              if (resultSet != null)
		                  resultSet.close();
		        } catch (SQLException e) {
		           e.printStackTrace();
		        } finally {
		             resultSet = null;
		             try {
		                 if (statement != null)
		                     statement.close();
		              } catch (SQLException e) {
		                 e.printStackTrace();
		              } finally {
		                statement = null;
		                  try {
		                      if (connection != null)
		                         connection.close();
		               } catch (SQLException e) {
		                      e.printStackTrace();
		                 } finally {
		                      connection = null;
		                 }
		             }
		          }
		 
		     }
}
