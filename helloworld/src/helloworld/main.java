package helloworld;
import models.playlist;
import models.musica;

public class main {
	
	public static void main (String[] args) {
		
		playlist minha_playlist = new playlist();
		musica music1 = new musica("longas palavras",225,"Cu de cachorro");
		musica music2 = new musica("as vezes",225,"quem");
		musica music3 = new musica("batata",225,"cabe�a");
		
		minha_playlist.append(music1);
		minha_playlist.append(music2);
		minha_playlist.append(music3);
		
		minha_playlist.print();
		//Comment de teste
		minha_playlist.print();
		
	}
}
