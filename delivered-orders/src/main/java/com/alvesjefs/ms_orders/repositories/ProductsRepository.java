package com.alvesjefs.ms_orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.ms_orders.domain.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
