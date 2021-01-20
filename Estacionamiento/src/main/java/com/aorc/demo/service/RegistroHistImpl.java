package com.aorc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aorc.demo.entity.tRegistroHist;
import com.aorc.demo.repository.RegistroHistRepository;

@Service
public class RegistroHistImpl implements RegistroHistService{

	@Autowired
	RegistroHistRepository repository;
	
	@Override
	public Iterable<tRegistroHist> getAlltregistrohist() {
		return repository.findAll();
	}

	
}
