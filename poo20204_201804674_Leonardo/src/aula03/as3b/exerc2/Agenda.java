package aula03.as3b.exerc2;

public abstract class Agenda {

	public static void main(String[] args) {
		
		Contato c1 = new Contato();
		c1.setNome("Jubileu");
		c1.setAno(1990);
		c1.calculaIdade();
		c1.setAltura(1.93);
		
		System.out.println("Dados da Pessoa: " + c1.toString());
	}

}
