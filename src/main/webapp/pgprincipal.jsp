<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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


	<ul>
		<c:forEach var="unBar" items="${lista_bares}">
			<li>
			${unBar.nombre}|${unBar.latitud}|${unBar.longitud}|${unBar.descripcion}|${unBar.enlace}
			<a href="./barejemplo?bid=${unBar.bid}">Bar</a>
			<a href="./barejemplo1?bid=${unBar.bid}">Bar</a>
			<a href="./barejemplo2?bid=${unBar.bid}">Bar</a>
			<a href="./barejemplo3?bid=${unBar.bid}">Bar</a>
			<a href="./barejemplo4?bid=${unBar.bid}">Bar</a>
			</li>
		</c:forEach>
	</ul>
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
			{
				"nombre" : "Bar el Alamo",
				"latitud" : 40.4619445,
				"longitud" : -3.6741318,
				"descripcion" : "<h6>Chupitos Gratis de 00:00 a 00:30 los martes.</h6>",
				"enlace" : "./barejemplo.html"
			},
			{
				"nombre" : "Bar el Fresxo",
				"latitud" : 40.4634891,
				"longitud" : -3.6752189,
				"descripcion" : "<h6>Con el Fresco ven al Fresxo y tienes un 3x2 en Birra.</h6>",
				"enlace" : "./barejemplo.1.html"
			},
			{
				"nombre" : "Cerveceria Blanco y Azul",
				"latitud" : 40.4637448,
				"longitud" : -3.6764269,
				"descripcion" : "<h6>Si vienes de blanco y azul, únicamente, chupito gratis.</h6>",
				"enlace" : "./barejemplo.2.html"
			},
			{
				"nombre" : "Taberna la Cocodrila",
				"latitud" : 40.462959,
				"longitud" : -3.6780409,
				"descripcion" : "<h6>Todos los miercoles cerveza artesana nueva.</h6>",
				"enlace" : "./barejemplo.3.html"
			},
			{
				"nombre" : "Bar Pop Copas y tapas",
				"latitud" : 40.461812,
				"longitud" : -3.6767821,
				"descripcion" : "<h6>Ven 5 dias en tres semanas y te regalamos la tapa del mes con tu birra.</h6>",
				"enlace" : "./barejemplo.4.html"
			} ];


	window.onload=function(){
		initMap(bares);
	}
</script>

</html>