package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class MainDesafio01 {
	public static void main(String[] args) {
		Veiculo vei = new Veiculo();

		
		  System.out.println("----------Posto de Gasolina-------------\n");
		  vei.abastecer(30);
		  
		  System.out.println("----------Posto de Gasolina-------------\n");
		  vei.abastecer(1);
		  
		  System.out.println("----------Posto de Gasolina-------------\n");
		  vei.abastecer(40);
		  
		  System.out.println("----------Posto de Gasolina-------------\n");
		  vei.abastecer(1);
		

		vei.setVelocidade(20);
		// vei.frear();

		vei.pintar("vermelho");

		// vei.setLigado(true);
		vei.ligar();

		vei.desligar();
	}
}
