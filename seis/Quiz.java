/*Classe Quiz, criada no dia 03/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada para realizar o quiz. 
 * Ela criará referências a objetos das classes Questao e Particpante para solucionar as questões
 * 
 * Essa classe terá o import da biblioteca Scanner para ler as variaveis a partir do teclado;
 * E ArrayList, para criar uma lista com as questões e fazer a sua impressão.
 * */

package questao.seis;

import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
	public static void main(String[] args) {
		
		String nomeParticipante;

		ArrayList<Questao> lista = new ArrayList<Questao>();
		Scanner scan = new Scanner(System.in);
		
		Questao q1 = new Questao("Quem venceu o último Super Bowl?", "Buccaneers", "Patriots", "Chiefs", "49ers", 1);
		Questao q2 = new Questao("Quem foi o MVP da última temporada?", "Tom Brady", "Patrick Mahomes", "Cam Newton", "Aaron Rodgers", 4);
		Questao q3 = new Questao("Qual desses jogadores não se aposentou ainda?", "Peyton Manning", "Andrew Luck", "Matt Ryan", "Tom Brady", 3);
		Questao q4 = new Questao("Quem possui mais titulos na era Super Bowl", "Patriots", "Peyton Manning", "Steelers", "Tom Brady", 4);
		
		int respostas[] = {q1.getGabarito(), q2.getGabarito(), q3.getGabarito(), q4.getGabarito()};
		
		lista.add(q1);
		lista.add(q2);
		lista.add(q3);
		lista.add(q4);
		
		System.out.println("Digite o seu nome: ");
		nomeParticipante = scan.next();
		
		Participante p = new Participante( nomeParticipante );
		//For para imprimir as questões e chamar o metodo verificarRespostas
		for(int i=0;i<4;i++) {
			System.out.println(lista.get(i));
			verificarRespostas(scan, p, i, respostas);
		}
	}
	
	/*Metodo verificarRespostas
	 * Irá verificar as respostas e será lançado uma exception caso a entrada seja inválida.
	 * 
	 * Caso seja válida, será realizado o switch case onde será adicionado ao vetor respostas da classe Participante e atualizando o valor de acertos e erros
	 * */
	
	public static void verificarRespostas(Scanner s, Participante par,int aux, int[] res) {
		 int num;
		 
		try {
			num = s.nextInt();
			
			switch(num) {
			
			case 1:
				par.getRespostas()[aux] = num;
				if (par.getRespostas()[aux] == res[aux]) {
					par.setAcertos(par.getAcertos()+1);
				}
				else {
					par.setErros(par.getErros()+1);
				}
			break;
			
			case 2:
				par.getRespostas()[aux] = num;
				if (par.getRespostas()[aux] == res[aux]) {
					par.setAcertos(par.getAcertos()+1);
				}
				else {
					par.setErros(par.getErros()+1);
				}
			break;
			
			case 3:
				par.getRespostas()[aux] = num;
				if (par.getRespostas()[aux] == res[aux]) {
					par.setAcertos(par.getAcertos()+1);
				}
				else {
					par.setErros(par.getErros()+1);
				}
			break;
				
			case 4:
				par.getRespostas()[aux] = num;
				if (par.getRespostas()[aux] == res[aux]) {
					par.setAcertos(par.getAcertos()+1);
				}
				else {
					par.setErros(par.getErros()+1);
				}
			break;
			
			default:
				System.out.println("Resposta Inválida");
				verificarRespostas(s, par, aux, res);
			break;
			}
		} 
		catch(InvalidAnswerException ex){
			//throw new InvalidAnswerException("Resposta inválida");
			String msg = "Resposta Inválida";
			System.out.println("Exception " + msg);
			
		}		
	}
}

