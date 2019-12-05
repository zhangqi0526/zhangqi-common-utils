package com.zhanggm.common.utils;

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
		System.out.println(getExtName("aaa.jpg"));
		String property = System.getProperty("JAVA_HOME");
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}
}
