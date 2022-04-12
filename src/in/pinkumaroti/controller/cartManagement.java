package in.pinkumaroti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cartManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public cartManagement() {
    
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action){
		case "ACART":
		acartItem(request,response);
		break;
	}
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String quantity=request.getParameter("quantity");
	System.out.println(request.getParameter("item"));

	System.out.println(request.getParameter("quantity"));
		doGet(request, response);
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
