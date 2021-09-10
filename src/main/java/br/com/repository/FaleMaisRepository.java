package br.com.repository;

import br.com.entity.PlanoFaleMais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FaleMaisRepository extends CrudRepository<PlanoFaleMais, Long> {

}
