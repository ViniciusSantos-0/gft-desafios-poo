package br.com.gft.model;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		setVelocidade(getVelocidade() + 20); 
	}

	public void abastecer(int combustivel) {

		int total, tanque, litrosMax = 0, litrosRes = 0;

		tanque = getLitrosCombustivel(); // pegando a quantidade que já tem no tanque

		total = tanque + combustivel; // somando os litros do tanque junto com o pedido de combustivel
		
		// verificando quantos litros falta para encher o tanque caso o total passe de 60
		if (total > 60) {
			for (int i = tanque; i <= 60; i++) { // já começa a contar pela quantidade do tanque já tem até encher
				litrosMax++; //adicionando os litros que falta para encher o tanque
			}
		}
 
		litrosMax--;
		//----------------------------------verificando o total com o tanque--------------------------------------------\\
		if (total <= 60 && tanque < 60) {
			System.out.println("Adicionando essa quantidade de litros: " + combustivel
					+ "\nTotal de combustivel no veículo: " + total + "\n");
			setLitrosCombustivel(total);

		} else if (total > 60 && tanque < 60) {
			litrosRes = total - 60;
			System.out.printf(
					"Adicionando essa quantidade de litros: %d \n\n ----------  warning! ----------- \n\nO tanque encheu, só deu para abastecer essa quantidade em litros: %d  \nquantidade de litros que restou: %d \n\n",
					combustivel, litrosMax, litrosRes);
			setLitrosCombustivel(tanque + litrosMax);

		} else if (tanque >= 60) {
			System.out.println(" -------- Warning! ---------- \n\nNão é possível abastecer o tanque esta Cheio!\n ");
		}
	}

	public void frear() {
		if (getVelocidade() > 0) {
			setVelocidade(getVelocidade() - 20);
			System.out.println("O veículo reduziu a velocidade \n\n");
		} else {
			System.out.println("O veículo está parado!\n\n");
		}
	}

	public void pintar(String cor) {
		setCor(cor);
		System.out.println("Você pintou seu carro de: " + cor + "\n\n");
	}

	public void ligar() {
		if (isLigado) {
			System.out.println("Carro já está ligado!\n\n");
		} else {
			System.out.println("Ligando o carro!\n\n");
			setLigado(true);
		}
	}

	public void desligar() {
		if (isLigado && getVelocidade() > 0) {
			System.out.println("Estácione o carro para poder desligar!\n\n");
		} else if (isLigado) {
			System.out.println("Desligando o carro!\n\n");
		} else {
			System.out.println("Carro já está desligado!\n\n");
		}
	}
}
