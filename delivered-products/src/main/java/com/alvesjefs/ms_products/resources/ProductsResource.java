package com.alvesjefs.ms_products.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.ms_products.domain.Products;
import com.alvesjefs.ms_products.dto.ProductsDTO;
import com.alvesjefs.ms_products.services.ProductsService;

@RestController
@RequestMapping(value = "api/products")
public class ProductsResource {

	@Autowired
	private ProductsService productsService;

	@GetMapping
	public ResponseEntity<List<ProductsDTO>> findAll(Products products) {
		List<ProductsDTO> find = productsService.findAll();
		return ResponseEntity.ok().body(find);
	}
}
