package com.neusoft.contoller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.neusoft.demo.dao.ls.DeptDaoImpl;
import com.neusoft.demo.entity.Dept;

/**
 * Servlet implementation class AjaxDeptServlet
 */
@WebServlet("/Dept/Ajax")
public class AjaxDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeptDaoImpl ddi = new DeptDaoImpl();
		List<Dept>depts = ddi.selectAllDepts(null, null, null);
		JSONArray jsonarray = JSONArray.fromObject(depts);
		PrintWriter ww = response.getWriter();
		ww.write(jsonarray.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
