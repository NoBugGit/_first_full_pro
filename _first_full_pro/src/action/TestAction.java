package action;

import java.sql.ResultSet;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import dbutils.DBUtil;
import model.UserTable;
import net.sf.json.JSONObject;



public class TestAction extends ActionSupport {
	private UserTable userTable;
	private String result;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
//		userTable1=new UserTable("111","111");

		DBUtil db=new DBUtil();
		String sql="select username,password from user_table where id=1;";
		ResultSet rs=db.query(sql);
		try {
			while(rs!=null&&rs.next()){
				//int id=rs.getInt("id");
				String username=rs.getString("username");
				String password=rs.getString("password");				
				userTable=new UserTable(username,password);
				JSONObject json = JSONObject.fromObject(userTable);//
				result = json.toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.close();
		return SUCCESS;
	}
	public UserTable getUserTable() {
		return userTable;
	}
	public void setUserTable(UserTable userTable) {
		this.userTable = userTable;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	
	
}
