<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Project</title>
</head>
<body>
	<h2>Student Enquiry Form</h2>
	<p>
		<font color='green'>${msg}</font>
	</p>
	<form:form action="save" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
						path="gender" value="F" />Female</td>
			</tr>
			<tr>
				<td>Course:</td>
				<td><form:select path="course">
						<form:option value="">-Select-</form:option><
             <form:options items="${courses}" />

					</form:select></td>
			</tr>
			<tr>
				<td>Timings:</td>
				<td><form:checkboxes items="${prefTimings}" path="timings" />
				</td>
			</tr>
			<tr>

				<td><input type="submit" value="Save" /></td>
			</tr>

		</table>
	</form:form>

</body>
</html>