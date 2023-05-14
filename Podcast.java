package br.com.musicas.modelos;

public class Podcast extends Audio {

	private String apresentador;
	private String descricao;
	
	public void fichaTecnicaPodcast() {
		System.out.println("Apresentador: " + apresentador);
		System.out.println("Descrição: " + descricao);
	}
	
	public String getApresentador() {
		return apresentador;
	}
	
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int getClassificacao() {
		if (this.getTotalDeCurtidas() >= 100000) {
			return 10;
			
		} else if (this.getTotalDeCurtidas() > 50000 && this.getTotalDeCurtidas() < 100000) {
			return 8;
			
		} else if (this.getTotalDeCurtidas() > 10000 && this.getTotalDeCurtidas() <= 50000) {
			return 6;
			
		} else if (this.getTotalDeCurtidas() > 5000 && this.getTotalDeCurtidas() <= 10000) {
			return 4;
			
		} else if (this.getTotalDeCurtidas() > 1000 && this.getTotalDeCurtidas() <= 5000){
			return 2;
			
		} else {
			return 1;
		}
	}
}
