package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Wendel Eduardo");
		alunos.add("Leticia França");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Rodrigro Turini");
			
		alunos.remove("Sergio Lopes");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos.size());
		System.out.println(alunos.contains("Wendel Eduardo"));
		
		//List<String> alunosEmLista = new ArrayList<String>(alunos);
		//System.out.println(alunosEmLista);
	}

}
