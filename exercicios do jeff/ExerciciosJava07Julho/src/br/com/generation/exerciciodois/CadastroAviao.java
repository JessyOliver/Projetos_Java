package br.com.generation.exerciciodois;

import java.util.Scanner;

public class CadastroAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importa��o da class avi�o
		Aviao aviaoCadastro = new Aviao();
		
		//importar a class scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		System.out.println("-----------------");
		System.out.println("CADASTRO AVI�O ");
		System.out.println("-----------------");

		
		System.out.println("Tipo: "); //Jato
		aviaoCadastro.setTipo(leiaTeclado.next());
		
		System.out.println("Modelo: "); ///Boeing
		aviaoCadastro.setModelo(leiaTeclado.next());
		
		System.out.println("Ano Construido: "); //1991
		aviaoCadastro.setAnoContruido(leiaTeclado.next());
		
		System.out.println("Localidade: "); //Estados Unidos
		aviaoCadastro.setLocalidade(leiaTeclado.next());
		
		System.out.println("Pre�o "); //950.000,00
		aviaoCadastro.setPre�o(leiaTeclado.nextDouble());
		
		
		
		System.out.println("--------------------------");
		System.out.println("EXIBINDO AVI�O CADASTRADO ");
		System.out.println("--------------------------");

		System.out.println("Tipo: " + aviaoCadastro.getTipo());

		System.out.println("Modelo: " + aviaoCadastro.getModelo());
		
		System.out.println("Ano Construido: " + aviaoCadastro.getAnoContruido());
		
		System.out.println("Localidade: " + aviaoCadastro.getLocalidade());
		
		System.out.println("Pre�o: " + aviaoCadastro.getPre�o());

		
		
	}

}
