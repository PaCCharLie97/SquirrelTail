<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link rel="stylesheet" href="./css/General.css">
<link rel="stylesheet" href="./css/styleBE1.css">
</head>
<body>
<jsp:include page="header.jsp"/>

	<section>
		<div class="pergamino">
			<h1>
<<<<<<< HEAD:src/main/webapp/barejemplo.jsp
				<span class="orange">${unBar.nombre}</span> <span class="yellow">Fresxo</span>
			</h1>
		</div>

		<article>${unBar.direccion} ${unBar.telefono}</article>
=======
				<span class="orange">${unBar.nombre}</span> 
			</h1>
		</div>

		<article>${unBar.direccion} | ${unBar.telefono}</article>

>>>>>>> d85b73cd487ce35f6fbc2774b0742feb435b4a71:src/main/webapp/barejemplo.jsp


		<div>${unBar.descripcion}</div>

		<h2>Cervezas:</h2>

		<div class="cerves">

			<div>
				<img src="./images/cerveza-corona-extra-2_grande.png" alt="">
			</div>

			<div>
				<img src="./images/cerveza-patagonia-amber-lager-2_grande.png"
					alt="">
			</div>

		</div>

	</section>
<<<<<<< HEAD:src/main/webapp/barejemplo.jsp
<jsp:include page="footer.jsp"/>
=======
	

>>>>>>> d85b73cd487ce35f6fbc2774b0742feb435b4a71:src/main/webapp/barejemplo.jsp
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
<!-- <script src="./js/jquery.js"></script> -->
<script src="./js/jquery-3.3.1.min.js"></script>
<script src="./js/jquery.dataTables.min.js"></script>
<script src="./js/buscador.js"></script>
</html>