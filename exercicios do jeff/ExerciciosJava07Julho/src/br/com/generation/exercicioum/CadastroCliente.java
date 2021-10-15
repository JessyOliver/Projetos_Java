package br.com.generation.exercicioum;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class CadastroCliente {
	
	/*
	 		1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
	 		 em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
	 		  informações deste objeto no console.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cadastroCliente = new Cliente();
		
		Scanner leiateclado = new Scanner(System.in);
		
		System.out.println("-----------------------");
		System.out.println("---CADASTRO CLIENTE---");
		System.out.println("-----------------------");

		System.out.println("Nome: ");
		cadastroCliente.setNome(leiateclado.next()) ;
		
		System.out.println("Data Nascimento: ");
		cadastroCliente.setDataNascimento(leiateclado.next());
		
		System.out.println("Idade: ");
		cadastroCliente.setIdade(leiateclado.nextInt());
		
		System.out.println("Endereço: ");
		cadastroCliente.setEndereço(leiateclado.next());
		
		System.out.println("Cidade: ");
		cadastroCliente.setCidade(leiateclado.next());
		
		System.out.println("Estado: ");
		cadastroCliente.setEstado(leiateclado.next());
		
		System.out.println("Telefone: ");
		cadastroCliente.setTelefone(leiateclado.next());
		
		System.out.println("E-mail: ");
		cadastroCliente.setEmail(leiateclado.next());
		
		
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("CADASTRO CLIENTE FINALIZADO");
		System.out.println("-----------------------");
		
		System.out.println(cadastroCliente.getNome());
		
		System.out.println(cadastroCliente.getDataNascimento());
		
		System.out.println(cadastroCliente.getIdade());
		
		System.out.println(cadastroCliente.getEndereço());
		
		System.out.println(cadastroCliente.getCidade());
		
		System.out.println(cadastroCliente.getEstado());
		
		System.out.println(cadastroCliente.getTelefone());
		
		System.out.println(cadastroCliente.getEmail());
		
		
		
		
	//fim Programa	
	}

}
