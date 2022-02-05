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
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
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
	
	
}
