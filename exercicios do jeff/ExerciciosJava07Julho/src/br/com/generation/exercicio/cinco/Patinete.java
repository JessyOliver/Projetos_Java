package br.com.generation.exercicio.cinco;

public class Patinete {
	
	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto patinete,
	  	defina as instancias deste objeto e apresente as informações deste objeto no console.*/
	
	private String  tipo, marca, classificacaoUso, codigo;
	
	private double preco,  codigoBarras;
	
	
	//construtor vazio
	public Patinete() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	//construtor completo
	public Patinete( String tipo, String marca, String classificacaoUso, String codigo, double preco,
				double codigoBarras) {
			super();
			this.tipo = tipo;
			this.marca = marca;
			this.classificacaoUso = classificacaoUso;
			this.codigo = codigo;
			this.preco = preco;
			this.codigoBarras = codigoBarras;
		}

	///get e set

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getClassificacaoUso() {
		return classificacaoUso;
	}

	public void setClassificacaoUso(String classificacaoUso) {
		this.classificacaoUso = classificacaoUso;
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

	
	public double getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(double codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	
	
	
	


}
