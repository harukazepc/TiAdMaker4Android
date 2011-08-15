TiAdAdMaker4Android
===========================================

AdMaker module for Titanium Mobile (Android).
This module uses AdMaker Android SDK.

HOW TO USE IT
-----------------------------

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


INSTALL TiAdMaker4Android
--------------------

1. Download `AdMaker Android SDK` from AdMaker's Web Console
2. Make `lib` folder, and Put `AdMaker Android SDK` to it.
3. Open `Terminal`
4. Run below command

	`python build.py && unzip tv.harukaze.ti.admaker.android-android-0.1.zip -d /Library/Application\ Support/Titanium/`


REGISTER TO YOUR PROJECT
---------------------

Register your module with your application by editing `tiapp.xml` and adding your module.
Example:

	<modules>
		<module version="0.1">tv.harukaze.ti.admaker.android</module>
	</modules>

When you run your project, the compiler will know automatically compile in your module
dependencies and copy appropriate image assets into the application.


LICENSE
---------------------
MIT License

Copyright 2011 Tomoya Narita 
http://harukaze.tv/
http://d.hatena.ne.jp/harukazepc/
Twitter: @harukazepc