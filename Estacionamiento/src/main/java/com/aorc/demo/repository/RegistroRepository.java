package com.aorc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aorc.demo.entity.tregistro;

@Repository
public interface RegistroRepository extends CrudRepository<tregistro, Long>{

	
}
