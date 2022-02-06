package questao.oito;

public class Funcionario {
	private String nome;
	private double salario, alteracaoSalario, salarioLiquido;
	
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
	public double getAlteracaoSalario(double alteracaoSalario) {
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
	
	
}
