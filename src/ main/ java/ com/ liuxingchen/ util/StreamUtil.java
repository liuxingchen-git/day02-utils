package com.liuxingchen.util;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: HP
 * @date: 2020年1月3日 下午6:35:45
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	
	/**
	 * 
	 * @Title: readLine 
	 * @Description: 读取文件
	 * @param ins
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readLine(InputStream in){
		
		List<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String str = null;
		try {
			while((str=reader.readLine())!=null) {
				list.add(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
       
       /**
	 * 批量关闭流
	 * @param autoCloseables
	 */
	public static void closeStream(AutoCloseable... autoCloseables) {

		if (autoCloseables != null) {
			for (AutoCloseable autoCloseable : autoCloseables) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	/**
	 * 
	 * @param src
	 * @return
	 */
	public static String readTextFile(File file) {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] b = new byte[1024];
			String str = "";
			while (inputStream.read(b)!=-1) {
				str+=new String(b);
			}
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			closeStream(inputStream);
		}
	}

	/**
	 * 传入文本文件对象
	 * 
	 * @param txtFile
	 * @return
	 */
	public static String readTextFile(String filePath) {
		return readTextFile(new File(filePath));
	}

}
