package com.zhanggm.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件工具类
 * @Description:封装文件的常用方法  
 * @author: zhanggm1002
 * @date:   2019年12月5日 下午1:27:47
 */
public class FileUtil {
	/**
	 * 根据文件，截取扩展名
	 * @param fileName "aa.png"
	 * @return
	 */
	public static String getExtName(String fileName) {
		//处理空异常
		if(fileName==null || "".equals(fileName)) {
			throw new RuntimeException("文件名不能为空");
		}
		if(fileName.indexOf(".")<=-1) {
			throw new RuntimeException(fileName+":该文件名没有包含扩展名");
		}
		String extName = fileName.substring(fileName.lastIndexOf("."));
		return extName;
	}
	/**
	 * 获取系统当前用户目录
	 * @return
	 */
	public static String getSystemUserHome() {
		return System.getProperty("user.home");
	}
	/**
	 * @Title: readTextFileByLine   
	 * @Description: 读取文件内容   
	 * @param: @param pathname
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@SuppressWarnings("resource")
	public static String readTextFileByLine(String pathname) {
		BufferedReader br;
		StringBuffer sb = new StringBuffer();
		try {
			br = new BufferedReader(new FileReader(new File(pathname)));
			do {
				sb.append(br.readLine());
				sb.append("\r\n");
			}while(br.read()!=-1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return sb.toString();
	}
	/**
	 * @Title: readTextFileOfList   
	 * @Description: 按行读取文件内容到list集合   
	 * @param: @param pathname
	 * @param: @return      
	 * @return: List<String>      
	 * @throws
	 */
	@SuppressWarnings("resource")
	public static List<String> readTextFileOfList(String pathname) {
		BufferedReader br;
		List<String> strList = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(new File(pathname)));
			do {
				strList.add(br.readLine());
			}while(br.read()!=-1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return strList;
	}
	
	public static void main(String[] args) {
		System.out.println(readTextFileByLine("C:\\Users\\Administrator\\Desktop\\pom.xml"));
	}
	
}
