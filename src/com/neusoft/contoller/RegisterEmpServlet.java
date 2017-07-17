package com.neusoft.contoller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.demo.entity.Dept;

import ocm.neusoft.deno.dao.entity.ls.Emp;
import ocm.neusoft.deno.dao.entity.ls.EmpDaoImpl;

/**
 * Servlet implementation class RegisterEmpServlet
 */
@WebServlet("/Emp/RegisterEmpServlet")//http://localhost:8080/EHR/RegisterEmpServlet
public class RegisterEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost");
//		String method = request.getMethod();
//		String ip = request.getRemoteAddr();
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		String mgr = request.getParameter("mgr");
		String hiredate = request.getParameter("hiredate");
		String sal = request.getParameter("sal");
		String comm = request.getParameter("comm");

		System.out.println(empno);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(mgr);
//		mgr = "7324";
		System.out.println(hiredate);
		System.out.println(sal);
		System.out.println(comm);
		
		Emp emp = new Emp();
		emp.setEmpNo(Integer.parseInt(empno));
		emp.setManagerNo(Integer.parseInt(mgr));
		emp.setEmpName(ename);
		emp.setJob(job);
		emp.setHiredate(hiredate);
		emp.setSalary(Float.parseFloat(sal));
		emp.setComm(Float.parseFloat(comm));
		emp.setDept(new Dept(20, null, null));

		EmpDaoImpl ed = new EmpDaoImpl();
		ed.insertEmp(emp);
//		List<Emp> all = null;
//		all = ed.selectAllEmps(null, null);
//		
//		System.out.println(all);
		request.getRequestDispatcher("/page/query_Emp.jsp").forward(request, response);
	}
}
