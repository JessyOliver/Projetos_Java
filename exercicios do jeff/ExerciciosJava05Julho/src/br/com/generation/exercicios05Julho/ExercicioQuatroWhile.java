package br.com.generation.exercicios05Julho;

import java.util.Scanner;

public class ExercicioQuatroWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 4-	Uma empresa desenvolveu uma pesquisa para saber as características
		  		psicológicas dos indivíduos de uma região. Para tanto, a cada uma 
		  		das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
		  		e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a 
		  		pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados 
		  		de 150 pessoas, calcule e mostre: (WHILE)
				•	o número de pessoas calmas; 
				•	o número de mulheres nervosas; 
				•	o número de homens agressivos; 
				•	o número de outros calmos;
				•	o número de pessoas nervosas com mais de 40 anos; 
				•	o número de pessoas calmas com menos de 18 anos.
				*/
		
		//scanner ativando
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando variaveis		
		int idade, sexo, temperamento,pessoas = 1,feminino = 0, masculino = 0, outros = 0, calmo = 0, nervoso = 0, agressivo = 0;
		int maisQuarenta=0, menosDezoito=0, outrosCalmo =0, homensAgrecivos =0, mulherNervosas=0;

		//enquanto pessoas forem menor que 150 receba os dados
		while (pessoas <= 5) {
			
			//recebendo idade do usuario
			System.out.println(pessoas + "° Digite sua idade: ");
			idade= leiaTeclado.nextInt();
			
			//recebendo o sexo do usuario
			System.out.println(" ESCOLHA ");
			System.out.println("1-feminino / 2-masculino / 3-Outros");
			sexo= leiaTeclado.nextInt();
			
			//identificando o sexo do usuario
			if (sexo == 1) {
				
				feminino++;
			}
			else if (sexo == 2) {
				
				masculino++;
				
			}
			else if (sexo == 3) {
				
				outros++;
				
			}
			
			//recebendo o temperamento do usuario
			System.out.println(" Você é uma pessoa? Escolha:");
			System.out.println(" 1- CALMA; 2- NERVOSA ou 3- AGRESSIVA ");
			temperamento = leiaTeclado.nextInt();
			
			//identificando o temperamento do usuario
			if (temperamento == 1) {
				
				calmo++;
			}
			else if (temperamento == 2) {
				
				nervoso++;
			}
			else if (temperamento == 3) {
				
				agressivo++;
			}
			//o número de mulheres nervosas; 
			if (sexo == 1 && temperamento == 2) {
				
				mulherNervosas++;
			}

			//o número de homens agressivos; 
			if (sexo == 2 && temperamento == 3) {
				
				homensAgrecivos++;
				
			}
			
			//o número de outros calmos;
			if (sexo == 3 && temperamento == 1) {
				 outrosCalmo++;
			}
			//o número de pessoas nervosas com mais de 40 anos;
			if (idade >= 40 && temperamento == 2) {
				
				 maisQuarenta ++; 
				
			}
			
			//o número de pessoas calmas com menos de 18 anos.
			if (idade <= 18 && temperamento == 1) {
				
				 menosDezoito ++; 
				
			}
			
			 pessoas++;
		}
		
		 /*
			System.out.println("\n SEXO");
			System.out.println("FEMININO: " + feminino);
			System.out.println("MAsculino: " + masculino);
			System.out.println("Outros: " + outros);
			
			System.out.println("\n TEMPERAMENTO ");
			System.out.println("NERVOSO: " + nervoso);
			System.out.println("AGRESSIVO: " + agressivo);
		*/
		
		//o número de pessoas calmas; 
		System.out.println("\n TOTAL DE PESSOAS CALMAS: " + calmo);
		
		//•	o número de mulheres nervosas; 
		System.out.println("\n TOTAL DE MULHERES NERVOSAS: " + mulherNervosas);
		
		//•	o número de homens agressivos; 
		System.out.println("\n TOTAL DE HOMENS AGRESSIVOS: " + homensAgrecivos);
		
		//•	o número de outros calmos;
		System.out.println("\n TOTAL OUTROS CALMOS: " + outrosCalmo);
		
		//•	o número de pessoas nervosas com mais de 40 anos; 
		System.out.println("\n TOTAL NERVOSO COM MAIS DE 40 ANOS " + maisQuarenta);
		
		//•	o número de pessoas calmas com menos de 18 anos.
		System.out.println("\n TOTAL CALMO COM MENOS DE 18 " + menosDezoito);
		
		
	//fim 
	}

}
