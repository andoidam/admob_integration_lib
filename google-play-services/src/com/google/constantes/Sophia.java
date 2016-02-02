package com.google.constantes;

import com.google.admob.integration.libs.Admob;

public class Sophia extends Admob{
	
	@Override
	public void onCreate() {
		super.onCreate();
	}
	
	public static void interstitial(){
		Admob.get().skShowInterstitial();
	}

}
