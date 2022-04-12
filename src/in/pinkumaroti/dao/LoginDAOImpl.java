package in.pinkumaroti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.pinkumaroti.entity.Login;
import in.pinkumaroti.util.DBConnectionUtil;

public class LoginDAOImpl implements LoginDAO{

	@Override
	public String authenticate(Login login) {
		String sql = "SELECT * FROM admin";
		try{
			Connection connection = DBConnectionUtil.openConnection();
			PreparedStatement p = connection.prepareStatement(sql);
			ResultSet r = p.executeQuery();
			while(r.next()){
			if(r.getString("email").equals(login.getEmail())&& r.getString("password").equals(login.getPassword())){
				return "true";
			}else{
				return "false";
			}
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	return "error";
	}

	@Override
	public String uauthenticate(Login login) {
		String sql = "SELECT * FROM tbl_login";
		try{
			Connection connection = DBConnectionUtil.openConnection();
			PreparedStatement p = connection.prepareStatement(sql);
		
			ResultSet r = p.executeQuery();
			while(r.next()){
			if(r.getString("email").equals(login.getEmail())&& r.getString("pwd").equals(login.getPassword())){
				return "true";
			}
		}
				return "false";
			
			}catch(Exception ex){
			ex.printStackTrace();
		}
	return "error";
	}

}
