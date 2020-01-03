package com.liuxingchen.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DataUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < 1000; i++) {
			Date date = DataUtil.randomDate(new Date(0), new Date());
			System.out.println(df.format(date));
		}
	}

	@Test
	public void testInitMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DataUtil.initMonth(new Date());
		System.out.println(df.format(date));
	}

	@Test
	public void testEndMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DataUtil.endMonth(new Date());
		System.out.println(df.format(date));
	}
}
