package br.com.generation.exercicios05Julho;

import java.util.Scanner;

public class ExercicioDoisFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		//ativando scanner do teclado		
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variaveis
		int numero,par=0, impar=0;
		
		//determinando o inicio e termino do laço
		for (int i = 0; i < 10; i++) {
			
			//recebendo os numero do usuario
			System.out.println("Digite o " + i + "° numero: ");
			numero = leiaTeclado.nextInt();
		
				//verificando se o numero é par e somendo a quantidade de numeros par
				if (numero %2 == 0) {
					
					//System.out.println(numero + " PAR \n");
					par++;
					
				}
				// se o numero é impar e somando a quantidade de numeros impar
				else {
					
					
					//System.out.println(numero + " IMPAR \n");
					impar++;
				
				//fim else
				}
				
				
		//fim for		
		}
		//imprimindo a quantidade de cada impar e par
		System.out.println("\n Total PAR: " + par + "\n Total IMPAR: " + impar);
			
		
	//fim public static void main
	}

}
