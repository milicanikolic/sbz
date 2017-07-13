'use strict';
var app=angular.module('app',['ui.router','ngMaterial']);

app.config(function($stateProvider, $urlRouterProvider) {
	
	$urlRouterProvider.otherwise('/pocetna');
	
	
	$stateProvider.state('pocetna', {
		url : '/pocetna',
		templateUrl : 'stranice/jumbotron.html',
		controller : 'pocetnaC'
	})
	
	$stateProvider.state('izbor', {
		url : '/izbor',
		templateUrl : 'stranice/pocetna.html',
		controller : 'pocetnaC'
	})
	
	$stateProvider.state('kks', {
		url : '/kks',
		templateUrl : 'stranice/formaKKS.html',
		controller : 'pocetnaC'
	})
	
	$stateProvider.state('jetra', {
		url : '/jetra',
		templateUrl : 'stranice/enzimiJetre.html',
		controller : 'pocetnaC'
	})
	
	$stateProvider.state('dodatna1', {
		url : '/dodatna1',
		templateUrl : 'stranice/dodatnaAnemija1.html',
		controller : 'pocetnaC'
	})
	$stateProvider.state('dodatna2', {
		url : '/dodatna2',
		templateUrl : 'stranice/dodatnaAnemija2.html',
		controller : 'pocetnaC'
	})

	
	$stateProvider.state('stitnaZlezda', {
		url : '/stitnaZlezda',
		templateUrl : 'stranice/StitnaZlezda.html',
		controller : 'pocetnaC'
	})
	
	$stateProvider.state('enzimiKrvi', {
		url : '/enzimiKrvi',
		templateUrl : 'stranice/enzimiUKrvi.html',
		controller : 'pocetnaC'
	})
	
	$stateProvider.state('krajnjiIspis', {
		url : '/krajnjiIspis',
		templateUrl : 'stranice/ispisBolesti.html',
		controller : 'pocetnaC'
	})
});