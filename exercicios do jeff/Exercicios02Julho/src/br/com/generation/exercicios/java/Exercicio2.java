package br.com.generation.exercicios.java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2 - Faça um programa que entre com três números e coloque em ordem crescente. */
		
		//ativando teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declaradno variavel
		int num1, num2, num3;
				
		//informando usuario e recebendo o valor
		System.out.println("Digite o 1° valor: ");
		num1 = leiaTeclado.nextInt();
		
		//informando usuario e recebendo o valor
		System.out.println("Digite o 1° valor: ");
		num2= leiaTeclado.nextInt();
		
		//informando usuario e recebendo o valor
		System.out.println("Digite o 1° valor: ");
		num3 = leiaTeclado.nextInt();

		//pulando linha
		System.out.println("\n");
				
				
				 //verificando se o 1° numero é menor que o 2° e o 3º
				if (num1 < num2 && num1 < num3) {
					
					 //verificando se o 2° numero é menor que o 3°
					if (num2 < num3 ) {
						
						System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
						
					}
					 // se o 3° numero é menor que o 2°
					else {
						
						System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
					}
										
				}	
				//verificando se o 2° numero é menor que o 2º e o 3°
				else if (num2 < num1 && num2 < num3) {
					
					 //verificando se o 1° numero é menor que o 3º
					if (num1 < num3 ) {
						
						System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
						
					}
					//se o 3° for menor que o 1°
					else {
						
						System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);

					}
					
				}
				//imprimindo o 3° valor pois sera o menor que o 1° e 2°
				else {
					
					 //verificando se o 1° numero é menor que o 2º
					if (num1 < num2 ) {
						
						System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
						
					}
					//se o 2° for o menor que o 1º
					else {
						
						System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);

					}
					
					
				//fim do laço else
				}
				 
	//fim programa
	}

}
