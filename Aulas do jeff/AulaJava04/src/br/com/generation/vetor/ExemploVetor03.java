package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ativando scanner 
		Scanner leiaTeclado = new Scanner(System.in);
		
		//vetor com 10 posições
		double[] notas = new double[4];
		double soma = 0.0, media = 0.0;
		int i,j;
		
		
		System.out.println("Digite as 4 notas do aluno ");
		for (i = 0, j= 1; i < notas.length; i++, j++) {
			
			//mensagem para antes de receber a nota
			System.out.println(j + "° Nota: ");
			
			//recebendo as notas do aluno
			notas[i] = leiaTeclado.nextDouble();
			
			//somando as notas recebidas
			soma += notas[i];
			
			// a media da soma dividido pena quantidade de notas recebidas
			media= soma/j;
			
		}
		
		//exibindo resultados
		System.out.println("Total: " + soma +"\n Média: " + media);
		
	//fim programa
	}

}
