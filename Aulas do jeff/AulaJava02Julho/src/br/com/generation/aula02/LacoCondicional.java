package br.com.generation.aula02;

import java.io.IOException;
import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		
		//ativando o scanner do teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		
		//declarando variveis
		double nota1, nota2, nota3, nota4, media;
		
		
		//recendo o valor da  1� nota
		System.out.println("Digite a 1� nota: ");
		nota1 = leiaTeclado.nextDouble();
		
		//recendo o valor da  2� nota
		System.out.println("Digite a 2� nota: ");
		nota2 = leiaTeclado.nextDouble();
		
		//recendo o valor da  3� nota
		System.out.println("Digite a 3� nota: ");
		nota3 = leiaTeclado.nextDouble();
		
		//recendo o valor da  4� nota
		System.out.println("Digite a 4� nota: ");
		nota4 = leiaTeclado.nextDouble();
		
		//somando os valores e dividindo por 4 para encontrar a  m�dia
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
        
        
		//se o aluno estiver aprovado fa�a
		if (media >= 6 && media <= 10) {
			
			System.out.println("\n M�dia: " + media + "\n Aluno Aprovado");
			
		}//se o aluno estiver  recupera��o fa�a
		else if (media >= 3 && media < 6) {
			
			System.out.println("\n M�dia: " + media + "\n Aluno Recupera��o");
			
		}// se o aluno estiver reprovado  fa�a
		else if (media >= 0 && media < 3){
			
			System.out.println("\n M�dia: " + media + "\n Aluno Reprovado");

		}// se o aluno n�o estiver em nunhuma das veirifica��es fa�a
		else {
			
				System.out.println("Verifique as notas digitadas, pois o valor n�o corresponde");
		}
		

	//fim programa
	}
	
	

}
