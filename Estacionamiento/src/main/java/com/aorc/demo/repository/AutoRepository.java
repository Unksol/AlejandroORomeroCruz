package com.aorc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aorc.demo.entity.tauto;

@Repository
public interface AutoRepository extends CrudRepository<tauto, Long>{

}
