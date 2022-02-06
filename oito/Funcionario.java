package questao.oito;

public class Funcionario {
	private String nome, modoDeAlteracao;
	
	public String getModoDeAlteracao() {
		return modoDeAlteracao;
	}
	public void setModoDeAlteracao(String modoDeAlteracao) {
		this.modoDeAlteracao = modoDeAlteracao;
	}
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
			setModoDeAlteracao("Bônus:          ");
		}
		else {
			salarioLiquido = salario - alteracaoSalario;
			setModoDeAlteracao("Desconto:       ");
		}
		return salarioLiquido;
		
	}
	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	@Override
	public String toString() {
		return "Funcionario:     " + getNome() + "\n"+
				"Salário:        "+ getSalario() + "\n"+
				getModoDeAlteracao() + getAlteracaoSalario() + "\n"+
				"Salario Liquido:" + getSalario();
	}
	
	
	
}
