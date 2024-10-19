<%@ page contentType="text/html;charset=ISO-8859-1" language="java"
pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert Title Here:</title>
</head>
<body>
<div align="center">
    <h1>Employee Register Form</h1>
</div>
<form action="<%=request.getContextPath()%>/Register" method="post">
    <table style="with:80%">
        <tr>
            <td>First Name</td>
            <td > <input type="text" name="firstName">
            </td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td > <input type="text" name="lastName">
            </td>
        </tr>
        <tr>
            <td>UserName</td>
            <td > <input type="text" name="userName">
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td > <input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td>Address </td>

            <td > <input type="text" name="Address">
            </td>
        </tr>
        <tr>
        <td>Contact</td>
        <td > <input type="text" name="Contact">
        </td>
        </tr>



    </table>
</form>

</body>
</html>
