package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		6. Construa um programa em c que, tendo como dados de entrada 
			dois pontos quaisquer no plano,
			P(x1, y1) e P(x2, y2), escreva a distância entre eles.
			A fórmula que efetua tal cálculo é: */
		
		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variaveis com pontos flutuantes
				float x1, x2, y1, y2, p1, p2, d;

				//mensagem ao usuario e recebendo o valor de X1
				System.out.println("Digite o valor de X do primeiro ponto: ");
				x1 = leiaTeclado.nextFloat();

				//mensagem ao usuario e recebendo o valor de Y1
				System.out.println("Digite o valor de Y do primeiro ponto: ");
				y1 = leiaTeclado.nextFloat();

				//mensagem ao usuario e recebendo o valor de  X2
				System.out.println("Digite o valor de X do segundo ponto: ");
				x2 = leiaTeclado.nextFloat();

				//mensagem ao usuario e recebendo o valor de Y2
				System.out.println("Digite o valor de Y do segundo ponto: ");
				y2 = leiaTeclado.nextFloat();

				//calculando o valor de P1
				p1 = (float) Math.pow((x2 - x1), 2.0);// p1 = (x2 - x1 ) * (x2 - x1)

				//calculando o valor de P2
				p2 = (float) Math.pow((y2 - y1), 2.0); // p1 = (y2 - y1 ) * (y2 - y1)

				//calculando o valor de D
				d = (float) Math.pow((p1 + p2), 2.0);

				//exibindo o valor de D
				System.out.println("A distancia de P1 para P2 é: " + Math.sqrt(d));
		
		

	}

}
