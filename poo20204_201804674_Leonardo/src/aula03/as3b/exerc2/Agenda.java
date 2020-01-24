package aula03.as3b.exerc2;

import java.util.List;

public abstract class Agenda {
	private List<Contato>contatos;
	
	public static void main(String[] args) {
		
		
		Contato c1 = new Contato("Jubileu", 1990, 1.93);
		
		
		System.out.println("Dados da Pessoa: " + c1.toString());
	}

}
