package br.com.generation.controledados;

public class ValidandoTelefone {
	

public static boolean validaTelef(String telefone){
	
   boolean valido = true;
   
   if(telefone.length() != 10){
	   
      valido = false;
   }
   return valido;
}



public static boolean validaCelu(String celular){
	
   boolean valido = true;
   
   if(celular.length() != 11){
	   
      valido = false;
   }
   return valido;
}


}
