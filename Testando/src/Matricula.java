import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.swing.JOptionPane;

public class Matricula {
	
	private Usuarios usuario;
	private Set<Usuarios> listaDeUsuarios = new HashSet<Usuarios>();
	private Map<Integer, Usuarios> listaDeBusca = new HashMap<>();
	
	public void inscreverUsuario(Usuarios usuario) {
		listaDeUsuarios.add(usuario);
		listaDeBusca.put(usuario.getIdade(), usuario);
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public Set<Usuarios> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public Map<Integer, Usuarios> getListaDeBusca() {
		return listaDeBusca;
	}
	
	public Usuarios buscaMatriculado(int idade) {
		if(!listaDeBusca.containsKey(idade)) {
			throw new NoSuchElementException("Deu errooo");
		}
		
		return listaDeBusca.get(idade);
	}
	
	public void apresentaListaDeMatriculados() {
		getListaDeUsuarios().forEach(c -> JOptionPane.showMessageDialog(null, c));
	}
	
}
