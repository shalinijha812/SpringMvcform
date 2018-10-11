<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyFirstForm</title>
</head>
<body>
   <h1>User Registration Form</h1>
   <hr />

   <form:form action="saveUser" method="post" modelAttribute="user">
      <table>


         <tr>
            <td>Username</td>
            <td><input type="text" path="username"  name="username"/></td>
         </tr>
         <tr>
            <td>Password</td>
            <td><input type="password" path="password" /></td>
         </tr>

         <tr>
            <td></td>
            <td><input type="submit"></form></td>
         </tr>
      </table>
   </form:form>

</body>
</html>
