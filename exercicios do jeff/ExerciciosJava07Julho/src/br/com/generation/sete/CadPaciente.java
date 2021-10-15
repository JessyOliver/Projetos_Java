package br.com.generation.sete;

import java.util.Scanner;

public class CadPaciente {

	public static void main(String[] args) {
		
		//scanner
		Scanner leiaTeclado = new Scanner(System.in);
					
		//import class Paciente
		Paciente cadPaciente = new Paciente();
		
		
		System.out.println("------------------");
		System.out.println("CADASTRA PACIENCIA");
		System.out.println("------------------");
		
		// nome, dataNascimento, rg, cpf, celular, endereco;
		System.out.println("Nome: ");
		cadPaciente.setNome(leiaTeclado.next());
		
		System.out.println("RG: ");
		cadPaciente.setRg(leiaTeclado.next());
		
		System.out.println("CPF: ");
		cadPaciente.setCpf(leiaTeclado.next());
		
		System.out.println("Celular: ");
		cadPaciente.setCelular(leiaTeclado.next());
		
		System.out.println("Endereço: ");
		cadPaciente.setEndereco(leiaTeclado.next());
		
		System.out.println();
		
		System.out.println("------------------");
		System.out.println("EXIBIR PACIENCIA");
		System.out.println("------------------");
		
		// nome, dataNascimento, rg, cpf, celular, endereco;
		System.out.println("Nome: " + cadPaciente.getNome());
		
		System.out.println("RG: " + cadPaciente.getRg());
		
		System.out.println("CPF: " + cadPaciente.getCpf());
		
		System.out.println("Celular: " + cadPaciente.getCelular());
		
		System.out.println("Endereço: " + cadPaciente.getEndereco());
		
		
	}
	
	
}
