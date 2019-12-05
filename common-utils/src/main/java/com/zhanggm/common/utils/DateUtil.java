package com.zhanggm.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * @Description:日期工具类   
 * @author: zhanggm1002
 * @date:   2019年12月5日 下午1:23:19
 */
public class DateUtil {
	/**
	 * 根据生日计算年龄
	 * @param birthDate
	 * @return
	 */
	public static int getAge(Date birthDate) {
		//获得日历控件
		Calendar calendar = Calendar.getInstance();
		//获得年、月、日
		int nowYear = calendar.get(Calendar.YEAR);
		int nowMonth = calendar.get(Calendar.MONTH);
		int nowDay = calendar.get(Calendar.DAY_OF_MONTH);
		//设置日历控件为生日的时间
		calendar.setTime(birthDate);
		int birthYear = calendar.get(Calendar.YEAR);
		int birthMonth = calendar.get(Calendar.MONTH);
		int birthDay = calendar.get(Calendar.DAY_OF_MONTH);
		//计算年龄
		int age = nowYear-birthYear;
		//如果生日的月份大于当前月份时，年龄-1
		if(birthMonth>nowMonth) {
			age--;
		}
		//如果月份相等，判断日期
		if(birthMonth==nowMonth && nowDay<birthDay) {
			age--;
		}
		return age;
	}
	/**
	 * 根据出生日期计算年龄
	 * @param birthDateStr "2019-11-08"
	 * @return
	 */
	public static int getAge(String birthDateStr) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDate = null;
		try {
			//解析日期字符串为Date对象
			birthDate = simpleDateFormat.parse(birthDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//调用日期计算方法
		return getAge(birthDate);
	}
	
	public static void main(String[] args) {
		System.out.println(getAge("1980-02-30"));
	}
}
