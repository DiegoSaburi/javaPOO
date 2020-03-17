package models;
import java.util.ArrayList;

public class playlist {
	public ArrayList<musica> lista_musicas = new ArrayList<>();
	private int duracao_playlist = 0;
	private int total_musicas = 0;
	
	public int getTotal_musicas() {
		return total_musicas;
	}

	public int getDuracao_playlist() {
		return duracao_playlist;
	}
	
	public void append ( musica song ) {
		lista_musicas.add(song);
		duracao_playlist += song.getDuracao();
		total_musicas++;
	}
	
	public void print() {
		System.out.println("Tempo de dura��o: " + getDuracao_playlist());
		System.out.println("Total de m�sica: " + getTotal_musicas());
		for (int i = 0 ; i < this.lista_musicas.size();i++) {
			System.out.println("\t===== " + (i + 1) + " =====");
			lista_musicas.get(i).print();
		}
	}
}
