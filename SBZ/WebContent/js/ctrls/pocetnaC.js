app.controller('pocetnaC', function ($scope,$rootScope,$window, $http, pocetnaS) {
	
	$scope.pacijentDalje=function(){
		pocetnaS.posaljiPacijenta($scope.pacijent)
		.then(function(data){
			console.log("poslao pacijenta");
			$window.location.href = '#/izbor';
		})
	}
	
	
	$scope.kksFunc=function(){
		pocetnaS.posaljiKks($scope.kks)
		.success(function(data){
			$scope.prikaziDalje(data);
		})
	}
	$scope.jetraFunc=function(){
		console.log($scope.jetra);
		pocetnaS.posaljiJetra($scope.jetra)
		.then(function(data){
			$scope.prikaziBolesti();
		})
	}
	
	$scope.stitnaFunc=function(){
		pocetnaS.posaljiStitnu($scope.stitnaZlezda)
		.then(function(data){
			$scope.prikaziBolesti();
		})
	}
	$scope.posaljiEnzime=function(){
		pocetnaS.posaljiEnzime($scope.enzimi)
		.then(function(data){
			$scope.prikaziBolesti();
		})
	}
	
	
		 $scope.popuniMegaloblastna=function() {
		   pocetnaS.popuniMegaloblastna()
		    .success(function(data){
		     $scope.anemija2=data.megaloblastna_dodatno;
		    })
		 }
		 
	
	
	$scope.prikaziDalje=function(data){
		console.log(data);
		
		//var tekst=JSON.parse(data);
		
		//console.log(tekst);
		if(data!=null){
			
		var podeljeno=data.split(":");
		if(podeljeno[0]=="Dodatna"){
			if(podeljeno[1]=="SIDERO"){
				$window.location.href = '#/dodatna1';
			}else if(podeljeno[1]=="MEGALOBLASTNA"){
				$window.location.href = '#/dodatna2';
			}
			else if(podeljeno[1]==""){
				$scope.prikaziBolesti();
			}
		}
		}else{
			console.log("nije vece od nula");
			$scope.prikaziBolesti();
		}
	}
	
	
	$scope.dodatneAnemija1=function(){
		pocetnaS.dodatneAnemija1($scope.anemija1)
		.then(function(data){
			$scope.prikaziBolesti();
		})
	}
	
	$scope.dodatneAnemija2=function(){
		pocetnaS.dodatneAnemija2($scope.anemija2)
		.then(function(data){
			$scope.prikaziBolesti();
		})
	}
	
	$scope.prikaziBolesti=function(){
		
			
			$window.location.href = '#/krajnjiIspis';
		
	};
	
	$scope.posaljiMejl=function(){
		pocetnaS.posaljiMejl($scope.adresa)
		.then(function(data){
			$scope.sakrij=false;
			   $("#success-alert").fadeTo(2000, 500).slideUp(500, function(){
			             $("#success-alert").slideUp(500);
			              });
		})
	}
	
	$scope.uzmiBolesti=function(){
		$scope.sakrij=true;
		pocetnaS.prikaziBolesti()
		.then(function(data){
			console.log(data.data);
			$scope.bolesti=data.data
		})
	}
	
	
	$scope.popuni=function(){
		  var izabrano=$scope.test;
		  console.log('Kontrolerrr ' + izabrano)
		  pocetnaS.popuni(izabrano)
		  .success(function(data){
		   
		   if(izabrano=="anemija"){
		    $scope.kks=data.anemija;
		   }
		   if(izabrano=="bakterije"){
		    $scope.kks=data.bakterije;
		   }
		   if(izabrano=="virusi"){
		    $scope.kks=data.virusi;
		   }
		   if(izabrano=="alergije"){
		    $scope.kks=data.alergije;
		   }
		   if(izabrano=="leukemija"){
		    $scope.kks=data.leukemija;
		   }
		   if(izabrano=="pancitopenija"){
		    $scope.kks=data.pancitopenija;
		   }
		   if(izabrano=="bubrezi"){
		    $scope.kks=data.bubrezi;
		   }
		
		   if(izabrano=="sidero"){
		    $scope.kks=data.sidero;
		   }
		   if(izabrano=="megaloblastna"){
		    $scope.kks=data.megaloblastna;
		   }
		   
		   if(izabrano=="sideroblastna"){
			    $scope.anemija1=data.sideroblastna_dodatno;
			   }
		   if(izabrano=="sideropenijska"){
			    $scope.anemija1=data.sideropenijska_dodatno;
			   }
		   if(izabrano=="bolest1"){
			    $scope.kks=data.bolest1;
			   }
		   
		   
		   if(izabrano=="jetra"){
		    $scope.jetra=data.jetra;
		   }
		   if(izabrano=="zuc"){
		    $scope.jetra=data.zuc;
		   }
		   if(izabrano=="adenohipofiza"){
			    $scope.stitnaZlezda=data.adenohipofiza;
			   }
			   if(izabrano=="hipertireoza"){
			    $scope.stitnaZlezda=data.hipertireoza;
			   }
		   
		   if(izabrano=="pankreatitis"){
			   $scope.enzimi=data.pankreatitis;
			  }
			  if(izabrano=="infarkt"){
				  $scope.enzimi=data.infarkt;
			  }
		   
		  })
		 }
	
	
})