package com.alvesjefs.ms_orders.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.ms_orders.domain.Orders;
import com.alvesjefs.ms_orders.dto.OrdersDTO;
import com.alvesjefs.ms_orders.services.OrdersService;

@RestController
@RequestMapping(value = "api/orders")
public class OrdersResources {

	@Autowired
	private OrdersService ordersService;

	@GetMapping
	public ResponseEntity<List<OrdersDTO>> findAll(Orders Orders) {
		List<OrdersDTO> find = ordersService.findAll();
		return ResponseEntity.ok().body(find);
	}

}
