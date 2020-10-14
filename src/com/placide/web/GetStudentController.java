package com.placide.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.placide.web.dao.StudentDao;
import com.placide.web.model.Student;

/**
 * Servlet implementation class GetStudentController
 */
@WebServlet("/getStudent")
public class GetStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sid=Integer.parseInt(request.getParameter("sid"));
		StudentDao studDao=new StudentDao();
		Student student= studDao.getStudent(sid);
		PrintWriter out=response.getWriter();
		request.setAttribute("student", student);
		RequestDispatcher rd=request.getRequestDispatcher("data.jsp");
		rd.forward(request, response);
//		out.println("Student:"+student);
	}

}
