package com.cloud.young.server1.constant;

public enum ResponseCodeEnum {

	SUCCESS("20000","成功"),
	
	ERROR("50000","失败");
	
	private String code;

	private String message;
	
	private ResponseCodeEnum(String code,String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
}
