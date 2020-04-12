package com.yxf.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: charles
 * @date: 2020年3月27日 上午8:56:01
 */
public class DateUtil {
	
	
	
	  /**
	   * 
	   * @Title: getAgeByBirthday 
	   * @Description: 根据出生日期算年龄
	   * @param date
	   * @return
	   * @return: int
	   */
	  public static int getAgeByBirthday(Date birthday) {
		  Calendar c = Calendar.getInstance();//获取日期类
		  int s_year =c.get(Calendar.YEAR);//获取系统的年
		  int s_month =c.get(Calendar.MONTH);//获取系统的月
		  int s_date =c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		  c.setTime(birthday);//用出生日期初始日历类
		  int b_year = c.get(Calendar.YEAR);//获取出生的年
		  int b_month =c.get(Calendar.MONTH);//获取出生的月
		  int b_date =c.get(Calendar.DAY_OF_MONTH);//获取出生的日
		  //计算年龄
		 int age = s_year - b_year;
		 //如果系统月份小于b_month
		 if(s_month < b_month) {
			 age--; //年龄减少一岁
		 } 
		 //如果月份相等，但是系统的天小于出生的天
		 if(s_month == b_month &&s_date < b_date) {
			 age--; //年龄减少一岁
		 }
		return age;
		  
	  }
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回一个月的月末   如 传入 2020/3/27 .返回 2020/3/31 23：59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//先初始化日历类
		Calendar c = Calendar.getInstance();
		//用传入参数初始化日历类
		c.setTime(date);
		//整体思路： 让当日期的月份+1 变成 2020/4/27 ，变成 月初 2020/4/1 00：00:00，再减去1秒
		c.add(Calendar.MONTH, 1);//1.让当日期的月份+1 
		
		Date initMonth = getInitMonth(c.getTime());//2变成 月初
		c.setTime(initMonth);//用initMonth 再次初始化日历类
		c.add(Calendar.SECOND, -1);//3.再减去1秒
		return c.getTime();
	}
	
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回传入日期的月初   如 传入 2020/3/27 .返回 2020/3/01 00：00:00
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();//获取一个日历类
		//用传入的日期初始化日历类
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//设置天的0 个小时
		c.set(Calendar.MINUTE, 0);//设置天的0 分钟
		c.set(Calendar.SECOND, 0);//设置天的0 秒
		return c.getTime();
		
	}
	
	
	
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startDate 和endDate 的随机日期
	 * @param startDate
	 * @param endDate
	 * @return 1970 .1.1 日
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		
		long t1 = startDate.getTime();//从1970到startDate 的毫秒数
		long t2 = endDate.getTime();//从1970到endDate 的毫秒数
		if(t2<t1)
		throw new RuntimeException("开始日期不能大于结束日期");
		
		//随机产生一个在t1 和t2 之间的毫秒数
		long t =(long) ((Math.random()* (t2-t1)) + t1);
		
		return new Date(t);
		
	}

}
