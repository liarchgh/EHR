package com.neusoft.demo.dao.ls;

import java.util.List;

import com.neusoft.demo.entity.Dept;

public interface DeptDao {
	public void deleteDept(int deptId);
	public List<Dept> selectAllDepts(String dno, String dname, String loc);
	public void updateDept(Dept d);
	public void insertDept(Dept d);
}
