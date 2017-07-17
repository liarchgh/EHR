package ocm.neusoft.deno.dao.entity.ls;

import java.util.List;

import com.neusoft.demo.entity.Dept;

import ocm.neusoft.deno.dao.ls.EmpDao;

public class test {
	public static void main(String[] args) {
		Dept dept = new Dept(20, "RESEARCH", "DALLAS");
		Emp emp = new Emp(7444, null, "SDF", 435, "2014-4-5", 222.22f, 11.11f, dept);
		EmpDao ed = new EmpDaoImpl();
		ed.insertEmp(emp);
		List<Emp> emps = ed.selectAllEmps(null, null);
		for(Emp e : emps){
			System.out.println(e.toString());
		}
	}
}
