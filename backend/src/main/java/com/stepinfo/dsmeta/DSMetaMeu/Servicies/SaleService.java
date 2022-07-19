package com.stepinfo.dsmeta.DSMetaMeu.Servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stepinfo.dsmeta.DSMetaMeu.entity.Sale;
import com.stepinfo.dsmeta.DSMetaMeu.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository repository;
	
	public List<Sale> findAll() {
		return repository.findAll();
	}
}
