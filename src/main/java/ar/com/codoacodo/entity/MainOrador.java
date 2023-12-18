package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {
	public static void main(String[] args ) {
		Orador nuevoOrador = new Orador("Marcelo","Ortega","smo@gmail.com","DIOS", LocalDate.now());
				System.out.println(nuevoOrador); 
	}

}
