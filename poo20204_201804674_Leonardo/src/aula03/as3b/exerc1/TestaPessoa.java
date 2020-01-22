package aula03.as3b.exerc1;

import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Leonardo");
		p1.setDataNascimento(new Date());
		p1.setAltura(1.82);
		
		System.out.println("Dados da pessoa p1:");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Data Nascimento: " + p1.getDataNascimento());
		System.out.println("Altura: " + p1.getAltura());
	}

}
