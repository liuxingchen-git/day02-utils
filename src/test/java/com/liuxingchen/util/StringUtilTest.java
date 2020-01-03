package com.liuxingchen.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(".");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString();
		System.out.println(name);
	}
	
	@Test
	public void testRandomChineseString2() {
		String name = StringUtil.randomChineseString(1000);
		System.out.println(name);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	
	@Test
	public void testIsPhoneNumber() {
		boolean b = StringUtil.isPhoneNumber("15301816695");
		System.out.println(b);
	}
	
	@Test
	public void testIsEMail() {
		boolean b = StringUtil.isEMail("1781485529@qq.com");
		System.out.println(b);
	}

}
