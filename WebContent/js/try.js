/**
 * Created by new on 2017/7/13.
 */
function check(){
    var ans = true;
    ans = checkEmpno() && ans;
    ans = checkEname() && ans;
    return ans;
    // if(ans){
    //     alert("success!");
    // }
}
function checkSal(){
    var sal = document.getElementById("sal");
    if(sal.value < 0){
        alert("salary is smaller than 0.");
        return false;
    }
    else{
        return true;
    }
}
function checkEmpno(){
    var empno = document.getElementById("empno");
    var novalue = empno.value;
    var req = /^\d{4}$/;
    if(novalue == ""){
        alert("it's empty!");
        return false;
    }
    else if(!req.test(novalue)){
        alert("it's not made by 4 nomber!");
        return false;
    }
    else{
        return true;
    }
}
function checkEname(){
    var name = document.getElementById("ename");
    var nv = name.value;
    var sta = /^\w{3,20}$/;
    if(nv == ""){
        alert("there is no name!");
        return false;
    }
    else if(!sta.test(nv)){
        alert("name is not right!");
        return false;
    }
    else{
        return true;
    }
}