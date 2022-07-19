package com.stepinfo.dsmeta.DSMetaMeu.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String seller_name;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {
		super();
	}

	public Sale(String seller_name, Integer visited, Integer deals, Double amount, LocalDate date) {
		super();
		this.seller_name = seller_name;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
	}
}
