package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame() {

	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calcularImposto() {

		System.out.println("Imposto sobre o console " + this.getNome() + " usado é: R$ " + this.getPreco() * 0.25);

		System.out.print("Imposto sobre o console " + this.getNome() + " é : R$ ");
		return this.getPreco() * 0.45;
	}

	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareToIgnoreCase(o.getNome());
	}

}
