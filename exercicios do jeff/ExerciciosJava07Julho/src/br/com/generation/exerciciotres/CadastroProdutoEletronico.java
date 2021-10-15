package br.com.generation.exerciciotres;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class CadastroProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String nome, marca, modelo, codigo;
			double preco, codigoBarra;*/
		
		//instanciando teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//instanciando classe ProdutoEletronico
		ProdutoEletronico cadProdutoEletronico = new ProdutoEletronico();
		
		//recebendo valores
		System.out.println("--------------------------------");
		System.out.println("CADASTRO DE PRODUTOS ELETRONICOS");
		System.out.println("--------------------------------");

		System.out.println("Nome: ");
		cadProdutoEletronico.setNome(leiaTeclado.next());
		
		System.out.println("Marca: ");
		cadProdutoEletronico.setMarca(leiaTeclado.next());
		
		System.out.println("Modelo: ");
		cadProdutoEletronico.setModelo(leiaTeclado.next());
		
		System.out.println("Codigo do Produto: ");
		cadProdutoEletronico.setCodigo(leiaTeclado.next());
		
		System.out.println("Preço: ");
		cadProdutoEletronico.setPreco(leiaTeclado.nextDouble());
		
		System.out.println("Codigo de barras: ");
		cadProdutoEletronico.setCodigoBarra(leiaTeclado.nextDouble());
		
		
		//exibindo valores
		System.out.println("--------------------------------");
		System.out.println("EXIBINDO PRODUTOS ELETRONICOS");
		System.out.println("--------------------------------");

		System.out.println("Nome: " + cadProdutoEletronico.getNome());

		System.out.println("Marca: " + cadProdutoEletronico.getMarca());
		
		System.out.println("Modelo: " + cadProdutoEletronico.getModelo());
		
		System.out.println("Codigo do produto: " + cadProdutoEletronico.getCodigo());
		
		System.out.println("Preço: " + cadProdutoEletronico.getPreco());
		
		System.out.println("Codigo de Barra: " + cadProdutoEletronico.getCodigoBarra());







		
		
		

	}

}
