package com.alvesjefs.ms_orders.dto;

import java.io.Serializable;
import java.time.Instant;

import com.alvesjefs.ms_orders.domain.Orders;
import com.alvesjefs.ms_orders.domain.enums.OrderStatus;

public class OrdersDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String address;
	private String latitude;
	private String longitude;
	private Instant moment;
	private OrderStatus orderStatus;

	public OrdersDTO() {
	}

	public OrdersDTO(Long id, String address, String latitude, String longitude, Instant moment,
			OrderStatus orderStatus) {
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public OrdersDTO(Orders orders) {
		id = orders.getId();
		address = orders.getAddress();
		latitude = orders.getLatitude();
		longitude = orders.getLongitude();
		moment = orders.getMoment();
		orderStatus = orders.getOrderStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}
