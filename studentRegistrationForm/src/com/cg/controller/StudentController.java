package com.cg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.RegisterBean;
import com.cg.exception.StudentException;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;



@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StudentController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String name=request.getParameter("sname");
		String dept=request.getParameter("sdept");
		String marks=request.getParameter("smarks");
		String number=request.getParameter("snum");
		String percent=request.getParameter("sper");
		
		
		
		RegisterBean bean=new RegisterBean();
		
		bean.setStudentName(name);
		bean.setStudentDept(dept);
		bean.setMarks_12(marks);
		bean.setMobileNumber(number);
		bean.setPercentage(percent);
				
		
		HttpSession session=request.getSession();

		StudentService service=new StudentServiceImpl();

			/*if(service.isValid(percent))
				{*/

				try
				{
					/*if(service.isValid(percent))  {*/
					session.setAttribute("name",name);
					session.setAttribute("dept",dept);
					session.setAttribute("marks",marks);
					session.setAttribute("number",number);
					session.setAttribute("percent",percent);
					request.getRequestDispatcher("success.html").include(request, response);
				/*}
				else {
					request.setAttribute("errmsg",
							"Invalid Data! Try Again!!");
				
				}
				*/
				}
			catch(Exception se)
			{
				session.setAttribute("errMsg", se.getMessage());
				request.getRequestDispatcher("error.jsp").forward(request, response);	
			}
				
				
				/*	
				else {
					request.setAttribute("errmsg",
							"Invalid Data! Try Again!!");
					
					
				}
		*/
	}
}