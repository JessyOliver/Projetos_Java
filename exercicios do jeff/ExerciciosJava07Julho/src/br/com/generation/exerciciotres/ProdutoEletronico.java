package br.com.generation.exerciciotres;

public class ProdutoEletronico {
	
	
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.*/
	
	String nome, marca, modelo, codigo;
	double preco, codigoBarra;
	
	
	
	
	//construtor completo
	public ProdutoEletronico(String nome, String marca, String modelo, String codigo, double preco,
			double codigoBarra) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.codigo = codigo;
		this.preco = preco;
		this.codigoBarra = codigoBarra;
	}
	
	
	//construtor vazio
	public ProdutoEletronico() {
		super();
		// TODO Auto-generated constructor stub
	}


	//metodos gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(double codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	
	
	
	
	
	

}
