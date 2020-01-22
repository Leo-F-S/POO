package aula03.as3b.exerc1;

import java.util.Calendar;

public class Pessoa {
	private String nome;
	private String nascimento;
	private double altura;
	private int ano;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	int anoAtual=(Calendar.getInstance().get(Calendar.YEAR));
	public int calculaIdade() {
		return (anoAtual-ano);
	}
	
}
