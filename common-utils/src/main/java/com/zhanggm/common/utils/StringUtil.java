package com.zhanggm.common.utils;

public class StringUtil {
	/**
	 * @Title: isBlank   
	 * @Description: 判断字符串是否为空  
	 * @param: @param str
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static boolean isBlank(String str) {
		if(str==null) {
			return false;
		}
		//去空格
		str = str.trim();
		//
		if(str.length()==0) {
			return false;
		}
		return true;
	}
	/**
	 * @Title: isNotBlank   
	 * @Description: 字符串内容不为空，返回true   
	 * @param: @param str
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
	
	/**
	 * @Title: isPhoneNum   
	 * @Description: 判断字符串是否为手机号   
	 * @param: @param str
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static boolean isPhoneNum(String str) {
		String regex = "1[3578]\\d{9}";
		return str.matches(regex);
	}
	
}
