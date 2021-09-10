package br.com.repository;

import br.com.entity.Tarifa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository extends CrudRepository<Tarifa, Long>{

}
