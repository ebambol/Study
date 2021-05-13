function checkForm() {
  var form = document.score;

  var kor1 = document.getElementById("kor1");
  var kor2 = document.getElementById("kor2");
  var kor3 = document.getElementById("kor3");

  var eng1 = document.getElementById("eng1");
  var eng2 = document.getElementById("eng2");
  var eng3 = document.getElementById("eng3");

  var math1 = document.getElementById("math1");
  var math2 = document.getElementById("math2");
  var math3 = document.getElementById("math3");
  var regExp = /^[0-9][0-9]?$|^100$/
  
  if(!check(regExp,kor1,"0~100사이")){
    return;
  }
  if(!check(regExp,eng1,"0~100사이")){
    return;
  }
  if(!check(regExp,math1,"0~100사이")){
    return;
  }
  if(!check(regExp,kor2,"0~100사이")){
    return;
  }
  if(!check(regExp,eng2,"0~100사이")){
    return;
  }
  if(!check(regExp,math2,"0~100사이")){
    return;
  }

  if(!check(regExp,kor3,"0~100사이")){
    return;
  }
  if(!check(regExp,eng3,"0~100사이")){
    return;
  }
  if(!check(regExp,math3,"0~100사이")){
    return;
  }

  function check(regExp,e,msg){
    if(regExp.test(e.value)){
          return true;
    }
        alert(msg);
        e.select();
        e.focus();
        return false;
  }
  form.submit();
}