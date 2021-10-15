package br.com.generation.exerciciodois;

import java.util.Scanner;

public class CadastroAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importação da class avião
		Aviao aviaoCadastro = new Aviao();
		
		//importar a class scanner
		Scanner leiaTeclado = new Scanner(System.in);
		
		System.out.println("-----------------");
		System.out.println("CADASTRO AVIÃO ");
		System.out.println("-----------------");

		
		System.out.println("Tipo: "); //Jato
		aviaoCadastro.setTipo(leiaTeclado.next());
		
		System.out.println("Modelo: "); ///Boeing
		aviaoCadastro.setModelo(leiaTeclado.next());
		
		System.out.println("Ano Construido: "); //1991
		aviaoCadastro.setAnoContruido(leiaTeclado.next());
		
		System.out.println("Localidade: "); //Estados Unidos
		aviaoCadastro.setLocalidade(leiaTeclado.next());
		
		System.out.println("Preço "); //950.000,00
		aviaoCadastro.setPreço(leiaTeclado.nextDouble());
		
		
		
		System.out.println("--------------------------");
		System.out.println("EXIBINDO AVIÃO CADASTRADO ");
		System.out.println("--------------------------");

		System.out.println("Tipo: " + aviaoCadastro.getTipo());

		System.out.println("Modelo: " + aviaoCadastro.getModelo());
		
		System.out.println("Ano Construido: " + aviaoCadastro.getAnoContruido());
		
		System.out.println("Localidade: " + aviaoCadastro.getLocalidade());
		
		System.out.println("Preço: " + aviaoCadastro.getPreço());

		
		
	}

}
