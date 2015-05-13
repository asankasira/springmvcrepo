<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
	<body>	
		<h2>${headerMessage}</h2>
		<br/>
		<frm:errors path="student.*" cssStyle="color: red" />
		<form action="<%=request.getContextPath()%>/submitAdmission.html" method="post">
			<p>First name: <input type="text" name="firstname" value=""></p>
			<p>Last name: <input type="text" name="lastname" value=""></p>
			<p></p>
			<p>Student's Hobby: <input type="text" name="studentHobby" value=""></p>
			<p>Student's Mobile: <input type="text" name="studentMobile" value=""></p>
			<p>DOB: <input type="text" name="dateOfBirth" value=""></p>
			<p>Skill Set: <select name="studentSkills" multiple="multiple">
							<option value="Java Core">Java Core</option>
							<option value="Struts">Struts</option>
							<option value="Spring MVC">Spring MVC</option>
							<option value="EJB">EJB</option>
						  </select>
			</p>
			<p></p>
			<p>Student's Address: 
				&nbsp;&nbsp;Country: <input type="text" name="address.country">
				&nbsp;&nbsp;City: <input type="text" name="address.city">
				&nbsp;&nbsp;Street: <input type="text" name="address.street">
				&nbsp;&nbsp;Postal Code: <input type="text" name="address.postalCode">
			</p>

		    <input type="submit" value="Submit">
		</form>
	</body>
</html>