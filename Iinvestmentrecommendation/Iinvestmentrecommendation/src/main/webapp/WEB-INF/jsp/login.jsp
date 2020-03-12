<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invest Online - Login</title>
</head>
<body>

	<div id="errors">
            Invalid Credentials.
    </div> 
    <form:form method="post">
    	<h1>Jsp page</h1>
		<label>Username <input type="text" id="username" name="username"/> </label><br>
		<label>Password <input type="password" id="password" name="password"/> </label><br>
		<input type="submit" id="login" value="SUBMIT"/><br>
	</form:form>
</body>
</html>