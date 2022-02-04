/*Classe Participante, criada no dia 03/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada na criação de um participante e resolverá as questões do quiz.
 * 
 * */

package questao.seis;

public class Participante {
	private String nome;
	private int palpite;
	private int respostas[] = new int [4];
	private int acertos, erros;	
	
	
	public Participante(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPalpite() {
		return palpite;
	}
	public void setPalpite(int palpite) {
		this.palpite = palpite;
	}
	public int[] getRespostas() {
		return respostas;
	}
	public void setRespostas(int[] respostas) {
		this.respostas = respostas;
	}
	public int getAcertos() {
		return acertos;
	}
	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}
	public int getErros() {
		return erros;
	}
	public void setErros(int erros) {
		this.erros = erros;
	}

	@Override
	public String toString() {
		return "Participante: " + getNome() + "\n"
				+"Acerto(s):   " + getAcertos() + "\n"
				+"Erro(s):     " + getAcertos() + "\n";
				
		
	}
}
