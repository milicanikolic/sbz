app.factory('pocetnaS',['$http', function($http,$scope){
	var k={};
	k.posaljiPacijenta=function(pacijent){
		//console.log(pacijent)
		return $http.put("/SBZ/rest/controller/fireRulesPatient", pacijent);
	}
	
	k.posaljiKks=function(kks){
		var n= $http.post("/SBZ/rest/controller/fireRulesKKS", kks);
		console.log(n);
		return n;
		
	}
	
	k.posaljiJetra=function(jetra){
		return $http.put("/SBZ/rest/controller/fireRulesLiver",jetra);
		console.log(jetra);
	}
	
	k.dodatneAnemija1=function(dodatno1){
		return $http.post("/SBZ/rest/controller/fireRulesAnemija1",dodatno1);
	}
	
	k.dodatneAnemija2=function(dodatno2){
		return $http.post("/SBZ/rest/controller/fireRulesAnemija2",dodatno2);
	}
	
	k.posaljiStitnu=function(stitna){
		console.log(stitna);
		return $http.post("/SBZ/rest/controller/fireRulesStitnaZlezda",stitna);
	}
	
	k.posaljiEnzime=function(enzimi){
		return $http.post("/SBZ/rest/controller/fireRulesEnzimiKrvi",enzimi);
	}
	
	k.prikaziBolesti=function(){
		return $http.get("/SBZ/rest/controller/uzmiBolesti");
	}
	
	k.posaljiMejl=function(adresa){
		return $http.post("/SBZ/rest/controller/posaljiMejl", adresa);
	}
	
	
		 k.popuniMegaloblastna=function() {
		  return $http.get("fajlovi/megaloblastna_dodatno.json")
		 }
		 
		
	
	
	k.popuni=function(izabrano){
		  console.log('servisss ' + izabrano);
		  if(izabrano=="anemija"){
		   return $http.get("fajlovi/anemija.json")
		  }
		  if(izabrano=="bakterije"){
		   return $http.get("fajlovi/bakterije.json")
		  }
		  if(izabrano=="virusi"){
		   return $http.get("fajlovi/virusi.json")
		  }
		  if(izabrano=="alergije"){
		   return $http.get("fajlovi/alergije.json")
		  }
		  if(izabrano=="leukemija"){
		   return $http.get("fajlovi/leukemija.json")
		  }
		  if(izabrano=="pancitopenija"){
		   return $http.get("fajlovi/pancitopenija.json")
		  }
		  if(izabrano=="bubrezi"){
		   return $http.get("fajlovi/bubrezi.json")
		  }
		  if(izabrano=="sidero"){
		   return $http.get("fajlovi/sidero.json")
		  }
		  if(izabrano=="megaloblastna"){
		   return $http.get("fajlovi/megaloblastna.json")
		  }
		  if(izabrano=="jetra"){
		   return $http.get("fajlovi/jetra.json")
		  }
		  if(izabrano=="zuc"){
		   return $http.get("fajlovi/zuc.json")
		  }
		  if(izabrano=="bolest1"){
			   return $http.get("fajlovi/bolest1.json")
			  }
		  
		  if(izabrano=="sideroblastna"){
			  return $http.get("fajlovi/sideroblastna_dodatno.json")
			   }
		   if(izabrano=="sideropenijska"){
			   return $http.get("fajlovi/sideropenijska_dodatno.json")
			   }
		   
		  
		  if(izabrano=="adenohipofiza"){
			   return $http.get("fajlovi/adenohipofiza.json")
			  }
			  if(izabrano=="hipertireoza"){
			   return $http.get("fajlovi/hipertireoza.json")
			  }
		  if(izabrano=="pankreatitis"){
			   return $http.get("fajlovi/pankreatitis.json")
			  }
			  if(izabrano=="infarkt"){
			   return $http.get("fajlovi/infarkt.json")
			  }
		 }
	
	
	
	return k;
}])