package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ativando scanner 
		Scanner leiaTeclado = new Scanner(System.in);
		
		//declarando array dentro da variavel
		int[] arrayVetor = new int[5];//espa�os[0][1][2][3][4]

		//colocando algo dentro do vetor da posi�ao [3]
		arrayVetor[3] = 10;
		
		for (int i = 0; i <= 4; i++) {
			
			//posi��o do arraay i | e o que tem dentro dessa posi��o [i]
			System.out.println(i + " | " + arrayVetor[i]);
			
		//fim for	
		}
		
	//fim programa
	}

}
