<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

body{

background-image:url(file:///C:/Users/HP/Desktop/Test_H/demo/Spring-demo/src/main/webapp/images/images.jpg);
text-align:center;
background-size: cover;
background-position: center center;



}


.box{

width:500px;
heigth:250px;
border:3px soild #ffff;
text-align: center;
padding:35px;
border-radius: 70px 0 70px 0;
margin:60px auto 0;




}




</style>
</head>
<body>
<h1>this is login page</h1>
<hr>

<div class="box">
<form action="loginpage" method="post">
<label>Phone: </label>
<input type="tel" name="phone"> <br>
<label>Password: </label>
<input type="password" name="password"><br>
<input type="submit" value="LOGIN">
</form>
<br>
<h1><a href="load?choice=1">register</a></h1>
</div>
</body>
</html>