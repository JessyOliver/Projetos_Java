package br.com.generation.exercicios05Julho;

import java.util.Scanner;

public class ExercicioTresWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3-	Solicitar a idade de várias pessoas e imprimir:
		  		Total de pessoas com menos de 21 anos. 
		  		Total de pessoas com mais de 50 anos. 
		  		O programa termina quando idade for =-99. (WHILE)*/
	
		
		//scanner ativando
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
		int idade=0;
		
		//enquanto idae diferente de 99 peça a idade do usuario
		while (idade != -99) {
			
			//exibindo mensagem ao usuario
			System.out.println("Digite sua idade: ");
			//recebendo idade 
			idade = leiaTeclado.nextInt();
		}
		//se a idade for == 99 imprima a mensagem e encerre o programa
		System.out.println("Idade da sorte -99!! \n fim programa!");
		
	//fim	
	}

}
