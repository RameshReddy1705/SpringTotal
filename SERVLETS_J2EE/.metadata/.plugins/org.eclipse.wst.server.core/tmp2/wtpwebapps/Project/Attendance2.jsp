<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance</title>
    
<%
String name =request.getParameter("ename");
String id =request.getParameter("emp_id");
String date= request.getParameter("date");
String fromTime = request.getParameter("ftime");
String toTime = request.getParameter("ttime");
String repManager = request.getParameter("manager");

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection
			("jdbc:mysql://127.0.0.1:3306/registration","root","Siva@149");
	
	Statement st = con.createStatement();
	st.executeUpdate("insert into attendance (name,employee_id,date,from_time,to_time,reporting_manager) values('"+name+"','"+id+"','"+date+"','"+fromTime+"','"+toTime+"','"+repManager+"')");
	//response.sendRedirect("save.html");
	out.println("SUCCESSFULLY UPLOADED");
	
	
	
} catch (Exception e) {
	//response.sendRedirect("error.html");
	out.println("System error");
}
%>
<%
   String ename =request.getParameter("ename");
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection(
        		"jdbc:mysql://127.0.0.1:3306/registration","root","Siva@149");
        //Statement st=con.createStatement();
       //ResultSet rs=st.executeQuery("select  * from attendance;");
       PreparedStatement ps=con.prepareStatement("select * from attendance where name=?");
	 ps.setString(1, ename);
	 ResultSet rs= ps.executeQuery();
    %>
    <table class=tb border=1 align=center style="text-align:center">
      <thead>
      <h2>ATTENDANCE REPORT</h2>
          <tr>
             <th>Name</th>
             <th>ID</th>
              <th>Date</th>
              <th>From time</th>
              <th>To time</th>
          </tr>
      </thead>
      <tbody>
   
        <%while(rs.next())
        {
            %>
            
            <tr>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("employee_id") %></td>
                <td><%=rs.getString("date") %></td>
                 <td><%=rs.getString("from_time") %></td>
                  <td><%=rs.getString("to_time") %></td>
            </tr>
            <%}%>
           </tbody>
        </table><br>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    
    %>

</body>
</html>