package br.com.musicas.modelos;

public class Musica extends Audio {

	private String album;
	private String cantor;
	private String genero;
	
	
	public void fichaTecnicaMusica() {
		System.out.println("Cantor: " + cantor);
		System.out.println("Álbum: " + album);
		System.out.println("Gênero: " + genero);
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getCantor() {
		return cantor;
	}
	
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public int getClassificacao() {
		if (this.getTotalDeReproducoes() >= 100000) {
			return 10;
			
		} else if (this.getTotalDeReproducoes() > 50000 && 
				this.getTotalDeReproducoes() < 100000) {
			return 8;
			
		} else if (this.getTotalDeReproducoes() > 10000 && 
				this.getTotalDeReproducoes() <= 50000) {
			return 6;
			
		} else if (this.getTotalDeReproducoes() > 5000 &&
				this.getTotalDeReproducoes() <= 10000) {
			return 4;
			
		} else if (this.getTotalDeReproducoes() > 1000 &&
				this.getTotalDeReproducoes() <= 5000) {
			return 2;
			
		} else {
			return 1;
		}
	}
}
