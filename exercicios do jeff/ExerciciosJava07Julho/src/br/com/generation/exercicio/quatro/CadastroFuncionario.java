package br.com.generation.exercicio.quatro;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//ativando scanner teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		//importando metodos da class Funcionario
		Funcionario cadFuncionario = new Funcionario();
		
		
		
		//recebendo dados para o cadastro
		System.out.println("=====================");
		System.out.println("CADASTRO FUNCIONARIO");
		System.out.println("=====================");
		
		/*String nomeCompleto, dataNascimento, cpf, rg, rua, bairro, cidade, estado, cep, cargo;
		double salario;*/
		System.out.println("Nome Completo: ");
		cadFuncionario.setNomeCompleto(leiaTeclado.next());
		
		System.out.println("Data Nascimento: ");
		cadFuncionario.setDataNascimento(leiaTeclado.next());
		
		System.out.println("CPF: ");
		cadFuncionario.setCpf(leiaTeclado.nextInt());
		
		System.out.println("RG: ");
		cadFuncionario.setRg(leiaTeclado.nextInt());
		
		System.out.println("Rua:");
		cadFuncionario.setRua(leiaTeclado.next());
		
		System.out.println("Bairro: ");
		cadFuncionario.setBairro(leiaTeclado.next());
		
		System.out.println("Cidade: ");
		cadFuncionario.setCidade(leiaTeclado.next());
		
		System.out.println("Estado: ");
		cadFuncionario.setEstado(leiaTeclado.next());
		
		System.out.println("CEP: ");
		cadFuncionario.setCep(leiaTeclado.next());
		
		System.out.println("Cargo: ");
		cadFuncionario.setCargo(leiaTeclado.next());
		
		System.out.println("Salário: ");
		cadFuncionario.setSalario(leiaTeclado.nextDouble());

		//exibindo dados coletados
		System.out.println("==================================");
		System.out.println("EXIBINDO O CADASTRO DO FUNCIONARIO");
		System.out.println("==================================");
		
		System.out.println("Nome Completo: " + cadFuncionario.getNomeCompleto());
		
		System.out.println("Data Nascimento: " + cadFuncionario.getDataNascimento());
		
		System.out.println("CPF: " + cadFuncionario.getCpf());
		
		System.out.println("RG: " + cadFuncionario.getRg());
		
		System.out.println("Rua:" + cadFuncionario.getRua());
		
		System.out.println("Bairro: " + cadFuncionario.getBairro());
		
		System.out.println("Cidade: " + cadFuncionario.getCidade());
		
		System.out.println("Estado: " + cadFuncionario.getEstado());
		
		System.out.println("CEP: " + cadFuncionario.getCep());
		
		System.out.println("Cargo: " + cadFuncionario.getCargo());
		
		System.out.println("Salário: " + cadFuncionario.getSalario());

		
		
		
		//fim public static void main
	}

}
