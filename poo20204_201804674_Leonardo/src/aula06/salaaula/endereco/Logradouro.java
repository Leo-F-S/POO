package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Logradouro {
	private String nome;
	private TipoLogradouro tipo;
	private List<Endereco>enderecos;
	
	public Logradouro(String nome, TipoLogradouro tipo) {
		this.nome = nome;
		this.tipo = tipo;
		this.enderecos = new ArrayList<Endereco>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoLogradouro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLogradouro tipo) {
		this.tipo = tipo;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	
}
