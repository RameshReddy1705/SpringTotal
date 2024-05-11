<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>

<%
try
    {
	 String user = session.getAttribute("name").toString();
        Class.forName("com.mysql.jdbc.Driver");
      Connection con= DriverManager.getConnection(
        		"jdbc:mysql://127.0.0.1:3306/registration","root","Siva@149");
        //Statement st=con.createStatement();
       //ResultSet rs=st.executeQuery("select  * from attendance;");
       PreparedStatement ps=con.prepareStatement("select * from attendance where reporting_manager=?");
	 ps.setString(1,user);
	 ResultSet rs= ps.executeQuery();
    %>
    <table class="tb" border=1 align=center style="text-align:center">
      <thead>
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
    <%
    }
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    
    %>

