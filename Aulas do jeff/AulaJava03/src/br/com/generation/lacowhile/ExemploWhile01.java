package br.com.generation.lacowhile;

public class ExemploWhile01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int contador = 0;
		
		while (contador <= 10) {
			
			System.out.println("Repetição nr: " + contador);
			
			contador++;
			//uma classe java que manipulam como os dados se comportaram no pc
			//processsando em milisegundos
			Thread.sleep(1000); //controlando o tempo de processamento
			
		//fim while
		}
		
//fim public static void main
	}

}
