package br.com.gft.model;

public class Personagem {

	public static int totalPerson;
	private int persons;
	private String nome;
	private int vida;
	private float xp;
	private int mana;
	private int inteligencia;
	private int forca;
	private int level;

	public Personagem() {
		Personagem.totalPerson++;
	}

	public Personagem(int persons, String nome, int vida, float xp, int inteligencia, int forca, int level) {
		super();
		this.persons = persons;
		this.nome = nome;
		this.vida = vida;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int person) {
		this.persons = person;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void lvlUp() {

	}

}
