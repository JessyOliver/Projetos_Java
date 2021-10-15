package br.com.generation.aula02;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//recebendo valores do teclado
		Scanner leiaTeclado = new Scanner(System.in);
	
		//declarando variaveis 
		double numero1, numero2, resultado;
		//ira receber o char
		char operacao;
		
		//instrução ao usuario
		System.out.println("CALCULADORA SIMPLES \n Digite \n + para Somar \n "
				+ "- para Subtrair \n * para Multiplicar \n / para Dividir \n");

		//recebendo o valor do numero
		System.out.println("Digite o 1° numero: ");
		numero1 = leiaTeclado.nextDouble();
		
		//recebendo o operador
		System.out.println("Digite um Operador");
		operacao = leiaTeclado.next().charAt(0);
		
		//recebendo o valor do numero
		System.out.println("Digite o 2° numero: ");
		numero2 = leiaTeclado.nextDouble();
				
		//verificando o valor do operador
		switch (operacao) {
		
			//realizando a soma dentro do case
				case '+' :
					resultado = numero1 + numero2;
						
					//exibindo o resultado
						System.out.println(numero1 + " + " + numero2 + " = " + resultado);
						
					break;
					
				//realizando a subtração dentro do case
				case '-':
					
					resultado = numero1 - numero2;
					
					//exibindo o resultado
					System.out.println(numero1 + " - " + numero2 + " = " + resultado);
					
				break;
				
				//realizando a multiplicação dentro do case
				case '*':
					
					resultado = numero1 * numero2;
					
					//exibindo o resultado
					System.out.println(numero1 + " * " + numero2 + " = " + resultado);
					
				break;
				
				//realizando a dividindo dentro do case
				case '/':
					resultado = numero1 + numero2;
					
					//exibindo o resultado
					System.out.println(numero1 + " / " + numero2 + " = " + resultado);
					
				break;
				
				//realizando uma observação caso o usuário digite algo diferente
				default:
					
					System.out.println("Operador não aceito!");
					
				break;
					
		//final switch
		}
				
		//fim programa
	}

}
