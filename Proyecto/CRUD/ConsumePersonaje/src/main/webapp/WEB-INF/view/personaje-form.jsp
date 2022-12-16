<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Guardar Personaje</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
		  
</head>

<body class="container mx-auto p-5">
	
	<div id="wrapper" class="mx-auto">
		<div id="header" class="mx-auto">
			<h2 class="text-center">Ingreso de datos de personaje</h2>
		</div>
	</div>

	<div id="container mx-auto"><br/>
		<h3 class="text-center">Guardar personaje</h3><br/>
	
		<form:form action="savePersonaje" modelAttribute="personaje" method="POST" class="mx-auto">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
					
			<table class="mx-auto">
				<tbody class="mx-auto">
					<tr class="mx-auto">
						<td><label>Nombre:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
				
					<tr>
						<td><label>Apellido:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td><label>Nacionalidad:</label></td>
						<td><form:input path="nationality" /></td>
					</tr>
					
					<tr>
						<td><label>Ocupacion:</label></td>
						<td><form:input path="occupation" /></td>
					</tr>
					
					<tr>
						<td><label>Rol:</label></td>
						<td><form:input path="role" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Agregar a la lista" class="save btn btn-warning text-center btn-lg btn-block" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/personaje/list" class="btn btn-secondary">Regresar a la lista</a>
		</p>
	
	</div>
<p>
  <button class="btn btn-outline-success" type="button" data-toggle="collapse" data-target="#collapseWidthExample" aria-expanded="false" aria-controls="collapseWidthExample">
    ¿Deseas conocer más datos de otros personajes?
  </button>
</p>
<div style="min-height: 120px;">
  <div class="collapse width" id="collapseWidthExample">
    <div class="card card-body" style="width: 320px;">
      Visita el sitio oficial de OVERWATCH para conocer más
      <a href="https://overwatch.blizzard.com/es-es/heroes/">Sitio oficial</a>
						
      
    </div>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

</body>

</html>










