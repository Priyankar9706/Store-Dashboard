package in.pinkumaroti.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.pinkumaroti.dao.signupDAO;
import in.pinkumaroti.dao.signupDAOImpl;
import in.pinkumaroti.entity.signup;


public class signupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;
    signupDAO signupDAO=null;
    List<signup> l =null;
   
    public signupController() {
       signupDAO = new signupDAOImpl();
       l= new ArrayList<signup>();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname= request.getParameter("fname");
		String email= request.getParameter("email");
		String pwd= request.getParameter("pwd");
		String pwdr= request.getParameter("pwdr");
		signup s = new signup();
		s.setEmail(email);
		s.setFname(fname);
		s.setPwd(pwd);
		s.setPwdr(pwdr);
		if(signupDAO.get(s)){
		request.setAttribute("message", "SignUp Successfull!!");	
		}
		listSignup(request,response);
		
	}
	public void listSignup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		dispatcher=request.getRequestDispatcher("/signupd.jsp");
		dispatcher.forward(request, response);
		
		
		
		
}
	
	
}
