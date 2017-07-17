<%@page import="java.util.List" %>
<%@page import="ocm.neusoft.deno.dao.entity.ls.Emp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script>
        function checkename(){
//            var enamespan = document.getElementById("enamespan");
//            enamespan.innerHTML = "name's formation is wrong!";

            var ename = document.getElementById("ename");
            var enamevalue = ename.value;
            var req = /^[a-zA-Z]{4,20}$/;
            if(req.test(enamevalue) == false && enamevalue != ""){
                var enamespan = document.getElementById("enamespan");
                enamespan.innerHTML = "name's formation is wrong!";
                return false;
            }
            else{
                var enamespan = document.getElementById("enamespan");
                enamespan.innerHTML = "";
                return true;
            }
        }
    </script>
</head>
<body>
<form action="../Emp/Query" method="post" onsubmit="return checkename()">
    员工姓名：<input type="text" name="ename" id="ename"><span id="enamespan"></span>
    <br>
    员工编号：<input type="text" name="eno">
    <br>
    <input type="submit" value="查询">
</form>
<table>
    <tr>
        <th>员工编号	</th>
        <th>员工姓名	</th>
        <th>经理编号	</th>
        <th>岗位	</th>
        <th>入职时间	</th>
        <th>薪资	</th>
        <th>奖金	</th>
        <th>部门名称	</th>
        <th>操作	</th>
    </tr>
    <c:forEach items="${requestScope.emplist }" var="e">
   		<tr>
	        <td>${e.empNo}	</td>
	        <td>${e.empName}	</td>
	        <td>${e.managerNo}	</td>
	        <td>${e.job}	</td>
	        <td>${e.hiredate}	</td>
	        <td>${e.salary}	</td>
	        <td>${e.comm}	</td>
	        <td>${e.dept.deptName}	</td>
        	<td><a href="">修改	</a> <a href="/EHR/Emp/Delete?no=${e.empNo }">删除</a></td>
  		</tr>
</c:forEach>
</table>
</body>
</html>