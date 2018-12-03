<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">


<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<link rel="stylesheet" href="./css/stylePGP.css">
</head>

<body>



	<div id="map"></div>



</body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<script src="./js/jquery-3.3.1.min.js"></script>
<script src="./js/jquery.dataTables.min.js"></script>
<script src="./js/buscador.js"></script>
<script
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB3weqlU2yAiBF_s5_A8yYSZl6-Jai6mFY&callback=initMap"
	async defer></script>
<script src="./js/scriptPGP.js"></script>


<script>
	let bares = [
		<c:forEach var="unBar" items="${lista_bares}">
		{
		"nombre" : "${unBar.nombre}",
		"direccion" :"${unBar.direccion}",
		"telefono" : "${unBar.telefono}",
		"latitud" : ${unBar.latitud} ,
		"longitud" : ${unBar.longitud},
		"descripcion" : "${unBar.descripcion}",
		},		
		</c:forEach>
 	];


	window.onload=function(){
		initMap(bares);
	}
</script>

</html>