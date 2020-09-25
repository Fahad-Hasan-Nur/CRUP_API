package com.babl.crud.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.babl.crud.model.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{

	List<Product> findByName(String name);
	

}
