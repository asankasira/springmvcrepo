<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Submit</title>
	</head>
	<body>
		<h2>${headerMessage}</h2>
		<h3>Student Registration</h3>
		<p>Student Name: ${student.firstname}  ${student.lastname}</p>
		<p>Student Hobby: ${student.studentHobby}</p>
		<p>Student Mobile: ${student.studentMobile}</p>
		<p>DOB: ${student.dateOfBirth}</p>
		<p>Skills: ${student.studentSkills} </p>
		<p>Address: 
			    <br/>&nbsp;&nbsp;Country: ${student.address.country}
				<br/>&nbsp;&nbsp;City: ${student.address.city}
				<br/>&nbsp;&nbsp;Street: ${student.address.street}
				<br/>&nbsp;&nbsp;Postal Code: ${student.address.postalCode}
		</p>
	</body>
</html>