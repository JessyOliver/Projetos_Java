package br.com.generation.controledados;

public class Senha {
	
	
	public static boolean senha(String senha, String senhaConfrim) {
		
		//verificando se os campos s�o iguais
		 if (senha.equals(senhaConfrim)) {
			
			return true;
		} 
		else {
			return false;
		}
	
	//fim tudo
	}

}
