package com.alvesjefs.ms_orders.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.ms_orders.domain.Orders;
import com.alvesjefs.ms_orders.dto.OrdersDTO;
import com.alvesjefs.ms_orders.repositories.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	public List<OrdersDTO> findAll() {
		List<Orders> find = ordersRepository.findOrdersWithProducts();
		return find.stream().map(x -> new OrdersDTO(x)).collect(Collectors.toList());
	}

}
