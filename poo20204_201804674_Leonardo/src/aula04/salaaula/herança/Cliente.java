package aula04.salaaula.herança;

public class Cliente extends PessoaFisica{
	private double renda;
	private String interesses;
	private String profissao;
	
	public Cliente(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo, double renda,
			String interesses, String profissao) {
		super(nome,endereco,telefone,cpf,estadoCivil,sexo);
		this.renda = renda;
		this.interesses = interesses;
		this.profissao = profissao;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getInteresses() {
		return interesses;
	}

	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nRenda do Cliente: " + this.getRenda());
		sb.append("\nInteresses do Cliente: " + this.getInteresses());
		sb.append("\nProfissao do Cliente: " + this.getProfissao());
		return sb.toString();
	}
}
