package com.frain.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobNumber {
	static int uuid=0001;


	/**
	 * ��ȡ��ǰ����
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
	 * ��ȡ��ǰʱ��
	 * @return
	 */
	public static String getNowTime(){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(date);
	}
}
