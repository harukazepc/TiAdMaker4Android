// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var window = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel();
window.add(label);

// TODO: write your module tests here

var tiadmakerandroid = require('tv.harukaze.ti.admaker.android');

// set site_id
tiadmakerandroid.setSiteId('1336');
// set zone_id
tiadmakerandroid.setZoneId('3304');
// set ad_url
tiadmakerandroid.setAdUrl('http://images.ad-maker.info/apps/zekp03nuad96.html');

// create admaker view
var admakerView = tiadmakerandroid.createAdMakerView({bottom:0});

window.add(admakerView);
window.open();
