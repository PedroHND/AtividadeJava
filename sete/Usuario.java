/*Classe Usuario, criada no dia 05/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada na criação de um usuário e será logada na classe main.
 * 
 * */

package questao.sete;

public class Usuario {
	private String nome;
	private String senha;
	private String matricula;
	private String nomeLogin = nome + matricula;
	
	public Usuario(String nome, String matricula, String senha) {
		this.nome = nome;		
		this.matricula = matricula;
		this.senha = senha;
	}
	
	public String getNomeLogin() {
		return nome + matricula;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return getNomeLogin();
	}
}
