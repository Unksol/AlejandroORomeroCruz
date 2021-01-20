package com.aorc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aorc.demo.entity.tauto;
import com.aorc.demo.repository.AutoRepository;

@Service
public class AutoServiceImpl implements AutoService {

	@Autowired
	AutoRepository repository;
	
	@Override
	public Iterable<tauto> getAlltauto() {
		return repository.findAll();
	}

}
