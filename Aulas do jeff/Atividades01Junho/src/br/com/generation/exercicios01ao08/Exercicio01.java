package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			 	1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
				meses e dias e mostre-a expressa apenas em dias. 
		 */
		
		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variaveis
		int diaIdade, mesIdade, anoIdade;
		
		//mensagem de apoio ao usuario
		System.out.println("Preciso que digite sua idade em anos, mes, e ano" +
								" \n EXEMPLO \n Anos: 2 \n Meses: 5 \n Dias: 90 \n Vamos começar! \n\n");
	
		//exibindo a mensagem parao usuario e recebendo em anos
		System.out.println("Digite sua idade em anos: ");
		anoIdade = leiaTeclado.nextInt();
		
		//exibindo a mensagem parao usuario e recebendo em meses
		System.out.println("Digite sua idade em meses: ");
		mesIdade = leiaTeclado.nextInt();
		
		//exibindo a mensagem parao usuario e recebendo em dias
		System.out.println("Digite sua idade em dias: ");
		diaIdade = leiaTeclado.nextInt();
		
		//calculando os anos em dias
		diaIdade += (anoIdade * 365) + (mesIdade * 30);
		
		//exibindo resultado ao usuario
		System.out.println("Seus dias em idade é: " + diaIdade + "\n");
	
	//fim programa
	}

}
