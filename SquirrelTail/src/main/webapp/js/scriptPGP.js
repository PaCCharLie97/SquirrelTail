function initMap(bares) {

	if (typeof google != "undefined") {

		var map = new google.maps.Map(document.getElementById('map'), {
			zoom : 17,
			center : {
				lat : 40.4630446,
				lng : -3.6767929
			}
		});

		if (bares)
			for (let index = 0; index < bares.length; index++) {
				//
				let bar = bares[index];

				let barmarker = new google.maps.Marker(
						{
							position : {
								lat : bar.latitud,
								lng : bar.longitud
							},
							map : map,
							icon : './images/cerveza.png',
							info : new google.maps.InfoWindow(
									{
										content : `<div class="bar"><h5>${bar.nombre}</h5></div><div class="texto"><h6>${bar.descripcion}<a href="./BarEjemplo" class="info"> mas info</a> </h6></div>`
									}),
						});

				google.maps.event.addListener(barmarker, 'click', function() {
					barmarker.info.open(map, barmarker);
				});

				map.panTo(barmarker.getPosition());
			}
	}

}
