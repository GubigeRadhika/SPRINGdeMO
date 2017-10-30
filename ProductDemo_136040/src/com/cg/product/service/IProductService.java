package com.cg.product.service;

import java.util.List;

import com.cg.product.bean.Product;

public interface IProductService {
	public Product retrieveProduct(String id);
	public List<Product> retrieveAllProducts();
}
