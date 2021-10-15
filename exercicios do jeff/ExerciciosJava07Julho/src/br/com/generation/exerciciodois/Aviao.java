package br.com.generation.exerciciodois;

public class Aviao {
		/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
		 *  em seguida crie um objeto avião, defina as instancias deste objeto e apresente as 
		 *  informações deste objeto no console.*/
	
	//atributos
	String tipo, modelo, anoContruido, localidade;
	double preço;
	
	
	
	//construtor vazio
	public Aviao() {
		super();
		// TODO Auto-generated constructor stub
	}

	//construtor completo
	public Aviao(String tipo, String modelo, String anoContruido, String localidade, double preço) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.anoContruido = anoContruido;
		this.localidade = localidade;
		this.preço = preço;
	}
	
	
	//metodos gets e sets 
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnoContruido() {
		return anoContruido;
	}
	public void setAnoContruido(String anoContruido) {
		this.anoContruido = anoContruido;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	

	
	
	
	
	
	
	
	
}
