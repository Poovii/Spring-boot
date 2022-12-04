package com.example.demo.service;
	
	import java.util.List;
	import javax.transaction.Transactional;

import com.example.demo.entity.product_master;
import com.example.demo.jpaRepositary.product_masterRepository;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	@Service
	@Transactional
	public class product_masterService {
	 @Autowired
	 private product_masterRepository repo;
	 
	 public List<product_master> listAll() 
	 {
	 return repo.findAll();
	 }
	 
	 public void save(product_master product) 
	 {
	 repo.save(product);
	 }
	 
	 public product_master get(Integer id) 
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	 
	 
	 }
