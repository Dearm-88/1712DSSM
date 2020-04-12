package com.yxf.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil
 * @Description: 流处理
 * @author: charles
 * @date: 2020年3月30日 上午8:51:02
 */
public class StreamUtil {
	
	/**
	 * 
	 * @Title: readFile2List 
	 * @Description:  读取文件到list
	 * @param fileName
	 * @return
	 * @throws IOException
	 * @return: List<String>
	 */
	public static List<String> readFile2List(String pathname) throws IOException {
		File file = new File(pathname);//根据路径去创建文件
		return readFile2List(file);

	}

	/**
	 * 
	 * @Title: readFile2List
	 * @Description: 读取文件到list
	 * @param file
	 * @return
	 * @return: List<String>
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	public static List<String> readFile2List(File file) throws IOException {
		InputStream in = new FileInputStream(file);
		return readFile2List(in);

	}

	/**
	 * 
	 * @Title: readFile2List
	 * @Description: 读取文件到list
	 * @param in
	 * @return
	 * @return: List<String>
	 * @throws IOException
	 */
	public static List<String> readFile2List(InputStream in) throws IOException {
		List<String> list = new ArrayList<String>();
		// 创建BufferedReader
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));

		String str;
		while ((str = bf.readLine()) != null) {// 读到文件末尾
			list.add(str);
		}
		return list;

	}

}
