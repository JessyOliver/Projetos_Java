package br.com.generation.laçodowhile;

public class ExemploDoWhile01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//declarando variavel
		int i = 0;
		
		do {
			
			//pegue avariavel e soma mais 1
			System.out.println(i++);
			
			//i++;
			Thread.sleep(500);
			
		} while (i != 15 );//enquanto for diferente de 15 
		
		
	//fim 	public static void main
	}

}
