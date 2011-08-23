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


QUICK INSTALL TiAdMaker4Android
--------------------

0. Download this module Project
2. Download `AdMaker Android SDK` from AdMaker's Web Console
3. Copy `AdMaker Android SDK` jar file into `dist/modules/tv.harukaze.ti.admaker.android/0.1/lib/`
4. Copy `dist/modules` folder into your Titanium Project ( ROOT/modules )


(OPTIONAL) INSTALL TiAdMaker4Android
--------------------

0. Download this module project
1. Download `AdMaker Android SDK` from AdMaker's Web Console
2. Make `lib` folder, and Put `AdMaker Android SDK` inside your module project
3. Check `build.properties` file and replace the path of SDKs
4. From command line, run this inside your module project:
	% ant run
5. Copy this zip file (at `dist` folder) into the folder of your Titanium Project
6. If you build the titanium project, the zip will be unziped and placed to you module folder


REGISTER TO YOUR PROJECT
---------------------

Register your module with your application by editing `tiapp.xml` and adding your module.
Example:

	<modules>
		<module version="0.1" platform="android">tv.harukaze.ti.admaker.android</module>
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