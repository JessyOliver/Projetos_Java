package br.com.generation.matriz;

import java.util.Scanner;

public class ExemploMatriz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leiaTeclado = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		Double soma, media=0.0;
		
		System.out.println("\t NOTAS DOS ALUNOS");
		for (int linha = 0; linha < notasAlunos.length; linha++) {
			
			//é necessário atribuir o valor da variavel soma dentro do laço para não ter excesso de atribuição de valores
			soma = 0.0;
			
			//exibindo qual linha estamos	
			System.out.printf("\n Digite as notas %d° aluno \n", (linha+1));
			
			//iniciando o laço coluna
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				
				//atribuindo o valor
				//System.out.printf(" digite as notas [%d][%d]|", linha, coluna);
				notasAlunos[linha][coluna]= leiaTeclado.nextDouble();
				
				//somando as notas
				soma += notasAlunos[linha][coluna];
				
			}
			//calculando media
			media = soma / 4;
			
			System.out.println();
			
			System.out.printf((linha + 1) +"° Aluno Média:  " +  media);

		}
	
		
		

		
		//fim programa
	}

}
