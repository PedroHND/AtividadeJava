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

import questao.seis.Questao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario user1 = new Usuario("Pedro", "20221", "Jub2022");
		Usuario user2 = new Usuario("Julia", "20222", "ju09202210");
		Usuario user3 = new Usuario("João", "20223", "Jo2022ao");
		Usuario user4 = new Usuario("Heloisa", "20224", "Hel0905");
		Usuario user5 = new Usuario("Marcos", "20225", "Mar2022");
		Usuario user6 = new Usuario("Matheus", "20226", "M2022");
		
		String nome, senha;
		int pos = 0;
		
		Calendar cal =  Calendar.getInstance();
		Scanner scan =  new Scanner(System.in);
		int hora = cal.get(Calendar.HOUR_OF_DAY);
		
		lista.add(user1);
		lista.add(user2);
		lista.add(user3);
		lista.add(user4);
		lista.add(user5);
		lista.add(user6);
		
		System.out.println("Digite o seu usuário:");
		nome = scan.next();
		System.out.println("Digite a sua senha:");
		senha = scan.next();
		for(int i= 0; i < lista.size() ; i++) {
			if (lista.get(i).equals(nome)) {
				pos = i;
				break;
			}
			
		}
		
		Usuario user = lista.get(pos);
		
		//função que verifica se o login do usuário está correto 
		
		if (user.getNomeLogin().equals(nome) && user.getSenha().equals(senha)) {
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
