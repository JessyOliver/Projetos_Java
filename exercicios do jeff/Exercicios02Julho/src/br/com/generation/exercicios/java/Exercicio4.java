package br.com.generation.exercicios.java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
				n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
				�mpar exiba o n�mero elevado ao quadrado.
		 */
		
		//ativando scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
		double numero;
		
		//recebendo o valor do teclado
		System.out.println("Digite um valor: ");
		numero = leiaTeclado.nextDouble();
		
		//verificando se o valor � par 
		if (numero % 2 == 0) {
			
			System.out.println("\n " + numero + " PAR ");
			
			//calculando a raiz quadrada do valor
			System.out.println("Raiz quadrada = " + Math.sqrt(numero) );
			
		}
		//se for impar
		else {
			
			System.out.println("\n " + numero + " IMPAR ");
			
			//elevando ao quadrado
			System.out.println("("+ numero + ")� = " + Math.pow(numero, 2));

		}
		
		
	//fim programa
	}

}
