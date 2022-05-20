package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	private String autor;
	private String tema;
	private int qtdPag;

	public Livro() {

	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	}

	@Override
	public double calcularImposto() {

		if (this.getTema().equalsIgnoreCase("educativo")) {
			System.out.print("Livro educativo não tem imposto: " + this.getNome() + ": ");
			return 0;
		} else {
			System.out.print("Imposto sobre o livro " + this.getNome() + " é: R$ ");
			return this.getPreco() * 0.10;
		}
	}
}
