package br.com.cestafacil;

import java.util.Scanner;

public class Main {

	//cpf teste
	//38319209072
	
	//cnpj teste
	//25973075000180
	
	static int opcao;
	static String cpfAtual;
	static String cnpjAtual;

	public static void main(String[] args) {
		cpfAtual = null;
		cnpjAtual = null;

		System.out.println(" .d8888b.                    888                  8888888888                d8b 888 \r\n"
				+ "d88P  Y88b                   888                  888                       Y8P 888 \r\n"
				+ "888    888                   888                  888                           888 \r\n"
				+ "888         .d88b.  .d8888b  888888  8888b.       8888888  8888b.   .d8888b 888 888 \r\n"
				+ "888        d8P  Y8b 88K      888        \"88b      888         \"88b d88P\"    888 888 \r\n"
				+ "888    888 88888888 \"Y8888b. 888    .d888888      888     .d888888 888      888 888 \r\n"
				+ "Y88b  d88P Y8b.          X88 Y88b.  888  888      888     888  888 Y88b.    888 888 \r\n"
				+ " \"Y8888P\"   \"Y8888   88888P'  \"Y888 \"Y888888      888     \"Y888888  \"Y8888P 888 888 \r\n"
				+ "                                                                                    \r\n"
				+ "                                                                                    \r\n"
				+ "                                                                                    ");

		telaInicial();
	}

	static boolean estaLogado() {
		return (cpfAtual != null || cnpjAtual != null);
	}

	static void telaInicial() {
		if (!estaLogado()) {
			System.out.println("------------------ Cesta Fácil ------------------");
			System.out.println("\n1 - Cadastro de pessoa\n2 - Cadastro de empresa\n3 - Login");
			System.out.println("\n-------------------------------------------------");

			System.out.print("\nOpção: ");
		} else {
			System.out.println("------------------ Cesta Fácil ------------------");
			System.out.println("\n1 - Doar alimentos\n2 - Mostrar cestas\n3 - Deslogar");
			System.out.println("\n-------------------------------------------------");

			System.out.print("\nOpção: ");
		}
		getOpcao();
	}

	static void getOpcao() {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);

		opcao = read.nextInt();

		if (opcao != 1 && opcao != 2 && opcao != 3) {
			System.out.print("\nOpção inválida\n");
			telaInicial();
		}

		if (!estaLogado()) {
			switch (opcao) {
			case 1:
				cpfAtual = Dados.cadastrarPessoa();
				telaInicial();
				break;
			case 2:
				cnpjAtual = Dados.cadastrarEmpresa();
				telaInicial();
				break;
			case 3:
				String temp = Dados.login();
				if (temp.length() == 11) {
					cpfAtual = temp;
					telaInicial();
					break;
				} else {
					cnpjAtual = temp;
					telaInicial();
					break;
				}
			}
		} else {
			switch (opcao) {
			case 1:
				if (cpfAtual != null) {
					Dados.pessoas.get(cpfAtual).doar(1, cpfAtual);
					telaInicial();
					break;
				} else if (cnpjAtual != null) {
					Dados.empresas.get(cnpjAtual).doar(2, cnpjAtual);
					telaInicial();
					break;
				}
				break;
			case 2:
				System.out.println("\nConseguimos montar " + Cesta.getCestas() + " cestas básicas completas!\n");
				telaInicial();
				break;
			case 3:
				cpfAtual = null;
				cnpjAtual = null;
				System.out.println("\nDeslogado com sucesso.");
				telaInicial();
				break;
			}
		}
	}
}
