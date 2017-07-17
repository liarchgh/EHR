package com.neusoft.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.demo.dao.ls.DeptDaoImpl;
import com.neusoft.demo.entity.Dept;

/**
 * Servlet implementation class AddDept
 */
@WebServlet("/Dept/AddDept")//http://localhost:8080/EHR/Dept/AddDept
public class AddDept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDept() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptNo = request.getParameter("deptNo");
		String dName = request.getParameter("dName");
		String dLoc = request.getParameter("dLoc");
		DeptDaoImpl dd = new DeptDaoImpl();
		dd.insertDept(new Dept(Integer.parseInt(deptNo), dName, dLoc));
		
		request.getRequestDispatcher("/page/exp.html").forward(request, response);
	}

}
