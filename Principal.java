package br.com.musicas;

import br.com.musicas.modelos.MinhasPreferidas;

import br.com.musicas.modelos.Musica;

import br.com.musicas.modelos.Podcast;

public class Principal {
	public static void main(String [] args) {
		
		
		Musica paradise = new Musica();
		paradise.setTitulo("Paradise");
		paradise.setCantor("Coldplay");
		paradise.setGenero("Pop Rock/Rock alternativo/Rock eletrônico");
		paradise.setAlbum("Mylo Xyloto");
		
		paradise.exibeFichaTecnica();
		paradise.fichaTecnicaMusica();
		
		for (int i = 0; i < 100000; i++) {
			paradise.reproduz();
		}
		
		for (int i = 0; i < 50000; i++) {
			paradise.curte();
		}
		
		MinhasPreferidas musicaParadise = new MinhasPreferidas();
		musicaParadise.inclui(paradise);
		System.out.println("Classificação: " + paradise.getClassificacao() + "★");
		System.out.println("\n");
		
		
		Podcast hipster = new Podcast();
		hipster.setTitulo("Hipster Ponto Tech");
		hipster.setApresentador("Paulo Silveira");
		hipster.setDescricao("O Hipster Ponto Tech é um dos principais\npodcasts de TI"
				+ " disponíveis no mercado.\nEle conta com um time de profissionais\n"
				+ "de alto renome no mercado, como os\nfundadores do Caelum e da Alura.");
		
		hipster.exibeFichaTecnica();
		hipster.fichaTecnicaPodcast();
		
		for (int i = 0; i < 20000; i++) {
			hipster.reproduz();
		}
		
		for (int i = 0; i < 15000; i++) {
			hipster.curte();
		}
		
		MinhasPreferidas preferidas =  new MinhasPreferidas();
		preferidas.inclui(hipster);
		System.out.println("Classificação: " + hipster.getClassificacao() + "★");
		System.out.println("\n");		
	}	
}
