package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Dominando as Coleções do Java", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
