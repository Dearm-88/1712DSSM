package com.yxf.common.utils;

import org.junit.Test;

public class RandomUtilTest {

	@Test//返回一个随机整数
	public void testRandom() {
		int i = RandomUtil.random(1, 120);
		System.out.println(i);
		
	}

	@Test//返回一个随机整数的数组
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 3, 3);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test//返回一个
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	}

	@Test//返回指定长度的字符
	public void testRandomString() {
		String string = RandomUtil.randomString(6);
		System.out.println(string);
	}

}
