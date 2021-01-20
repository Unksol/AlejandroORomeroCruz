package com.aorc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aorc.demo.entity.ttarifa;
import com.aorc.demo.repository.TarifaRepository;

@Service
public class TarifaServiceImpl implements TarifaService {
	
	@Autowired
	TarifaRepository repository;

	@Override
	public Iterable<ttarifa> getAllttarifa() {
		return repository.findAll();
	}
	
}
