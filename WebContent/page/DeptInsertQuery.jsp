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
	<form action="" method="post" onsubmit="return check()" id="form">
		部门编号：<input type="text" id="deptNo" value="50" name="deptNo"><span id="deptNoS"></span>
		<br>
		部门名称：<input type="text" id="dName" value="Salsdsd" name="dName"><span id="dNameS"></span>
		<br>
		 部门所在地：<input type="text" id="dLoc" value="NewYork" name="dLoc"><span id="dLocS"></span>
        <br>
        <input type="submit" name="insert" value="insert" onclick="insertDept()"/>
        <input type="submit" name="query" value="query" onclick="queryDept()"/>
    </form>
    <table>
    <tr>
        <th>部门编号	</th>
        <th>部门名称	</th>
        <th>工作地点	</th>
    </tr>
	<c:forEach items="${requestScope.deptList }" var="d">
   		<tr>
	        <td>${d.deptNo}	</td>
	        <td>${d.deptName}	</td>
	        <td>${d.loc}	</td>

        	<td><a href="">修改	</a> <a href="/EHR/Dept/Delete?no=${d.deptNo }">删除</a></td>
  		</tr>
	</c:forEach>
</table>
</body>
</html>
