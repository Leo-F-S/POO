package aula04.salaaula.herança.pessoa;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String sexo;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, String telefone, String cpf, String estadoCivil, String sexo) {
		super(nome,endereco,telefone);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCPF da Pessoa Fisica: " + this.getCpf());
		sb.append("\nSexo da Pessoa Fisica: " + this.getSexo());
		sb.append("\nEstado Civil da Pessoa Fisica: " + this.getEstadoCivil());
		return sb.toString();
	}
}
