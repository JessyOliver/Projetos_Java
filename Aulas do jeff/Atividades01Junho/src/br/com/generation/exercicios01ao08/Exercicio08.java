package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
		 e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e 
		 os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
		*/

		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavei que recebera o custo do fabricante e a variavel que o valor que o consumidor irá pagar
				float custoFabrica,  custoConsumidor, impostosPorcem, custoFabricaPorcem;

				//recebendo o valor digitado pelo usuario custo de fabrica
				System.out.println("Digite o valor do Custo de Fabrica: ");
				custoFabrica  = leiaTeclado.nextFloat();

				//calculando o valor do custo ao consumidor final
				custoConsumidor = (float) (custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45));

				//exibindo o valor final do consumidor
				System.out.println(" \n O valor do veiculo, ao consumidor final será de R$ " + custoConsumidor + "\n");
		
				
		//fim programa
	}

}
