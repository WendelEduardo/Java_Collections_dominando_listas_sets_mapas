package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {
	
	public static void main(String[] args) {
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(new Aula("Revisando os Arrays", 21));
		aulas.add(new Aula("Lista de Objetos", 20));
		aulas.add(new Aula("Relacionamentos de Listas e Objetos", 15));
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, 
				Comparator.comparing(Aula::getTempo)
		);
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}
	
}
