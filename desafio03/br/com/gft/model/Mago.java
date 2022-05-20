package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

	private List<String> magia;

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	@Override
	public void lvlUp() {

		System.out.println("------------ Status Classe Mago -------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Level: " + getLevel());
		System.out.println("Vida : " + getVida());
		System.out.println("Força: " + getForca());
		System.out.println("Inteligência: " + getInteligencia());
		System.out.println("Mana: " + getMana());
		System.out.println("XP: " + getXp());
		System.out.println("----------------------------------------------\n");

		setVida(getVida() + 5);
		setLevel(getLevel() + 1);
		setXp(getXp() + 500);
		setForca(getForca() + 2);
		setInteligencia(getInteligencia() + 30);
		setMana(getMana() + 50);

		System.out.println("------------ Level Up! lvl: " + getLevel() + " ----------------");
		System.out.println("Parabéns " + getNome() + " seus atributos foram melhorados:");
		System.out.println("Vida : " + getVida());
		System.out.println("Força: " + getForca());
		System.out.println("Inteligência: " + getInteligencia());
		System.out.println("Mana: " + getMana());
		System.out.println("XP: " + getXp());
		System.out.println("-----------------------------------------------");
	}

	public void attack() {

		Random radon = new Random();

		int dano = (this.getInteligencia() * this.getLevel()) + radon.nextInt(300);

		try {
			for (String m : getMagia()) {
				System.out.println("-----------Atacando Magia!--------------");
				System.out.println("Nome do Ataque: " + m);
				System.out.println("Dano causado: " + dano);
				System.out.println("--------------------------------------------\n");
			}
		} catch (NullPointerException e) {
			System.out.println("Ainda não aprendeu uma magia!");
			System.out.println("--------------------------------------------\n");
		}
	}

	public void aprenderMagia(String s) {
		List<String> magia = new ArrayList<>();
		magia.add(s);
		this.setMagia(magia);
		System.out.println("Aprendeu uma nova Magia: " + s);
	}

}
