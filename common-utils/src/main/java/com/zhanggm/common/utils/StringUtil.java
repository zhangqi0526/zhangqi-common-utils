package com.zhanggm.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	 * 判断字符串是否为手机号
	 * @param str
	 * @return
	 */
	public static boolean isPhoneNum(String str) {
		String regex = "1[3578]\\d{9}";
		return str.matches(regex);
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPhoneNum("1818106007"));
	}
}
