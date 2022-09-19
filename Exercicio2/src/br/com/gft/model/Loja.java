package br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private double dTotalLivros = 0;
	private double dTotalVideoGames = 0;

	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {

		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGame;

	}

	public void listaLivro() {

		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {

			System.out.println("A loja " + getNome() + " possui estes livros para venda: ");
			for (Livro livro : livros) {

				System.out.println("titulo " + livro.getNome() + ", preço: " + livro.getPreco() + ", quantidade: "
						+ livro.getQtd() + " em estoque.");

				dTotalLivros += livro.getPreco() * livro.getQtd();				

			}
		}
	}

	public void listaVideoGames() {

		if (videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		} else {

			System.out.println("A loja " + getNome() + " possui estes video-games para venda: ");
			for (VideoGame videoGame : videoGames) {

				System.out.println("Video-Game: " + videoGame.getModelo() + ", preço: " + videoGame.getPreco() + ", quantidade: "
						+ videoGame.getQtd() + " em estoque.");

				dTotalVideoGames += videoGame.getPreco() * videoGame.getQtd();
			}
		}
	}
	
	public void calculaPatrimonio() {
		System.out.println("----------------------------------------------------------");
		System.out.println("O patrimônio da loja: " + getNome()+ " é de R$ "+(dTotalLivros + dTotalVideoGames));
	}
}
