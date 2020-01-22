package aula04.salaaula.heran�a;

public class PessoaJuridica extends Pessoa{
	String cnpj;
	String razaoSocial;
	String produto;
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
		super(nome,endereco,telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCNPJ da Pessoa Juridica: " + this.getCnpj());
		sb.append("\nRazao Social da Pessoa Juridica: " + this.getRazaoSocial());
		return sb.toString();
	}
}
