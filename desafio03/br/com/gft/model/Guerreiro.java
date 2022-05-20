package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

	static String test;
	private List<String> habilidade;

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

	@Override
	public void lvlUp() {

		System.out.println("------------ Status Classe Guerreiro -------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Level: " + getLevel());
		System.out.println("Vida : " + getVida());
		System.out.println("Força: " + getForca());
		System.out.println("Inteligência: " + getInteligencia());
		System.out.println("Mana: " + getMana());
		System.out.println("XP: " + getXp());
		System.out.println("----------------------------------------------\n");

		setVida(getVida() + 200);
		setLevel(getLevel() + 1);
		setXp(getXp() + 500);
		setForca(getForca() + 100);
		setInteligencia(getInteligencia() + 7);
		setMana(getMana() + 10);

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

		int dano = (this.getForca() * this.getLevel()) + radon.nextInt(300);

		System.out.println("-----------Atacando com a espada!--------------");
		System.out.println("Dano causado: " + dano);
		System.out.println("--------------------------------------------\n");
	}

	public void aprenderHabilidade(String s) {

	}
}
