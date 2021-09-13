package br.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaleMaisRepository extends CrudRepository<PlanoFaleMais, Long> {

}
