# TiAdMakerAndroid Module

## Description

AdMaker module for Titanium Mobile (Android)

## Accessing the tiadmakerandroid Module

To access this module from JavaScript, you would do the following:

	var tiadmakerandroid = require("tv.harukaze.ti.admaker.android");

The tiadmakerandroid variable is a reference to the Module object.	

## Reference


### ___PROJECTNAMEASIDENTIFIER__.function


### ___PROJECTNAMEASIDENTIFIER__.property


## Usage

	var tiadmakerandroid = require('tv.harukaze.ti.admaker.android');

	// set site_id (from admaker's console)
	tiadmakerandroid.setSiteId(site_id);
	// set zone_id (from admaker's console)
	tiadmakerandroid.setZoneId(zone_id);
	// set ad_url (from admaker's console)
	tiadmakerandroid.setAdUrl(ad_url);

	// create admaker view
	var admakerView = tiadmakerandroid.createAdMakerView({bottom:0});

	window.add(admakerView);

## Author

Tomoya Narita (@harukazepc)
<sphone@harukaze.tv>

## License

MIT License
