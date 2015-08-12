package com.packt.webstore.domain.repository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	Product getProductById(String productID);
	List <Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	Set<Product> getProductsByPriceFilter(Map<String, List<BigDecimal>> filterParams);
	List <Product> getProductsByManufacturer(String manufacturer);
	void addProduct(Product product);

}
