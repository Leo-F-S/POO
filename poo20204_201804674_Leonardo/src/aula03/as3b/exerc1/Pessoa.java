package aula03.as3b.exerc1;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private int calculaIdade() {
		return (1+1);
	}
}
