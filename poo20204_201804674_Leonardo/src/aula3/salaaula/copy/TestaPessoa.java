package aula3.salaaula.copy;

import java.util.Date;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome ("Jorley");
		p1.setDataNascimento (new Date());
		
		System.out.println("Dados da pessoa p1:");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Data Nascimento: " + p1.getDataNascimento());
		System.out.println("Espécie: " + p1.especie);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Alberto Roberto");
		System.out.println("Dados da pessoa p2:");
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Espécie: " + p2.especie);
	}
}
