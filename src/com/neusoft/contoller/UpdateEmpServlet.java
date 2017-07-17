package com.neusoft.contoller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ocm.neusoft.deno.dao.entity.ls.Emp;
import ocm.neusoft.deno.dao.entity.ls.EmpDaoImpl;

/**
 * Servlet implementation class UpdateEmpServlet
 */
@WebServlet("/Emp/Update")
public class UpdateEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empNo = request.getParameter("empNo");
		EmpDaoImpl edi = new EmpDaoImpl();
		Emp emp = edi.selectAllEmps(empNo, "").get(0);
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("/page/updateEmp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
