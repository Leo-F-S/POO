package aula06.salaaula.endereco;

public class EnderecoTeste {

	public static void main(String[] args) {
		
		Pais pais = new Pais("Brasil");
		Estado estado = new Estado("GO", "Goias", pais);		
		@SuppressWarnings("deprecation")
		Municipio municipio = new Municipio(new Long(25300), "Goiânia", estado);
		Bairro bairro = new Bairro("Central", "Setor Central", municipio);
		Logradouro log = new Logradouro("Paranaiba", TipoLogradouro.AVENIDA);
		Endereco end = new Endereco("125", "qd, 45 lt. 26A", 74135967, "Residencial", bairro, log);
		
		System.out.println(end.toString());
	}

}
