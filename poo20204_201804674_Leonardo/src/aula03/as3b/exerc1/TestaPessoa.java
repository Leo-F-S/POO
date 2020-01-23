package aula03.as3b.exerc1;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Leonardo");
		p1.setNascimento("14/12/1997");
		p1.setAno(1997);
		p1.setAltura(1.82);
		p1.calculaIdade();
		
		System.out.println("Dados do Cliente: " + p1.toString());
	}

}
