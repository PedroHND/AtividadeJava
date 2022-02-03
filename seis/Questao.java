/*Classe Questão, criada no dia 03/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada na criação de questões do quiz.
 * 
 * */

package questao.seis;

public class Questao {
	private String pergunta;
	private String resposta1, resposta2, resposta3, resposta4;
	private  int opcao[] = {1,2,3,4};
	private  int gabarito;
	

	
	public Questao(String pergunta, String resposta1, String resposta2, String resposta3, String resposta4,int gabarito) {
		
		this.pergunta = pergunta;
		this.resposta1 = resposta1;
		this.resposta2 = resposta2;
		this.resposta3 = resposta3;
		this.resposta4 = resposta4;
		this.gabarito = gabarito;
	}
	
	
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta1() {
		return resposta1;
	}
	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}
	public String getResposta2() {
		return resposta2;
	}
	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}
	public String getResposta3() {
		return resposta3;
	}
	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}
	public String getResposta4() {
		return resposta4;
	}
	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}
	public int[] getOpcao() {
		return opcao;
	}
	public void setOpcao(int[] opcao) {
		this.opcao = opcao;
	}
	public int getGabarito() {
		return gabarito;
	}
	public void setGabarito(int gabarito) {
		this.gabarito = gabarito;
	}

	@Override
	public String toString() {
		return "Questão: \n"
				+ getPergunta() +"\n" 
				+"Resposta 1: " + getResposta1() +"\n"
				+"Resposta 2: " + getResposta2() +"\n"
				+"Resposta 3: " + getResposta3() +"\n"
				+"Resposta 4: " + getResposta4() +"\n"
				+ "Digite o número referente a resposta que você acha que está correta.";
	}
	
}
