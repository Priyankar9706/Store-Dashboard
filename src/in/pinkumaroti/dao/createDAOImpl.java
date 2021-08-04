package in.pinkumaroti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.pinkumaroti.entity.create;

import in.pinkumaroti.util.DBConnectionUtil;

public class createDAOImpl implements createDAO {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedstatement = null;
	
	public boolean get(create c) {
		boolean flag=false;

		
	
		try{
			
			String sql = "INSERT INTO tbl_item(Item,Price,Description,Img) VALUES('"+c.getItemname()+"', '"+c.getPrice()+"', '"+c.getDescription()+"','"+c.getImg()+"')";
			connection = DBConnectionUtil.openConnection();
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.executeUpdate();
			flag = true;
			}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<create> get() {
		
		List<create> list =null;
		create create = null;
		
		try{
	String sql="SELECT * FROM tbl_item";
	connection=DBConnectionUtil.openConnection();
	statement = connection.createStatement();
	resultset = statement.executeQuery(sql);
	list = new ArrayList<create>();
	while(resultset.next()){
		create =new create();
		create.setId(resultset.getInt("ID"));
		create.setItemname(resultset.getString("Item"));
		create.setPrice(resultset.getString("Price"));
		create.setDescription(resultset.getString("Description"));
		create.setImg(resultset.getString("Img"));
		list.add(create);
	}
	}catch(Exception e){
		e.printStackTrace();
	}
		return list;
	}

	@Override
	public boolean update(create c) {
		boolean flag=false;
		try{
			String sql="Update tbl_item  SET Item='"+c.getItemname()+"',Price='"+c.getPrice()+"',Description='"+c.getDescription()+"',Img='"+c.getImg()+"'WHERE id="+c.getId();
			connection=DBConnectionUtil.openConnection();
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.executeUpdate();
			flag=true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean delete(int id) {
		boolean flag=false;
		try{
		String sql = "DELETE FROM tbl_item WHERE id="+id;
		connection = DBConnectionUtil.openConnection();
		preparedstatement = connection.prepareStatement(sql);
		preparedstatement.executeUpdate();
		flag = true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public create gett(int id) {
		create create = null;
		try{
			create = new create();
			String sql = "SELECT * FROM tbl_item WHERE id= "+id;
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery(sql);
			while(resultset.next()){
				create.setId(resultset.getInt("Id"));
				create.setItemname(resultset.getString("Item"));
				create.setPrice(resultset.getString("Price"));
				create.setDescription(resultset.getString("Description"));
				create.setImg(resultset.getString("Img"));
			}
			
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}
		return create;
	}




}
