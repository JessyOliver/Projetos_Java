package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class ExercicioVetorMatriz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 	3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
				a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
				b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

		 */
		
		//ativando scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando vetores e variaveis comuns
		double [][] n1 = new double[4][6];

		double [][] n2 = new double[4][6];
		
		double [][] m1 = new double[4][6];

		double [][] m2 = new double[4][6];
		
		int linha, coluna;
		
		//iniciando laço de linha		
		for ( linha = 0; linha < 2; linha++) {
			
			//iniciando laço de  coluna
			for ( coluna = 0; coluna < 3; coluna++) {
				
				//recebendo valor de n1
				System.out.println("Digite o " + (coluna + 1) + "° valor n1: " );
				n1[linha][coluna] = leiaTeclado.nextDouble();
				
				//recebendo valor de n2
				System.out.println("Digite o " + (coluna + 1) + "° valor n2: " );
				n2[linha][coluna] = leiaTeclado.nextDouble();
				
				//somando os valores recebidos
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				
				//verificando a diferença entre eles
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
				
				System.out.println();
			//fim for coluna
			}
			
		//fim  for linha	
		}
		
		//exibindo os resultados
		for ( linha = 0; linha < 2; linha++) {
			
			for ( coluna = 0; coluna < 3; coluna++) {
							
				//exibindo o resultado de soma
				System.out.println("Soma: " + m1[linha][coluna]);
				
				//exibindo a diferença
				System.out.println("Diferença: " + m2[linha][coluna]);
				
			//fim for coluna	
			}
		//fim for linha	
		}
		
	//fim programa	
	}

}
