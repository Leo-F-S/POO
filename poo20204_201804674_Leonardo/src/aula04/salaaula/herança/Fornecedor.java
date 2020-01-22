package aula04.salaaula.herança;

public class Fornecedor extends PessoaJuridica{
	String produto;
	
	public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produto) {
		super(nome,endereco,telefone,cnpj,razaoSocial);
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nProduto do Fornecedor: " + this.getProduto());
		return sb.toString();
	}
}
