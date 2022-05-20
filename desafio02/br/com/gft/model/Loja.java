package br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livro;
	private List<VideoGame> videoGame;

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livro, List<VideoGame> videoGame) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livro = livro;
		this.videoGame = videoGame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome; 
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public List<VideoGame> getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}

	public void listaLivros() {
		System.out.println("------------- Livros --------------\n");
		if (!this.getLivro().isEmpty()) {
			for (Livro l : getLivro()) {
				System.out.println("Título: " + l.getNome());
				System.out.println("Autor: " + l.getAutor());
				System.out.println("Tema: " + l.getTema());
				System.out.println("Quantidade de páginas: " + l.getQtdPag());
				System.out.printf("Preço: R$ %.2f \n", l.getPreco());
				System.out.println("Quantidade no estoque: " + l.getQtd() + " \n");
				System.out.println("-----------------------------------\n");
			}
		} else {
			System.out.println("Não temos livros no momento, por gentileza volte outro dia");
		}
	}

	public void listaVideosGames() {
		System.out.println("------------- Video Games --------------\n");

		if (!this.getVideoGame().isEmpty()) {
			for (VideoGame v : getVideoGame()) {
				System.out.println("Nome: " + v.getNome());
				System.out.println("Marca: " + v.getMarca());
				System.out.println("Modelo: " + v.getModelo());
				System.out.println("Usado: " + (v.isUsado() ? "Sim" : "Não"));
				System.out.printf("Preço: R$ %.2f \n", v.getPreco());
				System.out.println("Quantidade no estoque: " + v.getQtd() + "\n");
				System.out.println("-----------------------------------\n");
			}
		} else {
			System.out.println("Não temos video games no momento, por gentileza aparecer outro dia!");
		}
	}

	public double calculaPatrimonio() {
		double pLivro = 0, pVideoGame = 0;

		for (Livro l : getLivro()) {
			pLivro += l.getPreco()*l.getQtd();
		}
		for (VideoGame v : getVideoGame()) {
			pVideoGame += v.getPreco()*v.getQtd();
		}

		return (pLivro + pVideoGame);
	}

}
