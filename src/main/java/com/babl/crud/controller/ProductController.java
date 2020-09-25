package com.babl.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.babl.crud.model.Product;
import com.babl.crud.service.ProductService;

@Controller
@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productservice.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product) {
		return productservice.saveProducts(product);
	}
	
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return productservice.getProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productservice.getProductById(id);
	}
	
	@GetMapping("/product/search/{name}")
	public List<Product> searchProductByName(@PathVariable String name) {
		return productservice.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		return productservice.deleteProduct(id);
	}
}
