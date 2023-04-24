package com.ust.rest.resource;

import java.math.BigDecimal;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
public  class Product {
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
