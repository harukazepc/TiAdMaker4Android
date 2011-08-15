/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package tv.harukaze.ti.admaker.android;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiContext;

@Kroll.module(name="Tiadmakerandroid", id="tv.harukaze.ti.admaker.android")
public class TiAdMakerAndroidModule extends KrollModule
{
	public static String SITE_ID;
	public static String ZONE_ID;
	public static String AD_URL;
	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public TiAdMakerAndroidModule(TiContext tiContext) {
		super(tiContext);
	}

	@Kroll.method
	public void setSiteId(String siteId){
		SITE_ID = siteId;
	}
	
	@Kroll.method
	public void setZoneId(String zoneId){
		ZONE_ID = zoneId;
	}
	
	@Kroll.method
	public void setAdUrl(String adUrl) {
		AD_URL = adUrl;
	}
	
	
}