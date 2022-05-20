package br.com.gft.main;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class MainDesafio07 {
	public static void main(String[] args) {
		
		Gerente ge = new Gerente();
		Supervisor su = new Supervisor();
		Vendedor ve = new Vendedor();
		
		ge.setSalario(10);
		su.setSalario(10);
		ve.setSalario(10);
		
		System.out.println("---------------Bonificação dos Funcionários----------------\n");
		System.out.println("Gerente ganha: "+ge.getSalario()+ " Com a Bonificação irá ganhar: "+ ge.bonificacao());
		System.out.println("Supervisor ganha: "+su.getSalario()+ " Com a Bonificação irá ganhar: "+ su.bonificacao());
		System.out.println("Gerente ganha: "+ve.getSalario()+ " Com a Bonificação irá ganhar: "+ ve.bonificacao()+"\n");
		System.out.println("-----------------------------------------------------------\n");
	}
}
