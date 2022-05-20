package br.com.gft.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

public class MainDesafio02 {

	public static void main(String[] args) {

		Livro livro1 = new Livro("O Chamado de Cthulhu", 10, 7, "H.P. Lovecraft", "Terror", 64);
		Livro livro2 = new Livro("Resident Evil volume 1", 60, 4, "S. D. Perry", "Terror", 232);
		Livro livro3 = new Livro("Desbravando java", 70, 10, "Turini, Rodrigo", "educativo", 225);
		Livro livro4 = new Livro("Meditações", 40, 2, "Marco Aurélio", "Filosofia", 160);

		// ----------------------------------------------------------------------------------------------\\

		VideoGame game1 = new VideoGame("Xbox 360", 600, 2, "Microsoft", "Elite", true);
		VideoGame game2 = new VideoGame("Ps3", 800, 7, "Sony", "Slim", false);
		VideoGame game3 = new VideoGame("Ps5", 5000, 1, "Sony", "Black", false);
		VideoGame game4 = new VideoGame("Nintendo wii", 800, 10, "Nintendo", "Black", true);

		// ----------------------------------------------------------------------------------------------\\

		System.out.println("--------------- Impostos ----------------\n");
		System.out.println(livro2.calcularImposto());
		System.out.println(livro3.calcularImposto());
		System.out.println(game1.calcularImposto());
		System.out.println();

		// ------------------------------------------Livro----------------------------------------------------\\

		List<Livro> l = new ArrayList<Livro>();
		l.add(livro1);
		l.add(livro2);
		l.add(livro3);
		l.add(livro4);

		Collections.sort(l);

		// -------------------------------------------Video Game
		// ---------------------------------------------------\\

		List<VideoGame> v = new ArrayList<VideoGame>();

		v.add(game1);
		v.add(game2);
		v.add(game3);
		v.add(game4);

		Collections.sort(v);

		// -------------------------------------------------Loja---------------------------------------------\\
		Loja loja = new Loja();

		loja.setLivro(l);
		loja.listaLivros();

		loja.setVideoGame(v);
		loja.listaVideosGames();

		System.out.println("-------------Patrimonio-----------------\n");
		System.out.printf("Patrimonio da loja: R$ %.2f \n\n", loja.calculaPatrimonio());

	}
}
