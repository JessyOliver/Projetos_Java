package br.com.generation.carro;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();
		
		carro1.nome ="Woiage";
		carro1.marca = "Volks";
		carro1.ano = 2008;
		carro1.velocidade = 0;
		
		System.out.println(" Nome: " + carro1.nome);
		System.out.println(" Marca: " + carro1.marca);
		System.out.println(" Ano: " + carro1.ano);

		carro1.acelera(30);
		System.out.println("Velocidade: " + carro1.velocidade);
		
		carro1.frear(10);
		System.out.println("Velocidade: " + carro1.velocidade);

	}

}
