<!DOCTYPE html>
<html>

<head>
	<title>Actualizar informacion</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Sistema Escolar Secundaria "Laredo"</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Actualizar informacion de estudiante</h3>
		
		<form action="StudentControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="studentId" value="${THE_STUDENT.id}" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><input type="text" name="firstName" 
								   value="${THE_STUDENT.firstName}" /></td>
					</tr>

					<tr>
						<td><label>Apellido:</label></td>
						<td><input type="text" name="lastName" 
								   value="${THE_STUDENT.lastName}" /></td>
					</tr>

					<tr>
						<td><label>Correo:</label></td>
						<td><input type="text" name="email" 
								   value="${THE_STUDENT.email}" /></td>
					</tr>
					
					<tr>
						<td><label>Matricula:</label></td>
						<td><input type="text" name="credential" 
								   value="${THE_STUDENT.credential}" /></td>
					</tr>
					
					<tr>
						<td><label>Estado:</label></td>
						<td><input type="number" name="status" 
								   value="${THE_STUDENT.status}" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Confirmar" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="StudentControllerServlet">Regresar a la lista</a>
		</p>
	</div>
</body>

</html>











