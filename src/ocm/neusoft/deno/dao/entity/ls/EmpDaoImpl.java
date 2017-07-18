package ocm.neusoft.deno.dao.entity.ls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.demo.dao.ls.DBUtil;
import com.neusoft.demo.entity.Dept;

import ocm.neusoft.deno.dao.ls.EmpDao;

public class EmpDaoImpl implements EmpDao{

	@Override
	public void insertEmp(Emp emp) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		
		String sql = "insert into emp values(?, ?, ?, ?, to_date(?, 'yyyy-mm-dd'), ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,  emp.getEmpNo());
			ps.setString(2, emp.getEmpName());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getManagerNo());
			ps.setString(5, emp.getHiredate());
			ps.setFloat(6, emp.getSalary());
			ps.setFloat(7, emp.getComm());
			ps.setInt(8, emp.getDept().getDeptNo());
			ps.executeUpdate();
			System.out.println("InsertSuccessfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Emp> selectAllEmps(String eno, String name) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Emp> res = new ArrayList<Emp>();
		
		String sql = "select e.empno, e.ename, e.job, e.hiredate, e.mgr, e.sal, e.comm, e.deptno, d.dname, d.loc from emp e left join dept d on(e.deptno = d.deptno) where 1=1";
		if(eno != null && !eno.equals("")){
			sql = sql + " and empno = '" + eno + "' ";
		}
		if(name != null && !name.equals("")){
			sql = sql + " and ename = '" + name + "'";
		}
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String hiredate = rs.getString(4);
				int mgr = rs.getInt(5);
				float sal = rs.getFloat(6);
				float comm = rs.getFloat(7);
				int deptno = rs.getInt(8);
				String deptname = rs.getString(9);
				String loc = rs.getString(10);
				
				Dept d = new Dept(deptno, deptname, loc);
				Emp e = new Emp(empno, ename, job, mgr, hiredate.split(" ")[0], sal, comm, d);
				res.add(e);
			}
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteEmp(int empno) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		
		String sql = "delete from emp where empno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, empno);
			ps.executeUpdate();
			System.out.println("DeleteSuccessfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmp(Emp emp) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		
		String sql = "update emp set ename = ?, job = ?, mgr = ?, hiredate = to_date(?, 'yyyy-mm-dd'), sal = ?, comm = ?, deptno = ? where empno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getJob());
			ps.setInt(3, emp.getManagerNo());
			ps.setString(4, emp.getHiredate());
			ps.setFloat(5, emp.getSalary());
			ps.setFloat(6, emp.getComm());
			ps.setInt(7, emp.getDept().getDeptNo());
			ps.setInt(8, emp.getEmpNo());
			System.out.println(ps.toString());
			ps.executeUpdate();
			System.out.println("UpdateSuccessfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
