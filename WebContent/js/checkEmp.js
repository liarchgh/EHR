/**
 * Created by new on 2017/7/13.
 */
function insertemp(){
	document.getElementById("form").action = "http://localhost:8080/EHR/emp/Addemp";
}
function queryemp(){
	document.getElementById("form").action = "http://localhost:8080/EHR/emp/Query";
}
function checkUpdate(){
    var res = true;
    res = checkempNo() && res;
    res = checkDLoc() && res;
    res = checkDName() && res;
    return res;
}
function setSelec(){
    var all = document.getElementsByClassName("needSelect");

}
function checkempNo(){
    var empNo = document.getElementById("empNo").value;
    var sta = /^\d{2}$/;
    if(!sta.test(empNo) && empNo != ""){
        var empNoS = document.getElementById("empNoS");
        empNoS.innerHTML = "部门编号应该为2位";
        return false;
    }
    else{
        var empNoS = document.getElementById("empNoS");
        empNoS.innerHTML = "";
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