package com.alvesjefs.ms_orders.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.ms_orders.domain.Orders;
import com.alvesjefs.ms_orders.domain.Products;
import com.alvesjefs.ms_orders.domain.enums.OrderStatus;
import com.alvesjefs.ms_orders.dto.OrdersDTO;
import com.alvesjefs.ms_orders.dto.ProductsDTO;
import com.alvesjefs.ms_orders.repositories.OrdersRepository;
import com.alvesjefs.ms_orders.repositories.ProductsRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;

	@Autowired
	private ProductsRepository productsRepository;

	public List<OrdersDTO> findAll() {
		List<Orders> find = ordersRepository.findOrdersWithProducts();
		return find.stream().map(x -> new OrdersDTO(x)).collect(Collectors.toList());
	}

	public OrdersDTO insertOrder(OrdersDTO ordersDTO) {
		Orders orders = new Orders(null, ordersDTO.getAddress(), ordersDTO.getLatitude(), ordersDTO.getLongitude(),
				Instant.now(), OrderStatus.PENDING);

		for (ProductsDTO products : ordersDTO.getProducts()) {
			Products product = productsRepository.getOne(products.getId());
			orders.getProducts().add(product);
		}

		orders = ordersRepository.save(orders);
		return new OrdersDTO(orders);
	}

	public OrdersDTO updateDelivered(Long id) {
		Orders orders = ordersRepository.getOne(id);
		orders.setOrderStatus(OrderStatus.DELIVERED);
		orders = ordersRepository.save(orders);
		return new OrdersDTO(orders);
	}
}
