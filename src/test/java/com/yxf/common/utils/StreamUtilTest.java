package com.yxf.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadFile2List() throws IOException {
		InputStream in = this.getClass().getResourceAsStream("/data.txt");
		
		//List<String> list = StreamUtil.readFile2List("e:/data.txt");
		List<String> list = StreamUtil.readFile2List(in);
		for (String string : list) {
			String[] s = string.split("\\|");
			System.out.println(s[0]);
			System.out.println(s[1]);
			System.out.println(s[2]);
			System.out.println(s[3]);
			System.out.println(s[4]);
			System.out.println(s[5]);
			System.out.println(s[6]);
			System.out.println(s[7]);
			System.out.println(s[8]);
			System.out.println(s[9]);
		}
	}

}
