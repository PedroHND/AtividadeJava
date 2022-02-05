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
		
		Usuario user = new Usuario("Pedro", "JuB2022");
		String nome, senha;
		
		
		Calendar cal =  Calendar.getInstance();
		Scanner scan =  new Scanner(System.in);
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		String senhaUser = user.getSenha();
		
		System.out.println("Digite o seu usuário:");
		nome = scan.next();
		System.out.println("Digite a sua senha:");
		senha = scan.next();
		
		//função que verifica se o login do usuário está correto 
		if (user.getNome().equals(nome) && user.getSenha().equals(senha)) {
			if (hora >= 6 && hora<12) {
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			}
			else if(hora >= 12 && hora <18) {
				System.out.println("Boa tarde, você se logou ao nosso sistema.");
			}
			else if(hora >= 18 && hora <=23) {
				System.out.println("Boa noite, você se logou ao nosso sistema.");
			}
			else {
				System.out.println("Boa madrugada, você se logou ao nosso sistema.");
			}
		}
		else {
			throw new InvalidLoginException("Usuário e/ou senha incorretos");
		}
		
		

	}

}
