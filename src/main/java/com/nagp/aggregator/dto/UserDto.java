package com.nagp.aggregator.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3629330381217980227L;
	private String name;
	private int age;
	private String email;

}
