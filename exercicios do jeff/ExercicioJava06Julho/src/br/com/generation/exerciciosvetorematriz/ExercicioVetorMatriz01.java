package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class ExercicioVetorMatriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1.	Fa�a um programa que crie um vetor por leitura com 5 valores
		   		de pontua��o de uma atividade e 
		 		o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */
		//iniciando scanner
		Scanner leiaTeclado = new Scanner(System.in);

		//declarando vetor
		double[] pontuacao = new double[5];
		
		//variavel que ira receber o maior
		double maior = 0.0;
		
		//iniciando o contador dentro do vetor
		for (int conta = 0; conta < pontuacao.length; conta++) {
			
			//mensagem ao usuario
			System.out.println("Digite a "+ (conta + 1) +"� pontua��o:" );
			
			//recebendo pontua��o digitada
			pontuacao[conta] = leiaTeclado.nextDouble();
			
			//verificando qual � a maior pontua��o
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
			System.out.println("\n\n O MAIOR �: " + maior);
	
		
		
		
	//fim programa
	}

}
