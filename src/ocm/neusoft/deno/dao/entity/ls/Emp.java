package ocm.neusoft.deno.dao.entity.ls;

import com.neusoft.demo.entity.Dept;

public class Emp {
	private int empNo;
	private String empName;
	private String job;
	private int managerNo;
	private String hiredate;
	private float salary;
	private float comm;
	private Dept dept;
	public Emp(int enpNo, String empName, String job, int managerNo,
			String hiredate, float salary, float comm, Dept dept) {
		super();
		this.empNo = enpNo;
		this.empName = empName;
		this.job = job;
		this.managerNo = managerNo;
		this.hiredate = hiredate;
		this.salary = salary;
		this.comm = comm;
		this.dept = dept;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [enpNo=" + empNo + ", empName=" + empName + ", job=" + job
				+ ", managerNo=" + managerNo + ", hiredate=" + hiredate
				+ ", salary=" + salary + ", comm=" + comm + ", dept=" + dept.toString()
				+ "]";
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int enpNo) {
		this.empNo = enpNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(int managerNo) {
		this.managerNo = managerNo;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
