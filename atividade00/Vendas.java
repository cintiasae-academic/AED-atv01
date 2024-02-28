package atividade00;

public class Vendas {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Toyota", "Corolla", 2020);
		
		System.out.println("Marca: " + carro1.marca);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Ano: "+ carro1.ano);
		
		carro1.acelerar();
	}

}
