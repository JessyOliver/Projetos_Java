package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
			Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. */
			

		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//definindo as variveis que receberam nota e o calculo da media
				int nota1, nota2, nota3, media;

				// recendo o valor de nota 1
				System.out.println("Digite a nota 1: ");
				nota1 = leiaTeclado.nextInt();
				
				// recendo o valor de nota 2
				System.out.println("Digite a nota 2: ");
				nota2 = leiaTeclado.nextInt();

				// recendo o valor de nota 3
				System.out.println("Digite a nota 3: ");
				nota3 = leiaTeclado.nextInt();

				//calculando media ponderada
				media = ((2 * nota1) + (3 * nota2) + (5 * nota3)) / (2 + 3 + 5);

				//exibindo valor final ao usuario
				System.out.println("A sua Média Ponderada é: " + media);
		
		
		
	//fim projeto
	}

}
