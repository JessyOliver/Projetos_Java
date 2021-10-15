package br.com.generation.cadastro;

import java.util.Scanner;

import br.com.generation.controledados.CpfValidar;
import br.com.generation.controledados.Senha;
import br.com.generation.controledados.ValidandoTelefone;
import br.com.generation.controledados.ValidarEmail;
import br.com.generation.informacoes.Doadores;

public class CadastroGeral {
	
	
		
	public static   void cadastra() {

		//importando dados das class Pessoa e Doadores
		Doadores cadDoadores = new Doadores();
		
		//ativando teclado
		Scanner leiaTeclado = new Scanner(System.in);
		
		String value,  pattern;
		
		//variavel controla login
		String emailLogin, senhaLogin;

		System.out.println("Nome: ");
		cadDoadores.setNome(leiaTeclado.next());
	
		//cpf teste: 03437935046
		System.out.println("CPF: ");
		cadDoadores.setCpf(leiaTeclado.next());
		
		
		//verificaï¿½ï¿½o de cpf
		if (CpfValidar.valida(cadDoadores.getCpf()) == true) {
			
			System.out.println("Se estiver doando em nome de alguma empresa informe.");
			System.out.println("Nome Empresa: ");
			cadDoadores.setNomeEmpresa(leiaTeclado.next());
			
			System.out.println("Endereço: ");
			cadDoadores.setEndereco(leiaTeclado.next());
			
			System.out.println("N° ");
			cadDoadores.setNumLocal(leiaTeclado.next());
			
			System.out.println("Bairro: ");
			cadDoadores.setBairro(leiaTeclado.next());
			
			System.out.println("Cidade: ");
			cadDoadores.setCidade(leiaTeclado.next());
			
			System.out.println("Estado: ");
			cadDoadores.setEstado(leiaTeclado.next());
			
			System.out.println("CEP: ");
			cadDoadores.setCep(leiaTeclado.next());
			
			System.out.println("Celular: ");
			cadDoadores.setCelular(leiaTeclado.next());
			
			if (ValidandoTelefone.validaCelu(cadDoadores.getCelular()) == true) {
				
				System.out.println("Telefone: ");
				cadDoadores.setTelefone(leiaTeclado.next());
				
				if (ValidandoTelefone.validaTelef(cadDoadores.getTelefone())  == true) {
					
					
					
					System.out.println("E-mail: ");
					cadDoadores.setEmail(leiaTeclado.next());
					
					//verificando se o meail ï¿½ valido
					if (ValidarEmail.email(cadDoadores.getEmail()) == true) {
							
						System.out.println("Digite senha:");
						cadDoadores.setSenha(leiaTeclado.next());
						
						System.out.println("Confirme senha: ");
						cadDoadores.setSenhaConfrim(leiaTeclado.next());
						
						if (Senha.senha(cadDoadores.getSenha(), cadDoadores.getSenhaConfrim())  == true) {
							
							
							System.out.println("---------------------------");
							System.out.println("USUÁRIO CADASTRADO COM SUCESSO REALIZE LOGIN");
							System.out.println("---------------------------");
							
							
							/* System.out.println("---------------------------");
							System.out.println("EXIBINDO USUï¿½RIO CADASTRADO");
							System.out.println("---------------------------");

							System.out.println("Nome: " + cadDoadores.getNome());
							
				            System.out.printf(" CPF: %s\n ", CpfValidar.imprimeCPF(cadDoadores.getCpf()) + " Valido.");
				            
				            System.out.println("Nome Empresa: " + cadDoadores.getNomeEmpresa());
				            
				            System.out.println("Endereï¿½o: " + cadDoadores.getEndereco());
							
							System.out.println("Nï¿½ " + cadDoadores.getNumLocal());
							
							System.out.println("Bairro: " + cadDoadores.getBairro());
							
							System.out.println("Cidade: " + cadDoadores.getCidade());
							
							System.out.println("Estado: " + cadDoadores.getEstado());
							
							System.out.println("CEP: " + cadDoadores.getCep());
							
							System.out.println("Celular: " + cadDoadores.getCelular());
							
							System.out.println("Telefone: " + cadDoadores.getTelefone());
							
							System.out.println("E-mail: " + cadDoadores.getEmail());
							
							System.out.println("Senha:" + cadDoadores.getSenha());
							
							for (int i = 0; i < 5; i++) {
								
								System.out.println("");
								
							}
							*/
							
							System.out.println("----------");
							System.out.println("TELA LOGIN");
							System.out.println("----------");
							
							
							System.out.println("Email:");
							emailLogin = leiaTeclado.next();
							
							System.out.println("Senha:");
							senhaLogin = leiaTeclado.next();
							
							if (cadDoadores.getEmail().equals(emailLogin) && cadDoadores.getSenha().equals(senhaLogin)) {
								
								System.out.println("\n Logando.........");
								
							}
							else {
								
								System.out.println("e-mail ou senha incorretos.");
							}
							
						}
						else {
							
							System.out.println("Senhas diferentes");
						}
						
						
					//fim da verificaï¿½ï¿½o do email	
					}
					else {
						
						System.out.println("Email invalido");
					}
						
					
				}///fim verificaï¿½ï¿½o telefone
				 else {
					
					 System.out.println("Telefone invalido");
				}
				
				
			}//fim verificaï¿½ï¿½o celular
			else {
				System.out.println("Celular Invalido");
			}
			
			
			
			
		//fimverificaï¿½ï¿½o cpf	
		}
		else {
			
			 System.out.printf("Erro, CPF invalido !!! \n");
           
		}
		
	//fim public static void cadastra() 	
	}

	
	
	//fim de tudo
}
