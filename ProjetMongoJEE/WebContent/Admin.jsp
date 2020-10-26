<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="Beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="static/mystyle.css" />
<!-- <link rel="stylesheet" href="static/css/bootstrap-grid.min.css" /> -->
</head>
<body>

<%
Admin admin=(Admin)session.getAttribute("connectedAdmin");
%>

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


   <div style="background-color: darkgray; width: 92%;margin-left: 60px; border-radius: 40px;" >
      <p style="text-align: center; font-size: 30px;">Ajouter</p>
  </div>
  <div class="shapebook1" style="margin-left: 160px;">
      <div>
          <p style="text-align: center; color: royalblue;">
              Ajouter Continent
          </p>
          <form action="ServletAdmin" method="get">
            <SELECT name="Continent">
               <OPTION VALUE="Africa" selected>Africa</OPTION>
               <OPTION VALUE="America">America</OPTION>
               <OPTION VALUE="Asia">Asia</OPTION>
               <OPTION VALUE="Europe">Europe</OPTION>
               <OPTION VALUE="Oceania">Oceania</OPTION>
               <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
            </SELECT>
              <input type="text" name="nbrCasInfectes" placeholder="nbrCasInfectes" pattern="[0-9]" ><br>
              <input type="text" name="nbrCasGueries" placeholder="nbrCasGueries" pattern="[0-9]" ><br>
              <input type="text" name="tauxMortalite" placeholder="tauxMortalite" pattern="[0-9]" ><br>
            <input type="text" name="Date" placeholder="AAAA-MM-JJ">
            <SELECT name="Country">
               <OPTION VALUE="Maroc" selected>Marroc</OPTION>
               <OPTION VALUE="Alamend">Almend</OPTION>
        
       		   <OPTION VALUE="China">Chane</OPTION>
               <OPTION VALUE="USA">USA</OPTION>
           	   <OPTION VALUE="Oceania">Oceania</OPTION>
         </SELECT>
            <input type="text" name="Confirmed" placeholder="Confirmed" >
            <input type="text" name="Recovered" placeholder="Recovered" >
            <input type="text" name="Deaths" placeholder="Deaths" >
            <input type="submit" name="send" value="send"><br>
          </form>
      </div>
      <div style="margin-left: 150px;">
          <p style="text-align: center; color: royalblue;">
                  Ajouter Pays
          </p>
          <form action="ServletContinent" method="post">
            <input type="text" name="DateP" placeholder="AAAA-MM-JJ">
            <SELECT name="ContinentP">
               <OPTION VALUE="Africa" selected>Africa</OPTION>
               <OPTION VALUE="America">America</OPTION>
               <OPTION VALUE="Asia">Asia</OPTION>
               <OPTION VALUE="Europe">Europe</OPTION>
               <OPTION VALUE="Oceania">Oceania</OPTION>
               <OPTION VALUE="Oceania">Australia</OPTION>
               <OPTION VALUE="Oceania">Antarctica</OPTION>
            </SELECT>
            <SELECT name="CountryP">
               <OPTION VALUE="Maroc" selected>Marroc</OPTION>
               <OPTION VALUE="Alamend">Almend</OPTION>
               <OPTION VALUE="China">Chane</OPTION>
               <OPTION VALUE="USA">USA</OPTION>
            <OPTION VALUE="Oceania">Oceania</OPTION>
         </SELECT>
            <input type="text" name="ConfirmedP" placeholder="Confirmed">
            <input type="text" name="RecoveredP" placeholder="Recovered">
            <input type="text" name="DeathsP" placeholder="Deaths">


              <input type="submit" name="send" value="send"><br>
          </form>
      </div>

  </div>

 







 
 <div style="background-color: darkgray; width: 92%;margin-left: 60px; border-radius: 40px;" >
    <p style="text-align: center; font-size: 30px;">Modifier</p>
 </div>
   <div class="shapebook1" style="margin-left: 160px;">
    <div>
        <p style="text-align: center; color: royalblue;">
            Ajouter Admin        </p>
        <form action="ServletAdm" method="post">
            <input type="text" name="nomA"placeholder="First_Name" ><br>
            <input type="text" name="prenom" placeholder="Last_name"><br>
            <input type="text" name="nombre" placeholder="Phone" pattern="[0-9]{10}"><br>
            <input type="text" name="email" placeholder="Email"><br>
            <input type="password" name="password" placeholder="Password"><br>
            <input type="submit" name="send" value="send"><br>
 
        </form>
 
        </form>
    </div>
    <div style="margin-left: 300px;">
         <p style="text-align: center; color: royalblue;">  Supprimer  Pays </p>
        
        <form action="ServletAdmin" method="post">
         <SELECT name="Continent">
             <OPTION VALUE="Africa" selected>Africa</OPTION>
             <OPTION VALUE="America">America</OPTION>
             <OPTION VALUE="Asia">Asia</OPTION>
             <OPTION VALUE="Europe">Europe</OPTION>
             <OPTION VALUE="Oceania">Oceania</OPTION>
             <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
          </SELECT><br>
          <SELECT name="Country">
            <OPTION VALUE="Maroc" selected>Marroc</OPTION>
            <OPTION VALUE="Alamend">Almend</OPTION>
            <OPTION VALUE="China">Chane</OPTION>
            <OPTION VALUE="USA">USA</OPTION>
         <OPTION VALUE="Oceania">Oceania</OPTION>
      </SELECT><br>
            <input type="submit" name="send" value="send"><br>
        </form>
    </div>
 </div>
 








  <div style="background-color: darkgray; width: 92%;margin-left: 60px; border-radius: 40px;" >
   <p style="text-align: center; font-size: 30px;">Modifier</p>
</div>
  <div class="shapebook1" style="margin-left: 160px;">
   <div>
       <p style="text-align: center; color: royalblue;">
           Modifier CasInfectes dans Continent
       </p>
       <form action="ServletAdm" method="get">
         <SELECT name="ContinentCI">
            <OPTION VALUE="Africa" selected>Africa</OPTION>
            <OPTION VALUE="America">America</OPTION>
            <OPTION VALUE="Asia">Asia</OPTION>
            <OPTION VALUE="Europe">Europe</OPTION>
            <OPTION VALUE="Oceania">Oceania</OPTION>
            <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
         </SELECT>
           <input type="text" name="nbrCasInfectesCI" placeholder="nbrCasInfectes"><br>
           <input type="submit" name="send1" value="send"><br>

       </form>
   </div>
   <div style="margin-left: 150px;">
       <p style="text-align: center; color: royalblue;">
         Modifier CasGueries dans Continent
       </p>
       <form action="ServletAdmi" method="get">
         <SELECT name="ContinentCG">
            <OPTION VALUE="Africa" selected>Africa</OPModifierTION>
            <OPTION VALUE="America">America</OPTION>
            <OPTION VALUE="Asia">Asia</OPTION>
            <OPTION VALUE="Europe">Europe</OPTION>
            <OPTION VALUE="Oceania">Oceania</OPTION>
            <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
         </SELECT>
           <input type="text" name="nbrCasGueriesCG" placeholder="nbrCasGueries"><br>
           <input type="submit" name="send2" value="send"><br>
       </form>
   </div>
</div>




<div style="background-color: darkgray; width: 92%;margin-left: 60px; border-radius: 40px;" >
   <p style="text-align: center; font-size: 30px;">Modifier</p>
</div>
<div class="shapebook1" style="margin-left: 160px;">
  <div >
       <p style="text-align: center; color: royalblue;">
           Modifier Pays
       </p>
       <form action="ServletAdmin" method="get">
        <SELECT name="Continent">
            <OPTION VALUE="Africa" selected>Les Continents</OPTION>
            <OPTION VALUE="Africa">Africa</OPTION>
            <OPTION VALUE="America">America</OPTION>
            <OPTION VALUE="Asia">Asia</OPTION>
            <OPTION VALUE="Europe">Europe</OPTION>
            <OPTION VALUE="Oceania">Oceania</OPTION>
            <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
        </SELECT><br>

        <SELECT name="Country">
            <OPTION VALUE="Maroc" selected>Marroc</OPTION>style="padding-top: 160px;
            <OPTION VALUE="Alamend">Almend</OPTION>
            <OPTION VALUE="China">Chane</OPTION>
            <OPTION VALUE="USA">USA</OPTION>
         <OPTION VALUE="Oceania">Oceania</OPTION>
       </SELECT><br>


       <input type="text" name="Confirmed" placeholder="Confirmed"><br>
        <input type="text" name="Recovered" placeholder="Recovered"><br>
        <input type="text" name="Deaths" placeholder="Deaths"><br>
        <input type="text" name="DatePays" placeholder="AAAA-MM-JJ"><br>
        <input type="submit" name="send" value="send"><br>

       </form>
   </div>
   <div style="margin-left: 300px;">
       <p style="text-align: center; color: royalblue;">
                Modifier tauxMortalite dans Continent
       </p>
       <form action="ServletAdmi" method="post">
        <SELECT name="ContinentTM">
            <OPTION VALUE="Africa" selected>Africa</OPTION>
            <OPTION VALUE="America">America</OPTION>
            <OPTION VALUE="Asia">Asia</OPTION>
            <OPTION VALUE="Europe">Europe</OPTION>
            <OPTION VALUE="Oceania">Oceania</OPTION>
            <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
         </SELECT>
           <input type="text" name="tauxMortaliteTM" placeholder="tauxMortalite"><br>
           <input type="submit" name="send3" value="send"><br>
       </form>
   </div>
</div>


<div style="background-color: darkgray; width: 92%;margin-left: 60px; border-radius: 40px;" >
    <p style="text-align: center; font-size: 30px;">Modifier</p>
 </div>
   <div class="shapebook1" style="margin-left: 160px;">
    <div>
        <p style="text-align: center; color: royalblue;">
             Supprimer Continent
        </p>
        <form action="ServletPays" method="post">
            <SELECT name="ContinentSC">
                <OPTION VALUE="Africa" selected>Les Continents</OPTION>
                <OPTION VALUE="Africa">Africa</OPTION>
                <OPTION VALUE="America">America</OPTION>
                <OPTION VALUE="Asia">Asia</OPTION>
                <OPTION VALUE="Europe">Europe</OPTION>
                <OPTION VALUE="Oceania">Oceania</OPTION>
                <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
             </SELECT>
            <input type="submit" name="send" value="send"><br>
        </form>
    </div>
    <div style="margin-left: 250px;">
        <p style="text-align: center; color: royalblue;">
                 Supprimer  Pays(Selon la date)
        </p>
        <form action="ServletAdmin" method="post">
         <SELECT name="Continent">
             <OPTION VALUE="Africa" selected>Africa</OPTION>
             <OPTION VALUE="America">America</OPTION>
             <OPTION VALUE="Asia">Asia</OPTION>
             <OPTION VALUE="Europe">Europe</OPTION>
             <OPTION VALUE="Oceania">Oceania</OPTION>
          </SELECT>
          <SELECT name="Country">
            <OPTION VALUE="Maroc" selected>Marroc</OPTION>style="padding-top: 160px;
            <OPTION VALUE="Alamend">Almend</OPTION>
            <OPTION VALUE="China">Chane</OPTION>
            <OPTION VALUE="USA">USA</OPTION>
         <OPTION VALUE="Oceania">Oceania</OPTION>
         <OPTION VALUE="Australia">Australia</OPTION>
               <OPTION VALUE="Antarctica">Antarctica</OPTION>
      </SELECT>
            <input type="text" name="DatePays" placeholder="AAAA-MM-JJ"><br>
            <input type="submit" name="send" value="send"><br>
        </form>
    </div>
 </div>













 <footer>
    <div class="foter">
      <p style="color: white; padding-top: 0.3cm;">User: ${admin.lastName} ${admin.firstName}</p>
      <p style="color: white;">Email: ${!empty admin.email?admin.email: "example@ETU.AR"}</p>
      <p style="color: white;">Deconnection: <a href="/ProjetMongoJEE/Deconnexion" style="color:aqua">Deconnecxion</a></p>
    </div>
</footer>

</body>
</html>












