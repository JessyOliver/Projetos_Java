package br.com.generation.matriz;

public class ExemploMatriz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] notasAlunos = new double[2][4];
				
				//linhas[0].. colunas[0]..
				notasAlunos[0][0]= 5;
				notasAlunos[0][1]= 5;
				notasAlunos[0][2]= 5;
				notasAlunos[0][3]= 5;
				
				//linhas[1].. colunas[0]..
				notasAlunos[1][0]= 6;
				notasAlunos[1][1]= 6;
				notasAlunos[1][2]= 6;
				notasAlunos[1][3]= 6;
				
				Double soma, media=0.0;
				
				System.out.println("\tCALCULANDO A MEDIA DAS NOTAS");
				
				for (int linha = 0; linha < notasAlunos.length; linha++) {
					
					//é necessário atribuir o valor da variavel soma dentro do laço
					//para não ter excesso de atribuição de valores
					soma = 0.0;
					//exibindo qual linha estamos
					System.out.print(" linha " + linha + " | ");
					
					//iniciando o laço coluna
					for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
						
						//somando as notas
						soma += notasAlunos[linha][coluna];
							
						//exibindo o conteudo de cada coluna
							System.out.print(   notasAlunos[linha][coluna] + " | ");
					}
					
					//calculando media
					media = soma / 4;
					System.out.print(" Média: " + media);
					System.out.println();
					
					
				}

	//fim programa
	}

}
