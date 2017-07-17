<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="../js/check.js"></script>
</head>
<!-- //http://localhost:8080/EHR/Dept/AddDept -->
<body>
	<form action="/EHR/Dept/Update2" method="post" onsubmit="return check()" id="form">
		部门编号：<input type="text" id="deptNo" value="${requestScope.dept.deptNo }" name="deptNo" readonly="readonly"><span id="deptNoS"></span>
		<br>
		部门名称：<input type="text" id="dName" value="${requestScope.dept.deptName }" name="dName"><span id="dNameS"></span>
		<br>
		 部门所在地：<input type="text" id="dLoc" value="${requestScope.dept.loc }" name="dLoc"><span id="dLocS"></span>
        <br>
        <input type="submit" value="update"/>
    </form>
</body>
</html>
