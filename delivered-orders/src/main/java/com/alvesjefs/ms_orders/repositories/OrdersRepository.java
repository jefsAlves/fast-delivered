package com.alvesjefs.ms_orders.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.alvesjefs.ms_orders.domain.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

	@Query("SELECT DISTINCT obj FROM Orders obj JOIN FETCH obj.products WHERE obj.orderStatus = 0 ORDER BY obj.moment ASC")
	List<Orders> findOrdersWithProducts();
}
