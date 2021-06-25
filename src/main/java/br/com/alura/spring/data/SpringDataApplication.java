package br.com.alura.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.spring.data.entidades.Cargo;
import br.com.alura.spring.data.repositorios.CargoRepositorio;
import br.com.alura.spring.data.service.CrudCargoService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{
	public boolean system = true;
	
	private final CrudCargoService  crudCargoService;
	
	public SpringDataApplication(CrudCargoService crudCargoService) {
		this.crudCargoService = crudCargoService;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
	
	@Override
	public void  run(String... args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		while(system) {
			System.out.println("Qual ação você quer executar?");
			System.out.println("0 - Sair ou 1 - continuar");
			System.out.println("1 - continuar");
			
			int acao = scanner.nextInt();
			if (acao == 1) {
				crudCargoService.inicial(scanner);				
			}else {
				system = false;				
			}
		}
		

		
	
		
	}
}
