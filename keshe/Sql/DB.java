package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static String dbUrl="jdbc:sqlserver://127.0.0.1:1433;databaseName=水果仓库管理系统";
    private static String dbUserName="sa";
    private static String dbPassword="123456";
    private static String jdbcName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static Connection getCon() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con= DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
        return con;
    }

    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("连接成功1");
        } catch (Exception e) {
                System.out.println("连接失败1");
        }
        String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;"+"databaseName=水果仓库管理系统;"+"user=sa;"+"password=123456;";
        Connection con;
        try {
            con = DriverManager.getConnection(connectionUrl);
            System.out.println("连接成功2");
            ((Connection) con).close();
        }
        catch (SQLException e){
            System.out.println("请输入正确的表名"+e);
            System.out.println("连接失败2");
        }
    }
}
