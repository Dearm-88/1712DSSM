package com.yxf.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	
	@Test
	public void testGetAge() {
		
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		int i = DateUtil.getAgeByBirthday(c.getTime());
		System.out.println(i);
		
	}
	
	
	@Test // ÔÂÄ©
	public void testEndMonth() {

		Calendar c = Calendar.getInstance();
		c.set(2019, 1, 20);

		Date date = DateUtil.getEndMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test // ÔÂ³õ
	public void testInitMonth() {
		Date date = DateUtil.getInitMonth(new Date(1000000000000l));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));

	}

	@Test
	public void testRandomDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			 System.out.println(df.format(date));
		}
		//Date date = new Date(1000000000000l);

		//System.out.println(df.format(date));
		//System.out.println(Math.random());

	}

}
