package br.com.musicas.modelos;

public class MinhasPreferidas {
	
	public void inclui(Audio audio) {
		if (audio.getClassificacao() >= 9 ) {
			System.out.println(audio.getTitulo() + " É considerado sucesso absoluto"
					+ " e preferido por todos!");
			
		} else if (audio.getClassificacao() >= 8 && audio.getClassificacao() < 9) {
			System.out.println(audio.getTitulo() + " É considerado muito bom!");
			
		} else if (audio.getClassificacao() >= 6 && audio.getClassificacao() < 8) {
			System.out.println(audio.getTitulo() + " É considerado bom!");
			
		} else if (audio.getClassificacao() >= 4 && audio.getClassificacao() < 6) {
			System.out.println(audio.getTitulo() + " É considerado regular!");
			
		} else if (audio.getClassificacao() >= 2 && audio.getClassificacao() < 4) {
			System.out.println(audio.getTitulo() + " É considerado ruim!");
			
		} else {
			System.out.println(audio.getTitulo() + " É considerado muito ruim!");
		}
	}
}
