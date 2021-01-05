package com.alvesjefs.ms_products.dto;

import java.io.Serializable;
import java.util.Objects;

import com.alvesjefs.ms_products.domain.Products;

public class ProductsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imageUri;

	public ProductsDTO() {
	}

	public ProductsDTO(Long id, String name, String description, Double price, String imageUri) {
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
		imageUri = products.getDescription();
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductsDTO other = (ProductsDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductDTO [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", price=");
		builder.append(price);
		builder.append(", imageUri=");
		builder.append(imageUri);
		builder.append("]");
		return builder.toString();
	}

}
