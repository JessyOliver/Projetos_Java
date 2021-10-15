package br.com.generation.lacofor;

public class Exemplofor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5, i, soma;
		
		
		//todos se iniciam com 0
		for (i=0, soma=0; i < n; i++) {
			
			//inicio do laço o valor da soma 
			System.out.print("Soma: " + soma + "  + " + i );//usando print para não pular linha
			
			//soma com o proximo valor de soma do laço
			soma += i;
			
			//imprime o resultado na tela
			System.out.println(" = " + soma + " " );
		
		//fim do laço for
		}
		
		
		//fim
	}

}
