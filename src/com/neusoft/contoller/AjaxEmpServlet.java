package com.neusoft.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ocm.neusoft.deno.dao.entity.ls.Emp;
import ocm.neusoft.deno.dao.entity.ls.EmpDaoImpl;

/**
 * Servlet implementation class AjaxEmpServlet
 */
@WebServlet("/Emp/Ajax")
public class AjaxEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		EmpDaoImpl edi = new EmpDaoImpl();
		PrintWriter out = response.getWriter();
		List<Emp> emps = edi.selectAllEmps(no, null);
		if(emps.size() == 0){
			out.write("Right.");
		}
		else{
			out.write("Sorry! This count can't be used.");
		}
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
