package com.aorc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aorc.demo.entity.tregistro;
import com.aorc.demo.repository.RegistroRepository;

@Service
public class RegistroServiceImpl implements RegistroService {

	@Autowired
	RegistroRepository repository;
	
	@Override
	public Iterable<tregistro> getAlltregistro() {
		return repository.findAll();
	}

}
