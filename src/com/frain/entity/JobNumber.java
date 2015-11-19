package com.frain.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobNumber {
	static int uuid=0001;


	/**
	 * 获取当前工号
	 * @return
	 */
	public static String getUUID() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String nowtime=(dateFormat.format(date)+uuid);
		uuid++;
		return nowtime;
		
	}
	/**
	 * 获取当前时间
	 * @return
	 */
	public static String getNowTime(){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(date);
	}
}
