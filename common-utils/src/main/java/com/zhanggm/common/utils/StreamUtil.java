package com.zhanggm.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * 流工具类
 * @Description:TODO(描述这个类的作用)   
 * @author: zhanggm1002
 * @date:   2019年12月5日 下午1:31:39
 */
public class StreamUtil {
	/**
	 * 关闭流的方法
	 * @Title: closeAll   
	 * @Description: 数组参数，可以批量删除多个打开的流   
	 * @param: @param autoCloseables      
	 * @return: void      
	 * @throws
	 */
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
	 * @Title: readTextFile   
	 * @Description: 以流的方式，读取文本文件内容   
	 * @param: @param file
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String readTextFile(File file) {
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
	 * @Title: getFileContent   
	 * @Description: 根据文件全名读取文件内容   
	 * @param: @param fileFullName
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	public static String readTextFile(String fileFullName) {
		return readTextFile(new File(fileFullName));
	}
	
}
