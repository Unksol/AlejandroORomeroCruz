package com.aorc.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aorc.demo.entity.ttarifa;

@Repository
public interface TarifaRepository extends CrudRepository<ttarifa, Long> {

}
