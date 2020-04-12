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
 * @Description: ������
 * @author: charles
 * @date: 2020��3��30�� ����8:51:02
 */
public class StreamUtil {
	
	/**
	 * 
	 * @Title: readFile2List 
	 * @Description:  ��ȡ�ļ���list
	 * @param fileName
	 * @return
	 * @throws IOException
	 * @return: List<String>
	 */
	public static List<String> readFile2List(String pathname) throws IOException {
		File file = new File(pathname);//����·��ȥ�����ļ�
		return readFile2List(file);

	}

	/**
	 * 
	 * @Title: readFile2List
	 * @Description: ��ȡ�ļ���list
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
	 * @Description: ��ȡ�ļ���list
	 * @param in
	 * @return
	 * @return: List<String>
	 * @throws IOException
	 */
	public static List<String> readFile2List(InputStream in) throws IOException {
		List<String> list = new ArrayList<String>();
		// ����BufferedReader
		BufferedReader bf = new BufferedReader(new InputStreamReader(in));

		String str;
		while ((str = bf.readLine()) != null) {// �����ļ�ĩβ
			list.add(str);
		}
		return list;

	}

}
