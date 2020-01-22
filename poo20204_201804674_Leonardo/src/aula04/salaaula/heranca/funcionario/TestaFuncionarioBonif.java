package aula04.salaaula.heranca.funcionario;

public class TestaFuncionarioBonif {
	public static void main(String[] args) {
		FuncionarioB f = new FuncionarioB("Carlos", "191", 1000.00d);
		
		FuncionarioB g = new Gerente("Antonio carlos", "123", 2000.00d);
		
		System.out.println("Valor do salario do funcionario sem bonificação: " + f.getSalario());
		System.out.println("Valor do salario do funcionario com bonificação: " + f.calcularBonificacao());
		System.out.println("Valor do salario do Gerente sem bonificação: " + g.getSalario());
		System.out.println("Valor do salario do Gerente com bonificação: " + g.calcularBonificacao());
		
	}
}
