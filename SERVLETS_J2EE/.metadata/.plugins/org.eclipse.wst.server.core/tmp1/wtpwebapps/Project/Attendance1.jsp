<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance</title>

<style>
h1
{
text-align: center;
font-size:x-large;
margin-bottom: 50px;

}
fieldset
{
 background-color:silver;
 width:500px;
 height:400px;
 border:1px solid black;
 padding:20px;
 margin-top:200px;
 margin-left:200px;

}
legend
{
 background-color: aqua;
 border:1px solid navy;
 border-radius: 10px;
 padding:8px;
}
label
{
width:100px;
display: inline-block;
}
#submit
{
 margin: auto;
 display:block;
 margin-top: 20px;
 padding: 15px 20px 15px 20px;
 font-size: 15px;
 font-weight: bold; 
}

</style>

   

</head>
<body>
<form action="Attendance.jsp" onsubmit="return validate()">
<fieldset>
       <h1>ATTENDANCE</h1>
  <label>name</label>
<input type="text" name="name" id="name"><br><br>
<label>Employee ID</label>
<input type="number" name="employee_id" id="id"><br><br>
<label>Date</label>
<input type="date" name="date" id="date"><br><br>
<label>From Time</label>
<input type="time" name="from_time" id="ftime"><br><br>
<label>To time</label>
<input type="time" name="to_time" id="ttime"><br><br>
<label>Reporting Manager</label>
<input type="text" name="reporting_manager" id="manager"><br><br>

<input type="submit" value="submit" id="login">
        
 </fieldset>
 </form>
 <script type="text/javascript">


 function validate()
 {
	 var t1= document.getElementById("ftime").value;
	 var t2= document.getElementById("ttime").value;
	 var t3= document.getElementById("name").value;
	 var t4= document.getElementById("id").value;
		
	
	
	
	   
	  var startHour = new Date("01/01/2007 " + t1);
	  var endHour = new Date("01/01/2007 " + t2);
	  var a= startHour.getHours();
	  var b= endHour.getHours();
	  var diff = endHour - startHour;
	  var hh = Math.floor(diff / (1000 * 60 * 60));
	  if(t3==""|| t3 == null)
		  {
		   alert("name is required")
		   return false;
		  }
	  if(t4==""|| t4== null)
	  {
	   alert("employee id is required")
	   return false;
	  }
  
	  
	  if(hh > 10 || a>b)
		  {
		  alert("invalid")
		  return false;
		  }
	  else
		  {
		  alert("valid")
		  return true;
		  }
	
	
	
 }

	
</script>

</body>
</html>