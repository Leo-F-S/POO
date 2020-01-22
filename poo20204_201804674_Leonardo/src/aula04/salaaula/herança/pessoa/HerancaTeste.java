package aula04.salaaula.heran�a.pessoa;

public class HerancaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Cliente("Carlos", "Goi�nia", "3521-1181",
				"191", "Solteiro", "Masculino",
				5000.0, "Professor");
		
			System.out.println("Dados do Cliente: " + pessoa.toString());
			
			if(pessoa instanceof Cliente) {
				Cliente c = (Cliente) pessoa;
				c.adicionaInteresse("Futebol");
				c.adicionaInteresse("Literatura");
				c.adicionaInteresse("Politica");
				String algumInteresse = c.consultaInteresse("Futebol");
				if(algumInteresse != null) {
					System.out.println(algumInteresse);
				}else {
					System.out.println("Interesse n�o encontrado!");
				}
				
				System.out.println(c.getInteresses().toString());
				
				c.removeInteresse("Futebol");
				System.out.println(c.getInteresses().toString());
			}
	}
}
