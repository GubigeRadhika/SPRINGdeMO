package com.cg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.bean.Product;
import com.cg.product.dao.IProductDao;



@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	IProductDao dao;
	
	
	@Override
	public Product retrieveProduct(String id) {
		return dao.retrieveProduct(id);
	}

	@Override
	public List<Product> retrieveAllProducts() {
		return dao.retrieveAllProducts();
	}

}
