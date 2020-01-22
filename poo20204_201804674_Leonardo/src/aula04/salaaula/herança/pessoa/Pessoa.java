package aula04.salaaula.heran�a.pessoa;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;

	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("\nNome da Pessoa Fisica: " + this.getNome());
		sb.append("\nEndere�o da Pessoa Fisica: " + this.getEndereco());
		sb.append("\nTelefone da Pessoa Fisica: " + this.getTelefone());
		return sb.toString();
	}
}
	