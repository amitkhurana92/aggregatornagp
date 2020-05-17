package com.nagp.aggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.aggregator.controller.dto.OrderDetailsDto;
import com.nagp.aggregator.service.AggregatorService;

@RestController
public class AggregatorController {

	@Autowired
	private AggregatorService aggregatorService;

	@GetMapping("/orderdetails/1")
	public ResponseEntity<OrderDetailsDto> getOrderDetails() {
		OrderDetailsDto detailsDto = aggregatorService.getOrderDetails();

		return new ResponseEntity<>(detailsDto, HttpStatus.OK);
	}
}
