package aula03.as3b.exerc2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private int posicao;
	private List<Contato>contatos;
	
	public Agenda(int posicao) {
		this.posicao = posicao;
		this.contatos = new ArrayList<Contato>();
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nPosição: " + this.getPosicao());
		sb.append("\nDados do contato: " + this.getContatos());
		return sb.toString();
	}
	

	public void adicionaContato(Contato c) {
		this.contatos.add(c);
	}
	
	public Contato consultaContato(String nome) {
		Contato novoContato = null;
		for(Contato c : this.contatos) {
			if(c.getNome().equals(nome)) {
				novoContato = c;
			}
		}
		return novoContato;
	}
	
	public void removeContato(Contato c) {
		this.contatos.remove(c);
	}

}
