package br.com.generation.exercicios05Julho;

public class ExercicioUmFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR) */
		 
		 //iniciando em 1000; enquanto i <= 1999; refaça o calculo
		 for (int i = 1000; i <= 1999; i++) {
			 
			 //se o resto da divisão for 5 escreva o numero na tela
			 if (i %11 == 5) {
				 
				System.out.println(i);
				
			//fim if
			}
		
	    //fim do for
		}

	//fim public static void main
	}

}
