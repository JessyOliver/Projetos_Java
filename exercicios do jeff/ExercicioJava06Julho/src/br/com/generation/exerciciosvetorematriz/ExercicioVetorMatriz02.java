package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class ExercicioVetorMatriz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado.
		  		Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		  		A seguir determine e imprima a média aritmética dos lançamentos, contabilize
		  		e apresente também quantas foram as ocorrências da maior pontuação.*/
		
		
		//ativando scanner
		Scanner leiaTeclado = new Scanner(System.in);

		//declarando vetor
		double [] valorRecebido = new double[5];
		
		//declarando variaveis
		double media= 0.0, soma=0.0, maior = 0.0, quatMaior = 0 ;
		
		
		//iniciando laço
		for (int i = 0, j=1; i < valorRecebido.length; i++,j++) {
			
			//recebendo valores
			System.out.println("Digite "+ (i + 1) + "° o valor ");
			valorRecebido[i] = leiaTeclado.nextDouble();
			
			
			//somando cada pontuação digitada
			soma += valorRecebido[i];
			
			//calculando a media 
			media = soma / j ;
			
			//verifiando qual é o maior e quantas vezes essa ocorrencia acontece
			if ( valorRecebido[i] > maior || valorRecebido[i] == maior ) {
				//a variavel recebe o maior numero
				maior = valorRecebido[i];

				//se o maior se repetir soma mais 1
				quatMaior++;
				
			}
			
			
		//fim do primeiro for
		}
		
		//exibindo resultados
		System.out.println("\n\t Valores Recebidos");
		
		//iniciamdo laço
		for (int i = 0; i < valorRecebido.length; i++) {
			
			//exibindo os valores recebidos
			System.out.print( valorRecebido[i] + " | ");
			
		}
		
		System.out.println();
		//System.out.println("\n Total: " + soma);
		System.out.println("\n Maior Numero: " + maior);
		
		//exibindo quantas vezes a comparação de maior foi realizada
		System.out.println("\n Açoes Maior: " + quatMaior);
		
		//exinibindo a media dos numeros somados
		System.out.println("\n Média: " + media);
		
	//fim programa
	}

}
