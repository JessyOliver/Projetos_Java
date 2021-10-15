package br.com.generation.aula01.exemplovariavel;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ativando o scanner do teclado
		Scanner lerTeclado = new Scanner(System.in);
		
		int numero1, numero2, soma;
		
		System.out.println("Digite o 1° numero:");
		numero1 = lerTeclado.nextInt();
		
		System.out.println("Digite o 2° numero:");
		numero2 = lerTeclado.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println(numero1 + " + " + numero2 + " = " + soma);
	}

}
