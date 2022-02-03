package questao.seis;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		String nomeParticipante;
		
		Scanner scan = new Scanner(System.in);
		
		Questao q1 = new Questao("Quem venceu o último Super Bowl?", "Buccaneers", "Patriots", "Chiefs", "49ers", 1);
		Questao q2 = new Questao("Quem foi o MVP da última temporada?", "Tom Brady", "Patrick Mahomes", "Cam Newton", "Aaron Rodgers", 4);
		Questao q3 = new Questao("Qual desses jogadores não se aposentou ainda?", "Peyton Manning", "Andrew Luck", "Matt Ryan", "Tom Brady", 3);
		Questao q4 = new Questao("Quem possui mais titulos na era Super Bowl", "Patriots", "Peyton Manning", "Steelers", "Tom Brady", 4);
		
		System.out.println("Digite o seu nome: ");
		nomeParticipante = scan.next();
		
		Participante p = new Participante( nomeParticipante );
		
	}
	
}

