package br.com.erroscodigos;

public class Exception {
	
	public static void main(String args[]) {
		
		int[] vetor = new int[4];// tem as posi�oes [0][1][2][3]
		
		System.out.println("\n Antes do erro (vetor[4] = 10;) essa express�o esta fora do vetor criado");
		
		
		System.out.println("\n  (vetor[3] = 10;) correto pois est� dentro do index");

		//para tratar possiveis erros que o cliente pode calsar
		try {
			
			// vetor[4] = 10;//vai dar erro pois a posi��o 4 n�o existe
			vetor[4] = 10;
			System.out.println(" \n Exception");
			
			
		}//trata o erro e faz um e exibe 
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("\n Apos o erro ,o tratamento faz a gambiarra funcionar, porem valor n�o aceito");
		}
		
		
		

		
	}

}
