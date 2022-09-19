 package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	
	String autor;
	String tema;
	int qtdPag;
	

	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getTema() {
		return tema;
	}



	public void setTema(String tema) {
		this.tema = tema;
	}



	public int getQtdPag() {
		return qtdPag;
	}



	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}



	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		
		this.autor = autor;
		this.qtdPag = qtdPag;
		this.tema = tema;
	}



	@Override
	public double calculaImposto() {
		double dImposto;
		
		if(tema.equals("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + getNome() + ".");
			return 0;
		}
		
		dImposto = getPreco()*10/100;
		System.out.println("R$ " + dImposto + " de impostos sobre o livro " + getNome() + ".");
		return dImposto;
	}


	
}
