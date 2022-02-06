package questao.oito;

public class Funcionario {
	private String nome;
	private float salario, alteracaoSalario, salarioLiquido;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getAlteracaoSalario() {
		return alteracaoSalario;
	}
	private void setAlteracaoSalario(float alteracaoSalario) {
		if(salario <= 1000) {
			this.alteracaoSalario = alteracaoSalario;
		}
		
		this.alteracaoSalario = alteracaoSalario;
	}
	public float getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	
}
