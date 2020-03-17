package models;

public class musica {
	
	private String nome;
	private int duracao;
	private String album;
	
	public musica (String nome,int duracao, String album) {
		this.nome = nome;
		this.duracao = duracao;
		this.album = album;
	}
	
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void print () {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Duração: " + this.getDuracao() + " segundos");
		System.out.println("Álbum: " + this.getAlbum());
	}
	
}