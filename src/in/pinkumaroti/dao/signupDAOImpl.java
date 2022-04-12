package in.pinkumaroti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import in.pinkumaroti.entity.signup;
import in.pinkumaroti.util.DBConnectionUtil;


public class signupDAOImpl implements signupDAO{
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedstatement = null;
	
	@Override
	public boolean get(signup s) {
	boolean flag=false;
	try{
		String sql="INSERT INTO tbl_login(fname,email,pwd,pwdr)VALUES('"+s.getFname()+"','"+s.getEmail()+"','"+s.getPwd()+"','"+s.getPwdr()+"')";
		connection =DBConnectionUtil.openConnection();
		preparedstatement=connection.prepareStatement(sql);
		preparedstatement.executeUpdate();
		flag=true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return flag;
	
	}

}
