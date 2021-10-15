package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class ExercicioVetorMatriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1.	Faça um programa que crie um vetor por leitura com 5 valores
		   		de pontuação de uma atividade e 
		 		o escreva em seguida. Encontre após a maior pontuação e a apresente. */
		//iniciando scanner
		Scanner leiaTeclado = new Scanner(System.in);

		//declarando vetor
		double[] pontuacao = new double[5];
		
		//variavel que ira receber o maior
		double maior = 0.0;
		
		//iniciando o contador dentro do vetor
		for (int conta = 0; conta < pontuacao.length; conta++) {
			
			//mensagem ao usuario
			System.out.println("Digite a "+ (conta + 1) +"° pontuação:" );
			
			//recebendo pontuação digitada
			pontuacao[conta] = leiaTeclado.nextDouble();
			
			//verificando qual é a maior pontuação
			if (pontuacao[conta] > maior ) {
				
				//recebendo o valor digitado
				maior = pontuacao[conta];
				
			}
			
		}
		
		System.out.println("\t --EXIBINDO VALORES--");
		for (int conta = 0; conta < pontuacao.length; conta++) {
			
			System.out.print(pontuacao[conta] + ", ");
			
		}
			//exibindo o maior valor
			System.out.println("\n\n O MAIOR é: " + maior);
	
		
		
		
	//fim programa
	}

}
