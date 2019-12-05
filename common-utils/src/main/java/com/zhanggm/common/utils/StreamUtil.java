package com.zhanggm.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtil {
	
	public static void closeAll(AutoCloseable... autoCloseables ) {
		if(autoCloseables!=null) {
			for(AutoCloseable autoCloseable:autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 读取文件内容
	 * @param file
	 * @return
	 */
	public static String getFileContent(File file) {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] b = new byte[1024];
			String str = null;
			while (inputStream.read(b)!=-1) {
				str += new String(b);
			}
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally {
			closeAll(inputStream);
		}
	}
	/**
	 *      根据文件全名读取文件内容
	 * @param fileFullName
	 * @return
	 */
	public static String getFileContent(String fileFullName) {
		return getFileContent(new File(fileFullName));
	}
	
	public static void main(String[] args) {
		System.out.println(getFileContent("C:\\Users\\Administrator\\Desktop\\pom.xml"));
	}
}
