package br.com.generation.exercicios05Julho;

import java.util.Scanner;

public class ExercicioSeisDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6-	Escrever um programa que receba vários números inteiros no teclado.
		  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		
		//scanner ativo
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
		int soma=0, recebe, media=0,quantiNum=0 ;
		
		//iniciando laço
		do {
			
			//recebendo o numero 
			System.out.println("Digite um numero");
			recebe = leiaTeclado.nextInt();
			
			//verificando se o numero é divizivel por 3
			if (recebe %3 == 0) {
				
				//somando os valores digitados pelo usuario
				soma += recebe;
				
				//somando a quantidade de numeros que foram digitados
				quantiNum++;
				
				//calculando media
				media =  soma / quantiNum;

			}//fim if
			

		} while (recebe != 0);//se numero digitado for igual a 0 o programa encerra
		
		
		//calculando a media dos numeros digitadose divididos pela quantidade digitada e exbindo ao usuario
		System.out.println("Media: " + media);
		
	//fim programa
	}

}
