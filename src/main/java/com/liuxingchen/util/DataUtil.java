package com.liuxingchen.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DataUtil
 * @Description: TODO
 * @author: HP
 * @date: 2020年1月2日 下午7:52:29
 */
public class DataUtil {

	// 获取一个月的月初 如 ：2020-01-01 00:00:00
	public static Date initMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	// 返回一个月月末
	// 思路： 让月加1 ，再变成月初，最后减去1秒
	public static Date endMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		Date initMonth = initMonth(c.getTime());
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

	/**
	 * 
	 * @Title: getAgeByBirthday
	 * @Description: 使用日历类 计算 ：根据出生日期算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	// 2020-02-02 2000-03-03
	public static int getAgeByBirthday(Date date) {
		//用系统时间获取日历类
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);//获取系统的年
		int s_month = c.get(Calendar.MONTH);//获取系统的月
		int s_day = c.get(Calendar.DAY_OF_MONTH);//获取系统的日
				
		//用传入的日期初始化一个日历类
		c.setTime(date);
		int b_year = c.get(Calendar.YEAR);//获取出生日期的年
		int b_month = c.get(Calendar.MONTH);//获取出生日期的月
		int b_day = c.get(Calendar.DAY_OF_MONTH);//获取出生日期的日
				
		int age = s_year - b_year;//用系统年 -出生年 
				
		if(s_month < b_month)//如果系统月小于出生月年龄减一
			age --;
		if(s_month == b_month && s_day < b_day )//如果系统月和初始月一致并且系统日小于出生日 年龄减一
			age --;
		return age;
	}

	/**
	 * 
	 * @Title: randomDate
	 * @Description: 随机返回一个在start--end 之间的日期
	 * @param start
	 * @param end
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date start, Date end) {
		long t1 = start.getTime();
		long t2 = end.getTime();
		long t = (long) ((Math.random() * (t2-t1) +1) +1);
		return new Date(t);
	}

}
