package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args)  {
		
		/*2. Faça um sistema que leia a idade de uma pessoa expressa
		em dias e mostre-a expressa em anos, meses e dias. */
		
		//importando a biblioteca Scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
				int diaIdade, mesIdade, anoIdade;
				
				//mensagem com instruções ao usuario
				System.out.println("Preciso que digite sua idade em anos, mes, e ano" +
										" \n EXEMPLO \n Anos: 2 \n Meses: 5 \n Dias: 90 \n Vamos começar! \n\n");
				
				//exibindo a mensagem parao usuario e recebendo em anos
				System.out.println("Digite sua idade em anos: ");
				anoIdade = leiaTeclado.nextInt();

				//exibindo a mensagem parao usuario e recebendo em meses
				System.out.println("Digite sua idade em meses: ");
				mesIdade = leiaTeclado.nextInt();

				//exibindo a mensagem parao usuario e recebendo em dias
				System.out.println("Digite sua idade em dias: ");
				diaIdade = leiaTeclado.nextInt();

				//calculando os idade em dias
				diaIdade += (anoIdade * 365) + (mesIdade * 30);
				
				//exibindo resultado ao usuario dias em idade
				System.out.println("Seus dias em idade é: " + diaIdade + "\n" );

				//calculando a idade em mese
				mesIdade = 12 * anoIdade;

				//exibindo resultado ao usuario mes em idade
				System.out.println("Seus meses em idade é: " + mesIdade + "\n");

				//calculando idade em anos
				anoIdade = diaIdade / 365;

				//exibindo resultado ao usuario anos em idade
				System.out.println("Seus anos em idade é: " + anoIdade + "\n");
		
		
	//fim programa	
	}

}
