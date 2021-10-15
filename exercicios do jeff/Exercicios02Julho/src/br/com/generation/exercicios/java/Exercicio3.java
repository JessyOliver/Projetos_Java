package br.com.generation.exercicios.java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
				categoria ela se encontra:
				 10-14 infantil
				 15-17 juvenil
				 18-25 adulto
		 */
		
		//ativando scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variavel
		int idade;
		
		//recebendo a idade 
		System.out.println("Digite a idade: ");
		idade = leiaTeclado.nextInt();
		
		System.out.println("\n CATEGORIA"
								+ "\n 10-14 Infantil "
								+ "\n 15-17 Juvenil "
								+ "\n 18-25 Adulto");
		//verificando se pertence a categoria infantil
		if (idade >= 10 && idade <= 14) {
			
			System.out.println("\n Categoria Infantil");
			
		} 
		//verificando se pertence a categoria Juvenil
		else if(idade >= 15 && idade <= 17) {
			
			System.out.println("\n Categoria Juvenil");
			
		}
		//verificando se pertence a categoria Adulta
		else if(idade >= 18 && idade <= 25)
		{
			System.out.println("\n Categoria Adulta");

		}
		//informando que não pertence a nenhuma categoria
		else {
			
			System.out.println("\n Não pertence á nenhuma categoria! ");

		}
		
		
		
	//fim programa
	}

}
