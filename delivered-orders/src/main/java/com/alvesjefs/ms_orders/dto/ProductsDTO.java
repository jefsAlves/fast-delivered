package com.alvesjefs.ms_orders.dto;

import com.alvesjefs.ms_orders.domain.Products;

public class ProductsDTO {

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imageUri;

	public ProductsDTO() {
	}

	public ProductsDTO(Long id, String name, String description, Double price, String imageUri) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imageUri = imageUri;
	}

	public ProductsDTO(Products products) {
		id = products.getId();
		name = products.getName();
		description = products.getDescription();
		price = products.getPrice();
		imageUri = products.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

}
