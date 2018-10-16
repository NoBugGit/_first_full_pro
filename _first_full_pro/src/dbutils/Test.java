package dbutils;
import java.sql.*;
public class Test {

	public static void main(String[] args) {
		DBUtil db=new DBUtil();
		String sql="select username,password from user_table where id=1;";
		ResultSet rs=db.query(sql);
		try {
			while(rs!=null&&rs.next()){
				//int id=rs.getInt("id");
				String username=rs.getString("username");
				String password=rs.getString("password");				
				//System.out.println("id:"+id);
				System.out.println("username:"+username);
				System.out.println("password:"+password);					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.close();
	}
}
