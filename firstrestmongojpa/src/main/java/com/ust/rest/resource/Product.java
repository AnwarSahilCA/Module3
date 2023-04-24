package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	//Auto is the default generation type or strategy.
											//Generation type is the strategy u want the jpa to follow
											// primary key values
	private String _id; 			//when a strategy is not specified jpa uses auto strategy
	private String name;				//when the underlined database is mysql.genration typ.auto 
										//means the jpa will create a hibernate sequence in the database for generation of primary keys
	private String description;
	private BigDecimal price;    //Hibernate: select next_val as id_val from hibernate_sequence for update
	private int qty;
}								//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
								//Hibernate: insert into product (description, name, price, qty, productid) values (?, ?, ?, ?, ?)
								//table created first and the inputing-Identity
								//table created after inputing-auto
	
/*#CREATE TABLE `sakila`.`product` (
  `productId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `price` DECIMAL(10) NULL,
  `qty` INT NULL,
  PRIMARY KEY (`productId`));*/
/* Generation.Identity:- For this strategy to work, first we have to 
 * create a table in mysql database and explicitly specify
 *  the auto increment(ai)column as checked for the primary key column and
 *  in and iN APPLICATION.PROPERTIES spring.jpa.hibernate.ddl-auto=update.
 *  This should not be set. If it  is set it should have value as update*/
