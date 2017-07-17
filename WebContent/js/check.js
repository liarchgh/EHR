/**
 * Created by new on 2017/7/13.
 */
function insertDept(){
	document.getElementById("form").action = "http://localhost:8080/EHR/Dept/AddDept";
}
function queryDept(){
	document.getElementById("form").action = "http://localhost:8080/EHR/Dept/Query";
}
function check(){
    var res = true;
    res = checkDeptNo() && res;
    res = checkDLoc() && res;
    res = checkDName() && res;
    return res;
}
function checkDeptNo(){
    var deptNo = document.getElementById("deptNo").value;
    var sta = /^\d{2}$/;
    if(!sta.test(deptNo) && deptNo != ""){
        var deptNoS = document.getElementById("deptNoS");
        deptNoS.innerHTML = "部门编号应该为2位";
        return false;
    }
    else{
        var deptNoS = document.getElementById("deptNoS");
        deptNoS.innerHTML = "";
        return true;
    }
}
function checkDName(){
    var dName = document.getElementById("dName").value;
    var sta = /^\w{4,20}$/;
    if(!sta.test(dName) && dName != ""){
        var dNameS = document.getElementById("dNameS");
        dNameS.innerHTML = "部门名称应该为4-20位英文字母或者为空";
        return false;
    }
    else{
        var dNameS = document.getElementById("dNameS");
        dNameS.innerHTML = "";
        return true;
    }
}
function checkDLoc(){
    var dLoc = document.getElementById("dLoc").value;
    var sta = /^\w{4,20}$/;
    if(!sta.test(dLoc) && dLoc != ""){
        var dLocS = document.getElementById("dLocS");
        dLocS.innerHTML = "部门所在地应该为4-20位英文字母或者为空";
        return false;
    }
    else{
        var dLocS = document.getElementById("dLocS");
        dLocS.innerHTML = "";
        return true;
    }
}