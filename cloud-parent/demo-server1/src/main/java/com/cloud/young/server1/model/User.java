package com.cloud.young.server1.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5859880940064895217L;

	private Long id;
	
	private String name;
}
