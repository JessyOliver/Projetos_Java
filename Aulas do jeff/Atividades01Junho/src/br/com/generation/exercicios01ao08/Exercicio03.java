package br.com.generation.exercicios01ao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. Faça um sistema que leia o tempo de duração de um evento em uma 
			 fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
	
		//importando a biblioteca Scanner
				Scanner leiaTeclado = new Scanner(System.in);
				
				//declarando variaveis 
				int minuto, segundo , hora;

				//recebendo o valor em segundos
				System.out.println(" Digite o tempo de duração do seu evento segundos: ");
				segundo= leiaTeclado.nextInt();

				//calculando hora
				hora = segundo / 3600;

				//calculando minutos
				minuto = (segundo  % 3600 ) / 60;

				////calculando segundos "obs. acho que esse não esta correto"
				segundo = (minuto * hora) % 60; 

				//exibindo a hora minutos e segundos
				System.out.println("Seu tempo de evento é: \n");
				System.out.println(hora + " : " + minuto + " : " + segundo);
				
				
				
	//fimprograma			
	}

}
