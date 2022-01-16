
function fieldCheck(){
	var inputkey=document.getElementById("txtAccess");
    if(inputkey.value===""){
        alert("Access Code is Required");
        return false;
    }else if(inputkey.value.trim().length <6){
alert("Access Code must Be 6 digit");
return false;
    }else{
        true;
    }
    };

function fieldClear(){
  document.getElementById("adminLogin").reset();
  return false;
};