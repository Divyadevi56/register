<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script> 
function validate()
{ 
 var studentName = document.form.sname.value;
 var studentDept = document.form.sdept.value;
 var marks12th = document.form.smarks.value; 
 var mobileNumber = document.form.snum.value;
 var percentage= document.form.sper.value;
 
 if (studentName==null || studentName=="")
 { 
 alert("Name can't be blank"); 
 return false; 
 }
 else if (studentDept==null || studentDept=="")
 { 
 alert("Email can't be blank"); 
 return false; 
 }
 else if (marks12th==null || marks12th=="")
 { 
 alert("Marks can't be empty"); 
 return false;
 }
 else if (mobileNumber.length()!=10)
 { 
 alert("Enter a valid mobile Number"); 
 return false; 
 }
 else if (percentage==null || percentage==""||percentage>100)
 { 
 alert("Enter a valid Percentage"); 
 return false; 
 }
}
</script> 
</head>
<body>
<form  name="form" action="StudentController" method="post" onsubmit="return validate()">

Enter student Name:<input type="text" name="sname" >
Enter student Department:<input type="text" name="sdept" >
Enter student Marks:<input type="text" name="smarks" >
Enter student Phone Number:<input type="text" name="snum" >
Enter student Percentage:<input type="text" name="sper" >

<input type="submit" value="Register" name="reg">


</form>

</body>
</html>