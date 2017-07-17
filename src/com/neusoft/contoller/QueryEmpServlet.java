package com.neusoft.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ocm.neusoft.deno.dao.entity.ls.Emp;
import ocm.neusoft.deno.dao.entity.ls.EmpDaoImpl;

/**
 * Servlet implementation class QueryEmpServlet
 */
@WebServlet("/Emp/Query")
public class QueryEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		String empno = request.getParameter("eno");
		String ename = request.getParameter("ename");
		System.out.println(empno + " " + ename);
		
		EmpDaoImpl ee = new EmpDaoImpl();
		List<Emp> emps = ee.selectAllEmps(empno, ename);
		request.setAttribute("emplist", emps);
		request.getRequestDispatcher("/page/query_Emp.jsp").forward(request,  response);
	}

}
