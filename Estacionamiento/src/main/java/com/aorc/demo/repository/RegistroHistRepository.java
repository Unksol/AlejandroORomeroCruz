package com.aorc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aorc.demo.entity.tRegistroHist;

@Repository
public interface RegistroHistRepository extends CrudRepository<tRegistroHist, Long>{

}
