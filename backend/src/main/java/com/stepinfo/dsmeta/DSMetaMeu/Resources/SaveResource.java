package com.stepinfo.dsmeta.DSMetaMeu.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stepinfo.dsmeta.DSMetaMeu.Servicies.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaveResource {

	@Autowired
	SaleService service;
	
	@GetMapping
	public void findAll() {
		service.findAll();
	}
}
