package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			4 Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
			r = (a+b)²
			s = (b+c)²
			d = r + s / 2
		*/
		
		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando as variaveis que receberam os valores, e variaveis que receberá os calculos
				float a, b, c, d, r, s;

				// recendo o valor de A
				System.out.println("Digite o valor A: ");
				a = leiaTeclado.nextFloat();

				// recendo o valor de B
				System.out.println("Digite o valor B: ");
				b = leiaTeclado.nextFloat();

				// recendo o valor de C
				System.out.println("Digite o valor C: ");
				c = leiaTeclado.nextFloat();
				
				//calculando o valor de R
				r = (float) Math.pow((a + b), 2);
				
				//calculando o valor de S
				s = (float) Math.pow((b + c), 2.0);

				//calculando o valor de  D
				d = (r + s) / 2;
				
				//exibindo o valor de R ao usuario
				System.out.println("O valor de R = " + r + "\n");
				
				//exibindo o valor de S ao usuario
				System.out.println("O valor de S = " + s + "\n");
				
				//exibindo o valor de D ao usuario
				System.out.println("O valor de D = " + d + "\n");
		
		
	//fim programa
	}

}
