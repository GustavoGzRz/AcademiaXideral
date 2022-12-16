<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Lista Personajes</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
		  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
		  

</head>




<body class="container mx-auto p-3">
<img src="https://www.freepnglogos.com/uploads/overwatch-logo-text-png-24.png" class="img-fluid mx-auto pl-5" alt="banner">
	<div id="wrapper" >
		<div id="header" class="container mx-auto">
			<h2 class="text-center mx-auto">Lista de personajes de Overwatch 2</h2>

		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			
		
			<!--  add our html table here -->
		
			<table class="mx-auto">
				<tr>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Nacionalidad</th>
					<th>Ocupacion</th>
					<th>Rol</th>
					<th>Accion</th>
				</tr>
				
				<!-- loop over and print our Personajes -->
				<c:forEach var="tempPersonaje" items="${personajes}">
				
					<!-- construct an "update" link with personaje id -->
					<c:url var="updateLink" value="/personaje/showFormForUpdate">
						<c:param name="personajeId" value="${tempPersonaje.id}" />
					</c:url>					

					<!-- construct an "delete" link with personaje id -->
					<c:url var="deleteLink" value="/personaje/delete">
						<c:param name="personajeId" value="${tempPersonaje.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempPersonaje.firstName} </td>
						<td> ${tempPersonaje.lastName} </td>
						<td> ${tempPersonaje.nationality} </td>
						<td> ${tempPersonaje.occupation} </td>
						<td> ${tempPersonaje.role} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}" class="btn btn-outline-info btn-sm m-1">Actualizar datos</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('¿Seguro de eliminar a este personaje?'))) return false" class="btn btn-outline-danger btn-sm m-1">Eliminar</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
			
			
				
		</div>
		
		<!-- put new button: Agregar Personaje -->
		<br/>
		<div class="mx-auto">
			<input type="button" value="Agregar nuevo "
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button btn btn-warning text-center btn-lg btn-block"
			/>
	</div>
	</div>
	
	
  </div>
</div>
	
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</body>

</html>









