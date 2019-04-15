package com.cloud.young.server1.model;

import lombok.Data;

@Data
public class ResponseVO<T> {

	private String code;
	
	private String message;
	
	private T obj;
	
	public ResponseVO() {}
	
	public ResponseVO(String code,String message) {
		this.code = code;
		this.message = message;
	}
}
