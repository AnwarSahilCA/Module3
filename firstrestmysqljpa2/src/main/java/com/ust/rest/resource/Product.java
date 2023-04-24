package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity 
public class Product {
	
	@Id
	@Getter @Setter
	private long productID;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String description;
	@Getter @Setter
	private BigDecimal price;
	@Getter @Setter
	private int qty;
	
	
}
