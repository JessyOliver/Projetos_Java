package br.com.generetion.metodo;

import java.util.Scanner;
			 //nome da class
public class TestaMetodos {

	//variaveis globais para ser usadas nos metodos abaixo
	//static int numero1 = 20, numero2 = 30, total;
	
	//atributos da class
	static int numero1 , numero2 , total;

	//metodos com ações dessa class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//chamando metodo
		metodo1();
		metodo2();
		metodo3();
		metodo4(5,6);
		metodo5();
		TesteMetodoFora.foraFrase();

	}
	
	//função 1 exibir
	public static void metodo1() {
		// TODO Auto-generated method stub
		
		System.out.println(" Este é o primeiro metodo!\n ");

	}
	
	//função 2 soma
	public static void metodo2() {
		// TODO Auto-generated method stub
	
			Scanner leiaTeclado = new Scanner(System.in);
			
			System.out.println(" Este é o 2° metodo recebe valores: " );
			
			System.out.println("Digite o primeiro numero: ");
			numero1 = leiaTeclado.nextInt();
			
			System.out.println("Digite o primeiro numero: ");
			numero2 = leiaTeclado.nextInt();
			
		//variaveis statics são chamadas para fazer a soma
		total = numero1 + numero2;
		

	}
	
	//função 1 exibir resultado
	public static void metodo3() {
		// TODO Auto-generated method stub

		//System.out.println("\n Este é o 3° metodo exibe resultados \n" );
		System.out.println(" Este é o 3° metodo  exibe resultados Soma: " + numero1 + " + " + numero2 + " = " + total);

	}
		
		
		//função 1 exibir resultado
	public static void metodo4( int numero3, int numero4) {
		// TODO Auto-generated method stub

		int soma = numero3 + numero4;
		
		System.out.println("\n Este é o 4° metodo Soma: " + numero3 + " + " + numero4 + " = " + soma);

	}

	
	//função 5 invoca o metodo de fora
	public static void metodo5() {
		// TODO Auto-generated method stub
			
			System.out.println("\n Contando String com For...");
			
			//chamando metodo de outra class
			System.out.println(TesteMetodoFora.cont(1, 10));
	}
}
