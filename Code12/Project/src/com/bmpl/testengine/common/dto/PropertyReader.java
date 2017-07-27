package com.bmpl.testengine.common.dto;

import java.util.ResourceBundle;

public class PropertyReader {
	private static ResourceBundle rb = ResourceBundle.getBundle("config");
	
	public static String getUserFilePath(){
		return rb.getString("userfilepath");
	}
	
	public static String getExcelPath(){
		return rb.getString("excelPath");
	}

}
