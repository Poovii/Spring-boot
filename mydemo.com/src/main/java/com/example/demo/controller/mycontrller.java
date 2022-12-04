package com.example.demo.controller;



import java.util.*;

import com.example.demo.entity.product_master;
import com.example.demo.service.product_masterService;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class mycontrller
{
 @Autowired
 private product_masterService service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/products")
 public List<product_master> list() 
 {
 return service.listAll();
 }
 @GetMapping("/products/{id}")
 public ResponseEntity<product_master> get(@PathVariable Integer id) 
 {
 try
 {
 product_master product = service.get(id);
 return new ResponseEntity<product_master>(product, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<product_master>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/products")
 public void add(@RequestBody product_master product) 
 {
 service.save(product);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/products/{id}")
 public ResponseEntity<?> update(@RequestBody product_master product, @PathVariable Integer id) 
 {
 try
 {
 product_master existProduct = service.get(id);
 service.save(product);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/products/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
 }



