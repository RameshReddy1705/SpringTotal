<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<style>
h2 {
text-align: center;
font-size: medium;
 font-weight: bold;

}

body
{
background-image: url("Siva.jpg")  ;
background-size: cover;

} 
#logo
{
 margin:auto;
 display:block;
 padding-bottom: 100px;

}
#form
{
 margin-bottom: 10px;
 padding: 10px 15px 10px 15px;
 text-align: center;
}
#login
{
margin-top:20px;
 padding: 10px 15px 10px 15px;
 text-align: center;
 margin-left: 60px;
 font-weight: bold;
}
.container
{
 text-align: center;
 font-weight: bold;
}
.p
{
font-size: x-large;
color:white;
}
#button {
	margin: auto;
	display: block;
	margin-top: 20px;
	padding: 15px 20px 15px 20px;
	font-size: 15px;
	font-weight: bold;
	background-color:limeGreen;
	border-radius: 10px 10px 10px 10px;
}
</style>




<script type="text/javascript">
function validations()
{
	var str1=document.f1.txtName.value;
	var str2=document.f1.txtPwd.value;
	if(str1==null||str1=="")
		{
		
		 alert("Username is required");
		 return false;
		}
	 
	if(str2==null||str2=="")
	{
	
	 alert("Password is required");
	 return false;
	}
	
}
</script>
</head>
<body>



<form name="f1" action="validate2.jsp" method="post" onsubmit="return validations()">

<table align="center">
<h2> Employee login</h2>
<tr><td><input type="text" name=txtName placeholder="Username" id="form" ></td></tr>
<tr><td><input type="password" name=txtPwd placeholder="Password" id="form"></td></tr>
<tr><td><input type="submit" value="LOGIN" id="login"></td></tr>
</table>
</form>
<div class="container" >

 
<form action="emp details.html" >
<p class="p">new employee</p>
 <button  id ="form"  >REGISTER</button>
 </form>
 
 </div>

</body>
</html>