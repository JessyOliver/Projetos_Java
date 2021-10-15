package br.com.generation.controledados;

import java.util.InputMismatchException;

public class CpfValidar {
	
	///atributos
	
	public static boolean valida(String cpf){ 
		
		
		char digitos10, digitos11;
		int  i, resto11, converterNum, soma, conteDecrescente;
		
		//verificanddo se os digitos digitados s�o aceitos
		if (cpf == "00000000000" ||
			cpf == "11111111111" ||
			cpf == "22222222222" ||
			cpf == "33333333333" ||
			cpf == "44444444444" ||
			cpf == "55555555555" ||
			cpf == "66666666666" ||
			cpf == "77777777777" ||
			cpf == "88888888888" ||
			cpf == "99999999999" ||
			(cpf.length() != 11)) 
		{
				//se os valores forem iguais aos de cima o programa retor um erro
				return false;
				
		}
			//fim do 1� if verifica��o de cpf
		
		
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		//verificando se o cpf � valido
		try {
			
			//iniciando a variavel soma e o contador decrescente
			soma=0; conteDecrescente= 10;
			
			//verificando o 10� para saber se � valido ou n�o
			for ( i = 0; i < 9; i++) {
				
		        // por exemplo, transforma o caractere '0' no inteiro 0
		        // (48 eh a posicao de '0' na tabela ASCII)
				//convertendo String para a numero
				converterNum = (int)(cpf.charAt(i) - 48);
				
				//a soma recebe o valor da mulpica��o e soma os resultados
				soma += (converterNum * conteDecrescente);
				
				//o contador fica negativo pois a multiplica��o fica em ordem decrescente
				conteDecrescente--;
				
				
			}
			
			resto11 = 11 - (soma % 11);
			
			//verificando a igauldade dos resultados 
			if (resto11 == 10 || resto11 == 11) {
				
				digitos10 = '0';
								
			}
			else {
				
				digitos10 = (char)(resto11 + 48);
			}
			
			//verificando o 11� para saber se � valido ou n�o
			//iniciando a variavel soma e o contador decrescente
			soma=0; conteDecrescente= 11;
			
			for ( i = 0; i < 10; i++) {
				
				//convertendo a string para numero na posi��o 0
				converterNum = (int)(cpf.charAt(i) - 48);
				
				//soma recebe o valor das multiplica��es e soma
				soma += (converterNum * conteDecrescente);
				
				//contador descrencente multiplica
				conteDecrescente--;
				
			}
			
			//verificando o rssto da divis�o por 11
			resto11 = 11 - (soma % 11);
			
			//verificando valores
			if (resto11 == 10 || resto11 == 11) {
				
				digitos11 = '0';
				
			} else {
				
				digitos11 = (char)(resto11 + 48);
			}
						
	        // Verifica se os digitos calculados conferem com os digitos informados.
			if ((digitos10 == cpf.charAt(9)) && (digitos11 == cpf.charAt(10))) {
				
				return true;	
				
			}else {
				
				return false;				

			}
			
		}catch (InputMismatchException erro) {
			
			return false;
        }
		
	//fim public static boolean valida
	}
	
	//imprimindo o cpf de forma 000.000.000-00
	public static String imprimeCPF(String cpf) {
		
        return(cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
        		cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }

}
