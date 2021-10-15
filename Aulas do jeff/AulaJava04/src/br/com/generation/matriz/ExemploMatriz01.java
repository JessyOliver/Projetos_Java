package br.com.generation.matriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] notasAlunos = new double[2][4];
		
		//linhas[0].. colunas[0]..
		notasAlunos[0][0]= 8.9;
		notasAlunos[0][1]= 9.9;
		notasAlunos[0][2]= 8.9;
		notasAlunos[0][3]= 6.9;
		
		//linhas[1].. colunas[0]..
		notasAlunos[1][0]= 8.9;
		notasAlunos[1][1]= 4.9;
		notasAlunos[1][2]= 6.9;
		notasAlunos[1][3]= 5.9;
		
		System.out.println("Valores da matriz");
		for (int linha = 0; linha < notasAlunos.length; linha++) {
			
			System.out.print(" linha " + linha + " | ");
			
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				
				System.out.print(   notasAlunos[linha][coluna] + " | ");
			}
			System.out.println();
		}
		
		
	//fim programa
	}

}
