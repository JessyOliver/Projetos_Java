package br.com.generation.lacowhile;

import java.util.Scanner;

public class ExemploWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leiaTeclado = new Scanner(System.in);
		
		int numero = -1;
		

		//o trecho de código deve se repetir
		System.out.println("Digite um numero: ");
		numero = leiaTeclado.nextInt();
		
		//enquanto a variavel numero for diferente de10,
		while (numero != 10) {
			
	
			if (numero == 10) {
				
				System.out.println(" Você acertou, fim de jogo!  \n ");
			}
			else {
				System.out.println(" Você Errou! \n ");
			}
			
		//fim while	
		}
		
	//fim public static void main
	}

}
