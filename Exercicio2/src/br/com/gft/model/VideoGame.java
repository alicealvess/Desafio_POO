package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	
	String marca; 
	String modelo;
	boolean isUsado;
	
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

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.isUsado = isUsado;
		this.marca = marca;
		this.modelo = modelo;
		
	}

	@Override
	public double calculaImposto() {
		
		double dImposto;
		
		if(isUsado) {
			dImposto = getPreco()*25/100;
			System.out.println("Imposto " + getNome() + " " + getModelo() + " usado, R$ " + dImposto + ".");
		}else {
			dImposto = getPreco()*45/100;
			System.out.println("Imposto " + getNome() + " " + getModelo() + " R$ " + dImposto + ".");
		}
		
		return dImposto;
	}

}
