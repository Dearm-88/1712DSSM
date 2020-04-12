package com.yxf.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testCreatePerson() {
		
		for (int i = 0; i <10000; i++) {
			Person p =new Person();
	//1	��������ֵ����StringUtil.generateChineseName()������4�֣�
		p.setName(StringUtil.generateChineseName());
	//2	��������ֵ����RandomUtil.random()������������1-120��֮�䣨4�֣�
		p.setAge(RandomUtil.random(1, 120));
	//	3��������ֵ����StringUtil.randomChineseString()����������Ϊ140��������֣�4�֣�
		p.setAbout(StringUtil.randomChineseString(140));
		
		//4ע����������ֵģ��2010��1��1�������������ʱ�䣨4�֣���
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
	    p.setCreated(date);
	    
	    System.out.println(i+""+p);
		}
	}

}
