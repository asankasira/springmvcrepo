<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>	
		<h2>${headerMessage}</h2>
		<form action="<%=request.getContextPath()%>/submitAdmission.html" method="post">
			<p>First name: <input type="text" name="firstname" value=""></p>
			<p>Last name: <input type="text" name="lastname" value=""></p>
		    <p><input type="submit" value="Submit"></p>
		</form>
	</body>
</html>