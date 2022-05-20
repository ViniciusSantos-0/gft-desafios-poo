package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.desafio04.Pessoa;

public class MainDesafio06 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Jão", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);

		List<Pessoa> pLista = new ArrayList<>();
		pLista.add(p1);
		pLista.add(p2);
		pLista.add(p3);
		pLista.add(p4);

		System.out.println("  Lista completa  ");
		System.out.printf("%s%12s\n", " _______", " ________ ");
		System.out.printf("%s%10s\n", "|  Nome", "  |  Idade  |");
		System.out.printf("%s%1s\n", "|------- |", " --------|");
		for (Pessoa p : pLista) {
			System.out.printf("|%s | %d    | \n", p.getNome(), p.getIdade());
		}
		System.out.printf("%s%1s\n", "|--------", "|---------\n|");

		// --------------------------------------------------------------\\

		System.out.println(" Pessoa Encontrada   ");
		System.out.printf("%s%12s\n", " _______", " ________ ");
		System.out.printf("%s%10s\n", "|  Nome", "  |  Idade  |");
		System.out.printf("%s%1s\n", "|------- |", " --------|");
		for (Pessoa p : pLista) {
			if (p.getNome().contains("Jessica")) {
				System.out.printf("|%s | %d    | \n", p.getNome(), p.getIdade());
			}
		}
		System.out.printf("%s%1s\n", "|--------", "|---------\n|");
	}
}
