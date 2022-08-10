
public class Usuarios {

	private String nome;
	private int idade;
	
	public Usuarios(String nome, int idade) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}
		if(idade == 0) {
			throw new NullPointerException("Idade não pode ser nulo");
		}
		
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Idade: " + idade + "\n";
		return aux;
	}
	
}
