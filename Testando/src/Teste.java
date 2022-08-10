
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matricula matriculas = new Matricula();
		
		for(int i=0; i < 3; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do usuario: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuario: "));
		
			matriculas.inscreverUsuario(new Usuarios(nome, idade));
		}
		
		matriculas.apresentaListaDeMatriculados();
	
		JOptionPane.showMessageDialog(null, "Busque um matriculado!");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do usuario: "));
		JOptionPane.showMessageDialog(null, matriculas.buscaMatriculado(idade));
	}

}
