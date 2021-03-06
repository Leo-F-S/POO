package aula03.as3b.exerc2;

import java.util.Calendar;

public class Contato{
	private String nome;
	private int idade;
	private double altura;
	private int ano;
	
	public Contato(String n, int ano, double a) {
		this.nome = n;
		this.altura = a;
		this.ano = ano;
	}
	
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
