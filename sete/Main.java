/*Classe Main, criada no dia 05/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada para realizar o login dos usuários e retornar uma mensagem de acordo com o resultado e a hora.
 * 
 * */

package questao.sete;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Usuario user = new Usuario("Pedro", "2022");
		String nome, senha;
		
		
		Calendar cal =  Calendar.getInstance();
		Scanner scan =  new Scanner(System.in);
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("Digite o seu usuário:");
		nome = scan.next();
		System.out.println("Digite a sua senha:");
		senha = scan.next();
		
		if ((user.getSenha() != senha) || (user.getNome() != nome)) {
			throw new InvalidLoginException("Usuário e/ou senha incorretos");
		}
		
		

	}

}
