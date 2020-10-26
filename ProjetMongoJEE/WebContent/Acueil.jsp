<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>COVID19</title>
<link rel="stylesheet" href='static/styles.css' type="text/css" />
</head>

<body>
	<img src="static/images/cornona_image_mongo.jpg" alt="" id="slide"
		style="width: 100%; height: 550px; border-radius: 10px; background-position: center center; background-size: cover; position: static;" />

	<script>
		var imgs = [ "static/images/conro_image_mobgo.jpg",
				"static/images/cornona_image_mongo.jpg",
				"static/images/corona_mongo.jpg",
				"static/images/stati_covid_mongo.png",
				"static/images/sat_coron_mongo.jpg",
				"static/images/Corona-Promo-Image-1024x576.jpg" ]
		var k = 0
		function slides() {
			document.getElementById("slide").src = imgs[k];
			k++;
			if (k > 5)
				k = 0
		}
		setInterval(slides, 2000)
	</script>




	<ul>
		<li><a
			href="/ProjetMongoJEE/ServletContinent?nomContinent=Africa">Afrique
		</a>
			<ul>
				<li><a
					href="/ProjetMongoJEE/ServletPays?nomContinent=Africa&nomPays=Algeria">
						Algeria</a></li>
				<li><a
					href="/ProjetMongoJEE/ServletPays?nomContinent=Africa&nomPays=Angola">
						Angola </a></li>
				<li><a
					href="/ProjetMongoJEE/ServletPays?nomContinent=Africa&nomPays=Morocco">
						Morocco</a></li>
			</ul></li>

		<li><a href="/ProjetMongoJEE/ServletContinent?nomContinent=Asia">Asia
		</a>
			<ul>
				<li><a href="/ProjetMongoJEE/ServletPays?nomContinent=Asia&nomPays=China"> China</a></li>
				<li><a href=""> chine</a></li>
				<li><a href=""> chine</a></li>

			</ul></li>

		<li><a
			href="/ProjetMongoJEE/ServletContinent?nomContinent=America">America
		</a>
			<ul>
				<li><a href="ProjetMongoJEE/ServletContinent?nomContinent=America?nomPays=Canada"> Canada</a></li>
				<li><a href=""> Canada</a></li>
				<li><a href=""> Canada</a></li>

			</ul></li>

		<li><a
			href="/ProjetMongoJEE/ServletContinent?nomContinent=Europe">
				Europe </a>
			<ul>
				<li><a href="/ProjetMongoJEE/ServletContinent?nomContinent=Europe?nomPays=Italy"> Italy </a></li>
				<li><a href=""> Italy </a></li>
				<li><a href=""> Italy </a></li>


			</ul></li>

		<li><a
			href="/ProjetMongoJEE/ServletContinent?nomContinent=Oceania">
				Oceania </a>
			<ul>
				


				<li><a href="">Palau</a></li>
				<li><a href="Papua New Guinea">Papua New Guinea</a></li>

				<li><a href="Samoa">Samoa</a></li>

			</ul></li>

		<li><a
			href="/ProjetMongoJEE/ServletContinent?nomContinent=Antarctica">
				Antarctica </a>
			<ul>
				<li><a href=""> Australia</a></li>
			</ul></li>

	</ul>


	<h1 style="color: red; padding-top: 4.5cm;">Corona Virus</h1>

	<p>Covid-19 fait référence à « Coronavirus Disease 2019 », la
		maladie provoquée par un virus de la famille des Coronaviridae, le
		SARS-CoV-2. Cette maladie infectieuse est une zoonose, dont l'origine
		est encore débattue, qui a émergé en décembre 2019 dans la ville de
		Wuhan, dans la province du Hubei en Chine. Elle s'est rapidement
		propagée, d'abord dans toute la Chine, puis à l'étranger provoquant
		une épidémie mondiale. Le Covid-19 est une maladie respiratoire
		pouvant être mortelle chez les patients fragilisés par l'âge ou une
		autre maladie chronique. Elle se transmet par contact rapproché avec
		des personnes infectées. La maladie pourrait aussi être transmise par
		des patients asymptomatiques mais les données scientifiques manquent
		pour en attester avec certitude.</p>

	<h1 style="color: red;">Histoire et étymologie du coronavirus</h1>
	<p>CORONA + VIRUS , plus tard pris comme New Latin REMARQUE: Le mot
		a été introduit par un groupe de virologues comme un court article
		"Coronavirus" dans la section "News and Views" de Nature (vol. 220,
		no. 5168, 16 novembre 1968, p. 650): "… le virus de la bronchite
		infectieuse aviaire a une apparence microscopique électronique
		semblable à celle des myxovirus, mais distincte de celle des
		myxovirus. Les particules ont un profil plus ou moins arrondi ... il y
		a aussi une «frange» caractéristique de projections de 200 Å de long,
		qui sont arrondies ou en forme de pétale, plutôt que tranchantes ou
		pointues, comme dans les myxovirus. Cette apparence, rappelant la
		couronne solaire, est partagée par le virus de l'hépatite de souris….
		de l'avis des huit virologues, ces virus font partie d'un groupe
		jusque-là non reconnu, qu'ils proposent d'appeler les coronavirus,
		pour rappeler l'aspect caractéristique par lequel ces virus sont
		identifiés au microscope électronique. "</p>

	<h1 style="color: red;">Les personnes les plus à risque</h1>
	<p>Les personnes les plus à risque sont les personnes âgées et
		présentant d'autres problèmes de santé comme l'hypertension
		artérielle, des problèmes cardiaques et du diabète. Le taux de
		mortalité augmente avec l'âge : il est de 0,2 % pour les personnes les
		plus jeunes (de 10 à 39 ans), mais atteint 14,8 % pour les personnes
		âgées de 80 ans et plus. Le taux de mortalité moyen est évalué entre 1
		et 3 %.</p>
	<footer style="padding-top: 30px;">
		<div class="foter">
			<p style="color: white;">Posted by: Equipe_projet_Nosql</p>
			<p style="color: white;">Copyright © 2020</p>
			<p style="color: white;">
				Contact information: <a href="" style="color: aqua">Equipe_Info_HA</a>
			</p>
			<p style="color: black;">Authentification_Admin:</p>
			<form action="ServletAdmin" method="post">

				<input type="email" placeholder="Email" name="email"> <input
					type="password" placeholder="Password" name="password"> <input
					type="submit" value="send">

			</form>

		</div>
	</footer>
</body>
</html>
