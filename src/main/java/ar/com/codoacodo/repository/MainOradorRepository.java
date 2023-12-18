package ar.com.codoacodo.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {


	public static void main(String[] args) {


		

		OradorRepository repository = new MySqlOradorRepository();
		

		
		Orador sergio =repository.getById(11L);
		
		sergio.setApellido("Ortega");
		sergio.setNombre("Marcelo");
		sergio.setTema("JAVA");
		
		repository.update(sergio);
		

		
		System.out.println(repository.findAll());
		
		
	}
}
