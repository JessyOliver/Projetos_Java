package br.com.generation.lacowhile;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int numero = 10;
		
		while (numero > 0) {
			
			System.out.println("\n contando: " + numero--);
			//contagem recreciva
			//numero--;
			Thread.sleep(1000);
			
		//fim while				
		}
		
		System.out.println("\n contagem parada....");
	//fim public static void main
	}

}
