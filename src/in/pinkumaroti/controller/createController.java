package in.pinkumaroti.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.JsonArray;

import in.pinkumaroti.dao.acartDAO;
import in.pinkumaroti.dao.acartDAOImpl;
import in.pinkumaroti.dao.createDAO;
import in.pinkumaroti.dao.createDAOImpl;
import in.pinkumaroti.entity.acart;
import in.pinkumaroti.entity.create;



public class createController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;
	createDAO createDAO =null;
	acartDAO acartDAO =null;
   List<create> list = null;
    public createController() {
        
      createDAO = new createDAOImpl();
      list = new ArrayList<create>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
	
		switch(action){
		case "SHOW":
			listItem(request,response);
			break;
		case "USHOW":
			listuserItem(request,response);
			break;
		case "ACART":
			acartItem(request,response);
			break;
		case "EDIT":
			editListItem(request,response);
			break;
		case "DELETE":
			deleteListItem(request,response);
			break;
		default:
			listItem(request,response);
			break;
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String id = request.getParameter("id");
		String itemname=request.getParameter("itemname");
		String price=request.getParameter("price");
		String description = request.getParameter("description");
		String img = request.getParameter("img");

		create c  = new create();
		c.setItemname(itemname);
		c.setPrice(price);
		c.setDescription(description);
		c.setImg(img);
		if(id==null || id.isEmpty()){
		if(createDAO.get(c)){
			request.setAttribute("message", "Item added successfully!! ");
				
			
		}
		}else{
			c.setId(Integer.parseInt(id));
			if(createDAO.update(c)){
			request.setAttribute("message", "Item Updated successfully");
		}
			
		}
		listItem(request,response);
	}
	public void listItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	    list = createDAO.get();
		request.setAttribute("list", list);
		
		dispatcher=request.getRequestDispatcher("/Views/show.jsp");
		dispatcher.forward(request, response);
	
	
}
	public void editListItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

	String id = request.getParameter("id");
	create create = createDAO.gett(Integer.parseInt(id));
	request.setAttribute("create", create);

	dispatcher=request.getRequestDispatcher("/Views/create.jsp");
	dispatcher.forward(request, response);
	
	
	
	
	
	}

	public void deleteListItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		
		String id =request.getParameter("id");
		if(createDAO.delete(Integer.parseInt(id))){
			request.setAttribute("message", "Deleted Successfully");
			
		}
		listItem(request,response);
		
		
		
	}
	
	public void  listuserItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		   list = createDAO.get();
			request.setAttribute("list", list);
			
			dispatcher=request.getRequestDispatcher("/usershowlist.jsp");
			dispatcher.forward(request, response);
		
	}
	public void acartItem(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println(request.getParameter("item"));

		System.out.println(request.getParameter("quantity"));
//		acartDAO=new acartDAOImpl();
//		String quantity=request.getParameter("quantity");
//	String id = request.getParameter("id");
//		String itemname=request.getParameter("itemname");
//		String price=request.getParameter("price");
//		String description = request.getParameter("description");
//		String img = request.getParameter("img");
//		acart a = new acart();
//		a.setId(Integer.parseInt(id));
//		a.setImg(img);
//		a.setDescription(description);
//		a.setItemname(itemname);
//		a.setPrice(price);
//		a.setQuantity(quantity);
//		if(acartDAO.create(a)){
//			
//			request.setAttribute("message", "Item added to cart successfully!! ");;
//		}
//		listuserItem(request,response);
		
	
	}










}
