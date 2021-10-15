package br.com.polimorfismo;

import java.util.Scanner;

public class TestaOperacao {
	
	
	
	//metodo statico					//chamando a class, e a apelidando e criando parametros
	public static void calculaOperacao(OperaçãoMatematica opMath, double x, double y) {
			
		System.out.println(opMath.calcular(x, y));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leiaTeclado = new Scanner(System.in);

		
		double numero1, numero2;
		
		
		System.out.println("Digite numero:");
		numero1 = leiaTeclado.nextDouble();
		
		System.out.println("Digite numero:");
		numero2 = leiaTeclado.nextDouble();
		
		//chamando o metodo acima
		calculaOperacao(new Soma(), numero1, numero2);
		calculaOperacao(new Multiplicacao(), 2, 4);
		
	}

}
