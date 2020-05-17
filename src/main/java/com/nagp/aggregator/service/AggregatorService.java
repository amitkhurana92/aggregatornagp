package com.nagp.aggregator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagp.aggregator.controller.dto.OrderDetailsDto;
import com.nagp.aggregator.dto.Orders;
import com.nagp.aggregator.dto.UserDto;

@Service
public class AggregatorService {

	@Autowired
	private RestTemplate restTemplate;

	public OrderDetailsDto getOrderDetails() {
		OrderDetailsDto orderDetailsDto = new OrderDetailsDto();

		String orderPath = System.getenv("ORDER_PATH") != null ? System.getenv("ORDER_PATH") : "http://localhost:8081";
		String userPath = System.getenv("USER_PATH") != null ? System.getenv("USER_PATH") : "http://localhost:8082";

		ResponseEntity<Orders> orderResponse = restTemplate.getForEntity(orderPath + "/orders/1", Orders.class);

		ResponseEntity<UserDto> userResponse = restTemplate.getForEntity(userPath + "/user/1", UserDto.class);

		orderDetailsDto.setOrders(orderResponse.getBody());

		orderDetailsDto.setUserdetails(userResponse.getBody());

		return orderDetailsDto;

	}
}
