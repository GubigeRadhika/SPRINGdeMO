package com.cg.product.dao;

import java.util.List;

import com.cg.product.bean.Product;

public interface IProductDao {
	public Product retrieveProduct(String id);
	public List<Product> retrieveAllProducts();
}
