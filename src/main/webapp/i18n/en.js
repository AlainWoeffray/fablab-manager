angular.module('App').config(function ($translateProvider) {
	$translateProvider.translations('en', {
		error:{
			internal:'Internal error'
		},
		menu:{
			home:'Home',
			users:'Users',
			reservation:'Reservation',
		},
		auth:{
			result:{
				ok:'Login Successful',
				unknownUserPassword:'Login and/or password incorrect'
			},
			pleaseSignIn:'Please sign in',
			email:'Email address',
			password:'Password',
			signIn:'Sign In'
		}
	});
});
