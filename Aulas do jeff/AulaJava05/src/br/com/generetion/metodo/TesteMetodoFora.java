package br.com.generetion.metodo;

public class TesteMetodoFora {
	
	static String cont(int i, int f) {
			
		String numeroString = "";
		
		for (int contador = i; contador <= f; contador++) {
			
			numeroString += contador + ", ";
			
		}
		return numeroString;
		
	}
	
	static void foraFrase() {
		// TODO Auto-generated method stub
		System.out.println("\n Olá mundo! metodo Fora2");

	}
	

}
