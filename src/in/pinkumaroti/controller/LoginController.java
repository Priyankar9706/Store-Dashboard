package in.pinkumaroti.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.pinkumaroti.dao.LoginDAO;
import in.pinkumaroti.dao.LoginDAOImpl;
import in.pinkumaroti.entity.Login;

public class LoginController extends HttpServlet{
	
	LoginDAO loginDAO = null;
	
	public LoginController(){
		loginDAO = new LoginDAOImpl();
		
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	boolean flag=false;
	HttpSession session = req.getSession();
	Login login =new Login();	
	System.out.println("LL");
	login.setEmail( req.getParameter("email"));
	login.setPassword(req.getParameter("password"));
	String status = loginDAO.authenticate(login);
	String ustatus=loginDAO.uauthenticate(login);
	if(status.equals("true")){
		flag=true;
		session.setAttribute("email",login.getEmail());
		session.setAttribute("statu", flag);
		   RequestDispatcher dispatcher = req.getRequestDispatcher("/Views/intro.jsp");
		    dispatcher.forward(req, resp);
	}else if(ustatus.equals("true")){
		flag=false;
		session.setAttribute("email", login.getEmail());
		session.setAttribute("statu", flag);
		 RequestDispatcher dispatcher = req.getRequestDispatcher("/userfront.jsp");
		    dispatcher.forward(req, resp);
		
	}else{
	if(status.equals("false") && ustatus.equals("false")){

		resp.sendRedirect("index.jsp?status=false");
	}
	if(status.equals("error") && status.equals("error")){
		resp.sendRedirect("index?status=error");
	}
	}
	}
}
