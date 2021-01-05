package com.alvesjefs.ms_products.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.ms_products.domain.Products;
import com.alvesjefs.ms_products.dto.ProductsDTO;
import com.alvesjefs.ms_products.repositories.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	public List<ProductsDTO> findAll() {
		List<Products> find = productsRepository.findAllByOrderByName();
		return find.stream().map(x -> new ProductsDTO(x)).collect(Collectors.toList());
	}
}
