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
 * Servlet implementation class QueryDeptServlet
 */
@WebServlet("/Dept/Query")
public class QueryDeptServlet extends HttpServlet {
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
		String dNo = request.getParameter("deptNo");
		String dName = request.getParameter("dName");
		String dLoc = request.getParameter("dLoc");
		DeptDaoImpl dd = new DeptDaoImpl();
//		System.out.println(dd.selectAllDepts(dNo, dName));
		List<Dept> depts = dd.selectAllDepts(dNo, dName, dLoc);
		request.setAttribute("deptList", depts);
		request.getRequestDispatcher("/page/DeptInsertQuery.jsp").forward(request, response);
	}

}
