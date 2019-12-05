package com.zhanggm.common.utils;
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
	
	public static void main(String[] args) {
		System.out.println(getExtName("aaajpg"));
		String property = System.getProperty("JAVA_HOME");
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}
}
