/*Classe Quiz, criada no dia 03/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada para realizar o quiz. 
 * Ela criará referências a objetos das classes Questao e Particpante para solucionar as questões
 * 
 * */

package questao.seis;

import java.util.Scanner;
import java.util.function.Consumer;
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
		
		lista.add(q1);
		lista.add(q2);
		lista.add(q3);
		lista.add(q4);
		
		System.out.println(lista.get(0));
		
		System.out.println("Digite o seu nome: ");
		nomeParticipante = scan.next();
		
		Participante p = new Participante( nomeParticipante );
		
		
	}
	
}

