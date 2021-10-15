package estoque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControlandoEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ativando teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//iniciando array
		ArrayList<EstoqueLoja> estoque = new ArrayList<>();
		
		///variaveis que iram receber os valores
		String tipoProdut, nomeProdut;
		int quantProdut, numProdutosAdd, deletProduto;
		
		System.out.println("Deseja adicionar quantos produtos? ");
		numProdutosAdd = leiaTeclado.nextInt();
		
		System.out.println();
		System.out.println("============CADASTRO DE PRODUTOS===========");
		System.out.println();
		
		//for iniciado com a quantidade informada pelo usuario
		for (int i = 0; i < numProdutosAdd; i++) {
			System.out.println();
			System.out.println((i+1) + "° PRODUTO");
			System.out.println("Tipo: ");
			tipoProdut = leiaTeclado.next();
			
			//pulando linha
			leiaTeclado.nextLine();
			
			System.out.println("Nome: ");
			nomeProdut = leiaTeclado.next();
			
			//pulando linha
			leiaTeclado.nextLine();
			
			System.out.println("Quantidade: ");
			quantProdut = leiaTeclado.nextInt();
			
			//preenchendo array
			estoque.add(new EstoqueLoja(tipoProdut, nomeProdut, quantProdut));
			
		}// fim do for
		
		System.out.println();
		System.out.println("============EXIBINDO PRODUTOS===========");
		System.out.println();
		
		for (EstoqueLoja i: estoque) {
						
			System.out.println(i);
			
		}
		
		System.out.println();
		System.out.println("============REMOVER PRODUTOS===========");
		System.out.println();
		
		System.out.println("Digite a posição do Produto a ser deletado:");
		deletProduto = leiaTeclado.nextInt();
		
		estoque.remove(deletProduto-1);
		
		System.out.println();
		System.out.println("============EXIBINDO PRODUTOS ATUALIZADOS===========");
		System.out.println();
		
		Collections.shuffle(estoque);
		//Collections.sort(estoque);
		
		for (EstoqueLoja i: estoque) {
			
			System.out.println(i);
			
		}
		
		leiaTeclado.close();

	}//FIM VOI MAIN
	
	

}
