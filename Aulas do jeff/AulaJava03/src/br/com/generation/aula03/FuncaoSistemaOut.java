package br.com.generation.aula03;

public class FuncaoSistemaOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println --> Insere uma nova linha deixa o marcador 
		//posicionado na linha abaixo
		System.out.println("Meu texto sempre em aspas duplas");

		//System.out.print --> Mantém o cursor na linha
		//somente \n para uma linha
		System.out.print("\n Antonio Vieira dos Santos ");
		System.out.print("\n Jose dos Santos ");
		System.out.print(" CAmila Santos ");
		
		//System.out.printf --> especifica o formato do tipo de valor
		//String --> cadeia de caracteres
		//%s esta relacionado com uma String
		// \n%s o primeiro imprime o 1° nome "Marcela"
		// \n%s o segundo imprime o 2° nome "Nogueira"
		//para concatenar printf usa-se  a --> ,
		System.out.printf("\n%s \n%s \n", "Marcela" , "Nogueira");

		int num1 = 10;
		int num2 = 30;
		
		System.out.print("\n" + num1 + " + " + num2 + " = ");
		//%d pega os resultados inteiros
		System.out.printf(" %d%n",(num1 + num2) );
		
		//double --> numeros fracionários
		double num3 = 2.7, num4 = 2.9;
		System.out.print("\n" + num3 + " + " + num4 + " = ");
		//%f tabalha com float no caso de double é %ff
		System.out.printf(" %2f%n",(num3 + num4) );

		


		
	//fim 	public static void main
	}

}
