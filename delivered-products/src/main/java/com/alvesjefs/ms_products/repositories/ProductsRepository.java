package com.alvesjefs.ms_products.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.ms_products.domain.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

	List<Products> findAllByOrderByName();
}
