package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Product;
@Repository
public class ProductRepository {
	private ArrayList<Product> productCache=new ArrayList<>();
	public ProductRepository() {
		Product p1=new Product();
		p1.setProductID(101);
		p1.setName("Laptop");
		p1.setDescription("Macbook Retina Eye");
		p1.setPrice(new BigDecimal(180000));
		p1.setQty(5);
		productCache.add(p1);
		
		Product p2=new Product();
		p2.setProductID(102);
		p2.setName("Tablet");
		p2.setDescription("Samsung max view");
		p2.setPrice(new BigDecimal(3500));
		p2.setQty(10);
		productCache.add(p2);
		
		Product p3=new Product();
		p3.setProductID(103);
		p3.setName("Mobile");
		p3.setDescription("iphone 14");
		p3.setPrice(new BigDecimal(75000));
		p3.setQty(7);
		productCache.add(p3);
		
		Product p4=new Product();
		p4.setProductID(104);
		p4.setName("Television");
		p4.setDescription("Sony Bravo 75\"");
		p4.setPrice(new BigDecimal(75000));
		p4.setQty(7);
		productCache.add(p4);
		
		Product p5=new Product();
		p5.setProductID(105);
		p5.setName("Airconditioner");
		p5.setDescription("Samsung Xcool");
		p5.setPrice(new BigDecimal(44500));
		p5.setQty(15);
		productCache.add(p5);
		
		Product p6=new Product();
		p6.setProductID(106);
		p6.setName("phone");
		p6.setDescription("Nokia 3660");
		p6.setPrice(new BigDecimal(2500));
		p6.setQty(15);
		productCache.add(p6);
	}
	//C-create
	public boolean addProduct(Product product) {
		if(productCache.add(product))
			return true;
		
		else return false;
		
	}
//R-Retrieve
	public Product getProduct(long productId) {
		Iterator<Product> iter=productCache.iterator();
		Product product=null;
		while(iter.hasNext())
		{
		product=iter.next();
		
			if(product.getProductID()==productId) {
				break;
			}
		}
		if(product!=null)
			return product;
		else return null;
}
	public ArrayList<Product> getProducts() {
		// TODO Auto-generated method stub
		return productCache;
	}
	public Product updateProduct(Product productToUpdate) {
		Product searchProduct=null;
		Iterator<Product> iter=productCache.iterator();
		int index=0;
		while(iter.hasNext()) {
			
			searchProduct=iter.next();
			if(searchProduct.getProductID()==productToUpdate.getProductID()) {
				productCache.add(index, searchProduct);
				productToUpdate=searchProduct;
			}
			index++;
		}
		return productToUpdate;
		
	}
	public void deleteProduct(long productId) {
		Product pr=null;
		Iterator<Product> iter=productCache.iterator();
		int index=0;
		while(iter.hasNext()) {
		
			pr=iter.next();
			if(pr.getProductID()==productId) {
				break;
			}
			index++;
		}
	productCache.remove(index);
	}
	 
}
