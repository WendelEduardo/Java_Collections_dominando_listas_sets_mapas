package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso javaColecoes = new Curso("Dominando as Cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Dominando as Cole��es do Java", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Cole��es", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 346712);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem � o aluno com matricula 5617?");	
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println(aluno);
		
		// Map<Integer, Set<Aluno>> matriculaParaAlunos = new HashMap<>();
	}

}
