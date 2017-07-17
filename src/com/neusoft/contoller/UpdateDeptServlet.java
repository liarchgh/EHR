package com.neusoft.contoller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.demo.dao.ls.DeptDaoImpl;
import com.neusoft.demo.entity.Dept;

/**
 * Servlet implementation class UpdateDeptServlet
 */
@WebServlet("/Dept/Update")
public class UpdateDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeptDaoImpl ddi = new DeptDaoImpl();
		List<Dept> depts = ddi.selectAllDepts(request.getParameter("deptNo"), null, null);
		Dept dept = depts.get(0);
		request.setAttribute("dept", dept);
		request.getRequestDispatcher("/page/UpdateDept.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
