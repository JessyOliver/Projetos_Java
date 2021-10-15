package br.com.generation.controledados;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail {
	
	public static boolean email(String emailVal) {
		
		//veirificando campos
		Pattern pontuacao = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,3}$");
		
		Matcher  m = pontuacao.matcher(emailVal.trim());
		
        if (m.find())  {
        	
        	return true;
        }
        
        return false;
        	
		
	}
	
	

}
