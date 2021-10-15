package br.com.generation.exercicios.java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		//ativando scanner teclado
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
		
		//verificando se o 1° numero é maior
		if (num1 > num2 && num1 > num3) {
			
			System.out.println(num1 + " é maior que " + num2 + " e " + num3);
			
			//System.out.println(num1 +" é o Maior valor");
			
		}	
		//verificando se o 2° numero é maior
		else if (num2 > num1 && num2 > num3) {
			
			System.out.println(num2 + " é maior que " + num1 + " e " + num3);
			
		}
		//imprimindo o terceiro valor pois sera o maior
		else {
			
			System.out.println(num3 + " é maior que " + num1 + " e " + num2);
			
		}
	//fim programa
	}

}
