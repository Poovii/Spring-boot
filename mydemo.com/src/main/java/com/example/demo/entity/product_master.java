package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class product_master {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	//public void setId(int id) {
		//this.id = id;
	//}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public product_master() {
		super();
		//TODO Auto-generated constructor stub
	}
	public product_master( String name, int price) {
		super();
		//this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product_master [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}