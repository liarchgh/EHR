<%@page import="java.util.List" %>
<%@page import="ocm.neusoft.deno.dao.entity.ls.Emp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
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
            var req = /^[a-zA-Z]{6,20}$/;
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
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>经理编号</th>
        <th>岗位</th>
        <th>入职时间</th>
        <th>薪资</th>
        <th>奖金</th>
        <th>部门名称</th>
        <th>操作</th>
    </tr>
    <%
    List<Emp> emps = (List<Emp>)request.getAttribute("emplist");
    if(emps != null){
    for(Emp e : emps){
    %>
   		<tr>
	        <td><%=e.getEmpNo()%></td>
	        <td><%=e.getEmpName() %></td>
	        <td><%=e.getManagerNo()%></td>
	        <td><%=e.getJob()%></td>
	        <td><%=e.getHiredate()%></td>
	        <td><%=e.getSalary()%></td>
	        <td><%=e.getComm()%></td>
	        <td><%=e.getDept().getDeptName()%></td>
        	<td><a href="">修改</a> <a href="">删除</a></td>
  		</tr>
    <%
    }
    }
    %>
    <!-- 
    <tr>
        <td>3243</td>
        <td>never</td>
        <td>2323</td>
        <td>2023-1-4</td>
        <td>9999</td>
        <td>2323</td>
        <td>manager</td>
        <td><a href="">修改</a> <a href="">删除</a></td>
    </tr>
     -->
</table>
</body>
</html>