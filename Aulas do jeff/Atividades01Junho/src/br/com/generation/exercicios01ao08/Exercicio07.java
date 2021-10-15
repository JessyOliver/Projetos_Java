package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
			7. Um sistema de equações lineares do tipo: pode ser resolvido segundo mostrado abaixo : 
	
			x= (c * e) - (b * f) / (a * e) - (b * d)
	
			y = (a * f) - (c * d) / (a * e) - (b * d)
	
			Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
	*/
		
		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando a variavel de valores a receber e valores a serem calculados
				float aValor, bValor, cValor, dValor, eValor, fValor, xTotal, yTotal;

				//recebendo o valor de A
				System.out.println("Digite o valor A: ");
				aValor = leiaTeclado.nextFloat();

				//recebendo o valor de B
				System.out.println("Digite o valor B: ");
				bValor = leiaTeclado.nextFloat();

				//recebendo o valor de C
				System.out.println("Digite o valor C: ");
				cValor = leiaTeclado.nextFloat();

				//recebendo o valor de D
				System.out.println("Digite o valor D: ");
				dValor = leiaTeclado.nextFloat();
				
				//recebendo o valor de E
				System.out.println("Digite o valor E: ");
				eValor = leiaTeclado.nextFloat();

				//recebendo o valor de F
				System.out.println("Digite o valor F: ");
				fValor = leiaTeclado.nextFloat();
				
				//Calculando o valor de X
				xTotal = ((cValor * eValor ) - (bValor * fValor)) / ((aValor * eValor ) - (bValor * dValor)); 

				//calculando o valor de Y
				yTotal = ((aValor * fValor ) - (cValor * dValor)) / ((aValor * eValor ) - (bValor * dValor)); 

				//exibindo os valores de X e Y na tela
				System.out.println("O valor de X = " + xTotal + "\n Ovalor de Y = " + yTotal);
		
	//fim programa
	}

}
