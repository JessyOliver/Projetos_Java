package br.com.generation.vetor;

public class ExemploVetor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declarando variaveis com temperaturas
		//double tempoDia001 = 31.3, tempoDia002 = 28.0, tempoDia003 = 15.8;
		//fica obsoleto se ja temos um vetor que armazena cada espaço
		
		//vetor com 10 posições
		double[] temperaturas = new double[10];//[0][1]...[8][9]
				
		//atribuindo valores a cada espaço do vetor
		temperaturas[0] = 31.3;
		temperaturas[1] = 28.0;
		temperaturas[2] = 15.3;
		
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			//exibindo na tela os valores de cada posição do array
			System.out.println("O valor da temperatu na posição: " 
									+ (i+1) + "º é "+ temperaturas[i]);
			
			//como a contagem se inicia em 0 colocamos (i+1) para iniciar em 1

		}
		
		System.out.println("\n\n O valor da temperatu na posição: " 
							+ temperaturas[1]);
		
		System.out.println("\n O tamanho do array: " 
								+ temperaturas.length);//para saber o tamanho se usa length

	//fim programa
	}

}
