package br.com.generation.sobrecargametodos;

public class MinhaCalculadora {
	
	//exemplos de sobrecargas de metodos 
	//metodos com o mesmo nome e função porem com dados direferentes
	
	public int soma(int num1,int num2) {
		
		return num1 + num2;
		
	}
	
	public double soma(double num1,double num2) {
		
		return num1 + num2;
		
	}

	public int soma(int num1, int num2, int num3) {
		
		return num1 + num2 + num3;
		
	}
	
	public double soma(int num1, double num2) {
		
		return num1 + num2 ;
		
	}

}
