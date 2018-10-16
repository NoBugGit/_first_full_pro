package dbutils;

import java.sql.*;

public class DBUtil {

	// JDBC 驱动名及数据库 ——>mysql
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/_first_full_pro";
	// 数据库用户名，密码
	static final String USER = "root";
	static final String PASS = "XyjMysql1!";
	private Connection conn;
	private Statement stmt;

	public DBUtil() {

		try {
			// 注册 JDBC 驱动
			Class.forName(JDBC_DRIVER);
			// 打开连接
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet query(String sql){
		ResultSet rs=null;		
		try {
			 rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	 
	public void close() {
		try {
			if (stmt != null) {
				stmt.close();
				
				if (conn != null) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
