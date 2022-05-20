package br.com.gft.main;

import br.com.gft.model.Guerreiro;
import br.com.gft.model.Mago;
import br.com.gft.model.Personagem;

public class MainDesafio03 {
	public static void main(String[] args) {

		Mago mago = new Mago();

		mago.setNome("Joana");
		mago.setVida(300);
		mago.setMana(600);
		mago.setXp(0);
		mago.setInteligencia(15);
		mago.setForca(3);
		mago.setLevel(0);

		mago.lvlUp();
		mago.aprenderMagia("Bola de fogo");

		mago.attack();

		// -------------------------------------------------------------------\\
		Guerreiro guerreiro = new Guerreiro();

		guerreiro.setNome("Vall");
		guerreiro.setVida(600);
		guerreiro.setMana(300);
		guerreiro.setXp(0);
		guerreiro.setInteligencia(5);
		guerreiro.setForca(20);
		guerreiro.setLevel(0);

		guerreiro.lvlUp();
		guerreiro.attack();

		System.out.println("Total de Personagens criados: " + Personagem.totalPerson);

	}
}
