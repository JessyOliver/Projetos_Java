package br.com.generation.exercicios05Julho;

import java.util.Scanner;

public class ExercicioCincoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*5-	Crie um programa que leia um número do teclado até que 
		 encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		//ativando o recebimento do teclado
		Scanner leiaTeclado =  new Scanner(System.in);
		
		//declarando variaveis
		int numero, soma = 0;
		
		//iniciando laço
		do {
			
			//recebendo o numero que o usuario digitar
			System.out.println("Digite um numero: ");
			numero = leiaTeclado.nextInt();
			
			//somando o valor do numero recebido
			soma += numero;
			
		} while (numero != 0);//o laço sera finalizado quando o usuario digitar 0
		
		//exibindo a soma dos numeros
		System.out.println("Soma Total: " + soma);

	//fim programa
	}

}
