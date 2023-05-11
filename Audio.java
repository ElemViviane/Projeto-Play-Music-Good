package br.com.musicas.modelos;
//SuperClass
public class Audio {

	private String titulo;
	private int totalDeReproducoes;
	private int totalDeCurtidas;
	private int classificacao;

	public void exibeFichaTecnica() {
		System.out.println("Ouvir: " + titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}

	public int getTotalDeCurtidas() {
		return totalDeCurtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void curte() {
		this.totalDeCurtidas ++;
	}
	
	public void reproduz() {
		this.totalDeReproducoes ++;
	}
}
