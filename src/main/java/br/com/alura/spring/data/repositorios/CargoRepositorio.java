package br.com.alura.spring.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.spring.data.entidades.Cargo;

@Repository
public interface CargoRepositorio extends CrudRepository<Cargo, Integer>{

}
