package com.neusoft.demo.dao.ls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neusoft.demo.entity.Dept;

public class DeptDaoImpl implements DeptDao{

	@Override
	public void deleteDept(int deptId){
		Connection conn= DBUtil.getConnection();
		PreparedStatement ps = null;
		String sql= "delete from dept where deptno = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,  deptId);
			ps.executeUpdate();
			System.out.println("DeleteSuccessfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(null, ps, conn);
		}
	}

	@Override
	public List<Dept> selectAllDepts(String dno, String dname, String dloc) {
		List<Dept> depts = new ArrayList<Dept>();
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select * from dept where 1=1 ";
		if(dno != null && !dno.equals("")){
			sql = sql + " and deptno = '" + dno + "' ";
		}
		if(dname != null && !dname.equals("")){
			sql = sql + " and dname = '" + dname + "'";
		}
		if(dloc != null && !dloc.equals("")){
			sql = sql + " and loc = '" + dloc + "'";
		}
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt(1);
				String deptname = rs.getString(2);
				String loc = rs.getString(3);
				Dept d = new Dept(deptno, deptname, loc);
				depts.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return depts;
	}

	@Override
	public void updateDept(Dept d) {
		Connection conn= DBUtil.getConnection();
		PreparedStatement ps = null;
		
		String sql= "update dept set dname = ?, loc = ? where deptno = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,  d.getDeptName());
			ps.setString(2,  d.getLoc());
			ps.setInt(3,  d.getDeptNo());
			ps.executeUpdate();
			System.out.println("UpdateSuccessfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(null, ps, conn);
		}
	}

	public void insertDept(Dept d) {
		Connection conn= DBUtil.getConnection();
		PreparedStatement ps = null;
		
		String sql= "insert into dept values(?, ?, ?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,  d.getDeptNo());
			ps.setString(2,  d.getDeptName());
			ps.setString(3,  d.getLoc());
			ps.executeUpdate();
			System.out.println("InsertSuccessfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.close(null, ps, conn);
		}
	}
}
