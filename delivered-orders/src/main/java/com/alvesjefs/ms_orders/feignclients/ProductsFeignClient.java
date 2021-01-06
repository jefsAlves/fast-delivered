package com.alvesjefs.ms_orders.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.alvesjefs.ms_orders.domain.Products;
import com.alvesjefs.ms_orders.dto.ProductsDTO;

@FeignClient(name = "delivered-orders", path = "api/products")
@Component
public interface ProductsFeignClient {

	@GetMapping
	List<ProductsDTO> findAll(Products products);
}
