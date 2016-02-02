package com.google.constantes;

public class LibConstante {
	
	public static String PREF_NAME_LIST_ARTICLE = "NEWS_ARTICLE_READ";
	public static final String LAST_PAGE_VISITED = "LAST_PAGE_VISITED";
	public static String PREF_WEB_API = "AMITAFF_ACCESS_PREF";
	
	public static final int maxLevel[] = { 20, 20, 20, 25, 20};
	
	public static int numberShow1 = 1;
	public static int numberShow2 = 1;
	public static int valueGameover = 1;
	public static int valueGameCompleted = 1;
	public static int heroNumber = 3;
	
	public static String FACEBOOK = "FACEBOOK";
	public static String RATE_APP = "RATE_APP";
	public static String LIST_APP = "LIST_APP";
	public static String SHARE_APP = "SHARE_APP";
	public static String RETURN_TO_APP = "RETURN_TO_APP";
	public static String EXIT = "EXIT";
	
	public static boolean booleanValue(String value, String trueValue){
		if(value.equals(trueValue)){
			return true;
		}
		return false;
	}
	
	public static boolean booleanValue(int value, int trueValue){
		if(value == trueValue){
			return true;
		}
		return false;
	}

}
