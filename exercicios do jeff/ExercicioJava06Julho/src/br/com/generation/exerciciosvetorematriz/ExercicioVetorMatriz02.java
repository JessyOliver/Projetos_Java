package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class ExercicioVetorMatriz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
		  		Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		  		A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize
		  		e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/
		
		
		//ativando scanner
		Scanner leiaTeclado = new Scanner(System.in);

		//declarando vetor
		double [] valorRecebido = new double[5];
		
		//declarando variaveis
		double media= 0.0, soma=0.0, maior = 0.0, quatMaior = 0 ;
		
		
		//iniciando la�o
		for (int i = 0, j=1; i < valorRecebido.length; i++,j++) {
			
			//recebendo valores
			System.out.println("Digite "+ (i + 1) + "� o valor ");
			valorRecebido[i] = leiaTeclado.nextDouble();
			
			
			//somando cada pontua��o digitada
			soma += valorRecebido[i];
			
			//calculando a media 
			media = soma / j ;
			
			//verifiando qual � o maior e quantas vezes essa ocorrencia acontece
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
		
		//iniciamdo la�o
		for (int i = 0; i < valorRecebido.length; i++) {
			
			//exibindo os valores recebidos
			System.out.print( valorRecebido[i] + " | ");
			
		}
		
		System.out.println();
		//System.out.println("\n Total: " + soma);
		System.out.println("\n Maior Numero: " + maior);
		
		//exibindo quantas vezes a compara��o de maior foi realizada
		System.out.println("\n A�oes Maior: " + quatMaior);
		
		//exinibindo a media dos numeros somados
		System.out.println("\n M�dia: " + media);
		
	//fim programa
	}

}
