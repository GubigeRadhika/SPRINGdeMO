package com.cg.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.product.bean.Product;


@Repository
@Transactional
public class ProductDaoImpl implements IProductDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Product retrieveProduct(String id) {
		return entityManager.find(Product.class, id);
	}

	@Override
	public List<Product> retrieveAllProducts() {
		TypedQuery<Product> qry = entityManager.createQuery("from Product",Product.class);
		List<Product> traineeList = qry.getResultList();
		return traineeList;
	}
	
	
}
