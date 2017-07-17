<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href = "../css/bootstrap.css" rel="stylesheet">
    <script src="../js/checkEmp.js"></script>
</head>
<body class = "font" onload=setSelect()>
<form action="/EHR/Emp/Update2" method="post" onsubmit="return check()">
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">员工编号：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"  placeholder="number" name="empno" id="empno" value="${requestScope.emp.empNo }" readonly="readonly">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">员工姓名：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="name" name = "ename" id="ename" value="${requestScope.emp.empName }">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">工作：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="job" name = "job" value="${requestScope.emp.job }">
        </div>
    </div>
    	所属经理：<select name="mgr" class="form-control" selectedOption="${requestScope.emp.managerNo }">
    		<option value="8888" selected="selected">zhang</option>
    		<option value="7359">Wang</option>
        	<option value="7355">Kiii</option>
    </select>
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">入职时间：</label>
        <div class="col-sm-10">
            <input type="date" class="form-control" placeholder="hiredate" name = "hiredate" value="${requestScope.emp.hiredate }">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">工资：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="salary" name = "sal" id="sal" value="${requestScope.emp.salary }">
        </div>
    </div>
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">奖金：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" placeholder="comm" name = "comm" value="${requestScope.emp.comm }">
        </div>
    </div>
    	所属部门编号：<select name="deptno" class="form-control">
        <option value="20">SAL</option>
    </select>
    <br>
    <input type="submit" value="修改" />
</form>
</body>
</html>


