package ocm.neusoft.deno.dao.ls;

import java.util.List;

import ocm.neusoft.deno.dao.entity.ls.Emp;

public interface EmpDao {
	public void insertEmp(Emp emp);
	public List<Emp> selectAllEmps(String eno, String ename);
	public void deleteEmp(int empno);
	public void updateEmp(Emp emp);
}
