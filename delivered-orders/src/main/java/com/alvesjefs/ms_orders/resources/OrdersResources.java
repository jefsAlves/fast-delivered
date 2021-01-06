package com.alvesjefs.ms_orders.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@PostMapping
	public ResponseEntity<OrdersDTO> insertOrder(@RequestBody OrdersDTO ordersDTO) {
		OrdersDTO orders = ordersService.insertOrder(ordersDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(orders.getId()).toUri();
		return ResponseEntity.created(uri).body(orders);
	}

	@PutMapping(value = "/{id}/delivered")
	public ResponseEntity<OrdersDTO> updateDelivered(@PathVariable Long id) {
		OrdersDTO orders = ordersService.updateDelivered(id);
		return ResponseEntity.ok().body(orders);
	}

}
