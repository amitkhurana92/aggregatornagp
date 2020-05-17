package com.nagp.aggregator.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class OrderDto {

	private int orderId;
	private double orderAmount;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
	private LocalDate orderDate;
	
}
