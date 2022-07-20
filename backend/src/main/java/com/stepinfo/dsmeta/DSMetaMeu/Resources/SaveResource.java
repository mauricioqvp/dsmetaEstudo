package com.stepinfo.dsmeta.DSMetaMeu.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stepinfo.dsmeta.DSMetaMeu.Servicies.SaleService;
import com.stepinfo.dsmeta.DSMetaMeu.entity.Sale;

@RestController
@RequestMapping(value = "/sales")
public class SaveResource {

	@Autowired
	SaleService service;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue="") String minDate,
			@RequestParam(value="maxDate", defaultValue="") String maxDate, 
			Pageable pageable) {
		return service.findSales(minDate, maxDate, pageable);
	}
}
