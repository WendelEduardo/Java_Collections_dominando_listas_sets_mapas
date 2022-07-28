package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.directory.NoSuchAttributeException;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public Curso(String nome, String instrutor) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas +", Tempo Total="+ getTempoTotal() +"]";
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void matricula(Aluno aluno) {
		alunos.add(aluno);
		matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.charAt(0);
	}

	public Aluno buscaMatriculado(int numeroMatricula) {
		if(!matriculaParaAluno.containsKey(numeroMatricula)) {
			throw new NoSuchElementException("");
		}
		
		return matriculaParaAluno.get(numeroMatricula);
		
	}
	
	
		
}
