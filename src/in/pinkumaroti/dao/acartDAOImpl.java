package in.pinkumaroti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import in.pinkumaroti.entity.acart;
import in.pinkumaroti.util.DBConnectionUtil;

public class acartDAOImpl implements acartDAO {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedstatement = null;

	
	@Override
	public boolean create(acart a) {
		boolean flag =false;
		try{
			String sql="INSERT INTO tbl_acart(id,itemname,description,price,img,quantity)VALUES('"+a.getId()+"','"+a.getItemname()+"','"+a.getDescription()+"','"+a.getPrice()+"','"+a.getImg()+"','"+a.getQuantity()+"',)";
			connection=DBConnectionUtil.openConnection();
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.executeUpdate();
			flag=true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

}
