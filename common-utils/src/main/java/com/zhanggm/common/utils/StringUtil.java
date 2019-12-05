package com.zhanggm.common.utils;

public class StringUtil {
	public static boolean isBlank(String str) {
		if(str!=null) {
			str.trim();
			System.out.println(str);
		}
		return true;
	}
	
	public static void main(String[] args) {
		isBlank(" ");
	}
}
