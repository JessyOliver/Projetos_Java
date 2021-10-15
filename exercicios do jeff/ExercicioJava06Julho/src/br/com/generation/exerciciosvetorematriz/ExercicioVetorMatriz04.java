package br.com.generation.exerciciosvetorematriz;

import java.util.Scanner;

public class ExercicioVetorMatriz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 		4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		 		 e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
		 		 diagonal, ou seja, diagonal principal.
		 */
		
				//ativando scanner teclado
				Scanner leiaTeclado = new Scanner(System.in);
				
				//declarando vetor
				int[][] numero = new int[3][3];
				
				//declarando a variavel soma diagonal
				int diagonalSoma =0;		
				
				//iniciando for linha
				for (int linha = 0; linha < numero.length; linha++) {
					
					//iniciando for coluna
					for (int coluna = 0; coluna < numero.length; coluna++) {	
						
						//recebendo valores do usuario
						System.out.println("Digite o valor: ");
						numero[linha][coluna] =  leiaTeclado.nextInt();	
						
						//verificando as linha e colunas iguais para soma em diagonal
						if (linha == coluna) {		
							
							//somando os valores da diagonal
							diagonalSoma += numero[linha][coluna];		
							
						}//fim if	
						
					//fim for coluna	
					}				
					
					System.out.println();
				//fim for linha
				}
				
				System.out.println("\t EXIBINDO TABELA");
				//iniciando for linhae exibindo 
				for (int linha = 0; linha < numero.length; linha++) {
					
					//organizando a exibição
					System.out.print((linha +1) + "° linha | ");
					
					//iniciando for coluna e exibindo
					for (int coluna = 0; coluna < numero.length; coluna++) {
						
						System.out.print(numero[linha][coluna] + " | ");						
					}					
					
					System.out.println();
				}				
				
				//exibindo a soma das diagonais
				System.out.println("\n Soma das Diagonais é: " + diagonalSoma);
				
	//fim programa
	}

}
