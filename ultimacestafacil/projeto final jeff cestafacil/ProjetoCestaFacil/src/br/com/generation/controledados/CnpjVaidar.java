package br.com.generation.controledados;

import java.math.BigInteger;

public class CnpjVaidar {
	
	
	
	private static boolean validarCnpj(String cnpj, boolean printar) {
		try {
			new BigInteger(cnpj);
		} catch (NumberFormatException e) {
			if (printar == true) {
				System.out.println("CNPJ inválido!");
			}
			return false;
		}

		if (cnpj.length() != 14) {
			if (printar == true) {
				System.out.println("CNPJ inválido!");
			}
			return false;
		}
		return true;
	}

}
