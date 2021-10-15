package br.com.generation.exercicio.seis;

import java.util.Scanner;

public class ManipulandoConta {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//importando class ContaBAncaria
		ContaBancaria manipulaConta = new ContaBancaria();
		
		int opcao;
		
		/*private String nomeCliente, tipoCliente, TipoConta, numeroConta;
		private double saldo;*/
		
		System.out.println("--------------");
		System.out.println("CONTA BANCARIA");
		System.out.println("--------------");
		
		System.out.println("Nome: ");
		manipulaConta.setNomeCliente(leiaTeclado.next());
		
		System.out.println("Tipo Cliente: ");
		manipulaConta.setTipoCliente(leiaTeclado.next());
		
		System.out.println("Tipo Conta");
		manipulaConta.setTipoConta(leiaTeclado.next());
		
		System.out.println("Numero da Conta");
		manipulaConta.setNumeroConta(leiaTeclado.next());
		
		//System.out.println("Saldo");
		manipulaConta.setSaldo(2000.00);
		
		System.out.println("Para sacar digite 1 \n Para depositar digite 2");
		opcao = leiaTeclado.nextInt();
		
		if (opcao == 1) {
			
			System.out.println("Digite o valor: ");
			manipulaConta.sacar(leiaTeclado.nextDouble());
			
			System.out.println("R$ " + manipulaConta.getSaldo() + " ");

			
		}else {
			
			System.out.println("Digite o valor: ");
			manipulaConta.depositar(leiaTeclado.nextDouble());
			
			System.out.println("R$ " + manipulaConta.getSaldo() + " ");
			
		}

		System.out.println("-----------------------");
		System.out.println("EXIBINDO CONTA BANCARIA");
		System.out.println("-----------------------");
		
		System.out.println("Nome: " + manipulaConta.getNomeCliente());
		
		System.out.println("Tipo Cliente: " + manipulaConta.getTipoCliente());
		
		System.out.println("Tipo Conta: " + manipulaConta.getTipoConta());
		
		System.out.println("Numero da Conta: " + manipulaConta.getNumeroConta());
		
		System.out.println("Saldo: R$ " + manipulaConta.getSaldo());
		
	}
	
	

}
