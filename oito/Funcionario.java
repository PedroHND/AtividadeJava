/*Classe Funcionario, criada no dia 05/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que será utilizada para criar um funcionario.
 * */

package questao.oito;

public class Funcionario {
	private String nome, modoDeAlteracao;
	private double salario, alteracaoSalario, salarioLiquido;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
public String getModoDeAlteracao() {
		if (salario <=2000) {
			return "Bônus:";
		}
		else {
			return "Desconto:";
		}
	}
	public void setModoDeAlteracao(String modoDeAlteracao) {
		this.modoDeAlteracao = modoDeAlteracao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public double getAlteracaoSalario() {
		if(salario <= 1000) {
			alteracaoSalario = (salario * 0.2);
		}
		else {
			alteracaoSalario = (salario * 0.1);
		}
		return alteracaoSalario;
	}
	public void setAlteracaoSalario(float alteracaoSalario) {
		this.alteracaoSalario = alteracaoSalario;
	}
	
	public double getSalarioLiquido() {
		if(salario <= 2000) {
			salarioLiquido = salario + alteracaoSalario;
		}
		else {
			salarioLiquido = salario - alteracaoSalario;

		}
		return salarioLiquido;
		
	}
	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	@Override
	public String toString() {
		return "--------------------------------------------------- \n"
				+ "Funcionario(a):" + getNome() + "\n"+
				"Salário:"+ getSalario() + "\n"+
				getModoDeAlteracao() + getAlteracaoSalario() + "\n"+
				"Salario Liquido:" + getSalarioLiquido() +"\n"+
				"--------------------------------------------------- \n";
	}
	
	
	
}
