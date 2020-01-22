package aula04.salaaula.heranca.funcionario;

public class FuncionarioB {
	private String nome;
	private String cpf;
	private double salario;
	
	FuncionarioB(){}
	
	FuncionarioB(String n, String c, double s){
		this.nome = n;
		this.cpf = c;
		this.salario = s;
	}
	
	public double calcularBonificacao() {
		return this.salario *= 1.10;
	}
	
	public double getSalario() {
		return salario;
	}
}
