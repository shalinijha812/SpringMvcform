<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page isELIgnored="false" %>
<title>MyFirstForm</title>
</head>
<body>
   <h1>${message}</h1>
   <hr />
   <table>
      <tr>
         <td>Username:${user.username}</td>
      </tr>
      <tr>
         <td>Password : ${user.password}</td>
      </tr>
   </table>
</body>
</html>