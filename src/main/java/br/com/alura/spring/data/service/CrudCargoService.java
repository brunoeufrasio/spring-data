package br.com.alura.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.entidades.Cargo;
import br.com.alura.spring.data.repositorios.CargoRepositorio;

@Service
public class CrudCargoService {
	private final CargoRepositorio cargoRepositorio;

	public CrudCargoService(CargoRepositorio cargoRepositorio) {
		this.cargoRepositorio = cargoRepositorio;
	}
	
	public void inicial(Scanner scanner) {
		salvar(scanner);		
	}
	
	private void salvar(Scanner scanner) {
		System.out.println("Descrição do cargo: ");
		String descricao = scanner.next();
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);
		cargoRepositorio.save(cargo);
		System.out.println("Cargo salvo");
	}
	
	
	

}
