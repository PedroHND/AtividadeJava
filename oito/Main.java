/*Classe Main, criada no dia 03/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que ser� utilizada para ver a quantidade de funcionarios e calcular sua bonificacao ou desconto a partir das regras j� definidas na classe funcionario.
 * */

package questao.oito;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		Scanner scan = new Scanner(System.in);
		
		String nome;
		double salario;
		int numFuncionarios;
		
		System.out.println("Digite o n�mero de funcion�rios que voc� deseja ver o relat�rio salarial");
		numFuncionarios = scan.nextInt();
		
		for(int i = 1; i<=numFuncionarios; i++) {
			System.out.println("Digite o nome do Funcion�rio");
			nome = scan.next();
			System.out.println("Digite o valor(Apenas os n�meros) do sal�rio do funcion�rio " + nome);
			salario = scan.nextDouble();
			Funcionario fun = new Funcionario(nome, salario);
			lista.add(fun);
			System.out.println("Funcionario "+ i + " de "+numFuncionarios +" adicionado");
		}
		
		for(int j = 0; j<numFuncionarios; j++) {
			System.out.println(lista.get(j));
		}
		
	}

}
