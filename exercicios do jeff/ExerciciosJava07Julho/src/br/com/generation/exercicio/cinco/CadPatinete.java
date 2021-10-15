package br.com.generation.exercicio.cinco;

import java.util.Scanner;

public class CadPatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///importando scanner
				Scanner leiaTeclado = new  Scanner(System.in);
				
		//importando class patinete
		Patinete cadPatinete = new Patinete();
		
		
		
		System.out.println("--------------------");
		System.out.println("CADASTRANDO PATINETE");
		System.out.println("--------------------");
		
		System.out.println("Marca: ");
		cadPatinete.setMarca(leiaTeclado.next());
	
		System.out.println("Tipo: ");
		cadPatinete.setTipo(leiaTeclado.next());
		
		System.out.println("Classificação Adulto/Infantil:");
		cadPatinete.setClassificacaoUso(leiaTeclado.next());
		
		System.out.println("Codigo do Produto: ");
		cadPatinete.setCodigo(leiaTeclado.next());
		
		System.out.println("Preço: ");
		cadPatinete.setPreco(leiaTeclado.nextDouble());
		
		System.out.println("Codigo de barras:");
		cadPatinete.setCodigoBarras(leiaTeclado.nextDouble());
		
		
		System.out.println("--------------------");
		System.out.println("EXIBINDO PATINETE");
		System.out.println("--------------------");
		
		System.out.println("Marca: " + cadPatinete.getMarca());	
	
		System.out.println("Tipo: " + cadPatinete.getTipo());		
		
		System.out.println("Classificação Adulto/Infantil:" + cadPatinete.getClassificacaoUso());
		
		System.out.println("Codigo do Produto: " + cadPatinete.getCodigoBarras());
		
		System.out.println("Preço: " + cadPatinete.getPreco());
		
		System.out.println("Codigo de barras:" + cadPatinete.getCodigoBarras());

	}

}
