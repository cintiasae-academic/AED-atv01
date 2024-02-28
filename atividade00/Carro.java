package atividade00;

public class Carro {
	public String marca;
	public String modelo;
	public Integer ano;

	public Carro(String marca, String modelo, Integer ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void acelerar() {
		System.out.println("O carro está acelerando");
	}
}
 