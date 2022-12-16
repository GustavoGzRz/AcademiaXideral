<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Personaje</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/css/add-customer-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Personaje Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Personaje</h3>
	
		<form:form action="savePersonaje" modelAttribute="personaje" method="POST">

			<!-- need to associate this data with Personaje id -->
			<form:hidden path="id" />
					
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
				
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td><label>Nationality:</label></td>
						<td><form:input path="nationality" /></td>
					</tr>
					
					<tr>
						<td><label>Occupation:</label></td>
						<td><form:input path="occupation" /></td>
					</tr>
					<tr>
						<td><label>Role:</label></td>
						<td><form:input path="role" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/mvc/personajes">Back to List</a>
		</p>
	
	</div>

</body>

</html>










