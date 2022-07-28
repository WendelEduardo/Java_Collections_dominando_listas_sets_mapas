package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Dominando as Coleções do Java", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

		Aluno a1 = new Aluno("Rodrigo Turini", 346712);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos alunos matriculados: ");
		//javaColecoes.getAlunos().forEach(alunos -> System.out.println(alunos));
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

		System.out.println("O "+ a1+ " está matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
	
		Aluno turini = new Aluno("Rodrigo Turini", 346712);
		System.out.println(a1.equals(turini));
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
	}

}
