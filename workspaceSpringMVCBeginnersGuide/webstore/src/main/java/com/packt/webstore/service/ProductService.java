package com.packt.webstore.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductService {
	List <Product> getAllProducts();
	Product getProductById(String productID);
	List<Product> getProductsByCategory(String category);
	List <Product> getProductsByManufacturer(String manufacturer);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	Set<Product> getProductsByPriceFilter(Map<String, List<BigDecimal>> filterParams);
	void addProduct(Product product);

}
