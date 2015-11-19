package com.frain.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JobNumber {
	String Id;
	static int uuid=0001;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public void getNowTime() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		setId(dateFormat.format(date)+uuid);
		uuid++;
	}
}
