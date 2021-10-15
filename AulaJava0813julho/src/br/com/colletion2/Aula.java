package br.com.colletion2;

public class Aula {
	
	private String titulo;
	private int  tempo;
	
	//construtores
	//completos reservão o seu espaço na memoria sem comprometer o sistema
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public Aula() {
		super();
		// TODO Auto-generated constructor stub
	}


	//emcapsulamento da classe
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	//metodo da class String para exibir na tela
	//sobrescrita de metodo
	public String toString() {
		
		//retorna preenchido
		return "\n Aula: " + this.titulo + ", " 
				+ this.tempo + " minutos ";
		
		//ou retorna vazio
		//return " ";
		
	}
	
	
	
}
