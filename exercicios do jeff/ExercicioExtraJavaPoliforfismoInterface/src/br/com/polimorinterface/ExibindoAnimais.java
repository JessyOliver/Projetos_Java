package br.com.polimorinterface;

public class ExibindoAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando da classe cachorro
		Animal exibindoAni = new  Cachorro();
		
		System.out.println();
		System.out.println("----CACHORRO----");
		
		exibindoAni.cadAni();
		exibindoAni.emitirSom();
		exibindoAni.correr();
		exibindoAni.subirArvore();
		
		//instanciando da classe cavalo
		exibindoAni = new  Cavalo();
		
		System.out.println();
		System.out.println("----CAVALO----");
		
		exibindoAni.cadAni();
		exibindoAni.emitirSom();
		exibindoAni.correr();
		exibindoAni.subirArvore();
		
		//instanciando da classe pregui�a
		exibindoAni = new  Preguica();
		
		System.out.println();
		System.out.println("----PREGUI�A----");
		
		exibindoAni.cadAni();
		exibindoAni.emitirSom();
		exibindoAni.correr();
		exibindoAni.subirArvore();

		
		
	}

}
