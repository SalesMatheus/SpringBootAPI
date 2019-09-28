package com.products.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.apirest.models.Product;
import com.products.apirest.repository.ProductRepository;

@RestController
@RequestMapping(value="/api")
public class ProductResource {
	
	@Autowired
	ProductRepository productRepository;

	@GetMapping("/product")
	public List<Product> listaProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product listaProductUnic(@PathVariable(value="id") long id){
		return productRepository.findById(id);
	}
	
}
