package com.nagp.aggregator.controller.dto;

import java.io.Serializable;

import com.nagp.aggregator.dto.Orders;
import com.nagp.aggregator.dto.UserDto;

import lombok.Data;

@Data
public class OrderDetailsDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1884708430795257985L;
	private UserDto userdetails;
	private Orders orders;
}
