package br.com.generation.exercicio.seis;

public class ContaBancaria {
	
		private String nomeCliente, tipoCliente, TipoConta, numeroConta;
		private double saldo, dinheiro;
		
		//funções da class
		//sacando dinheiro
		 void sacar(double sacar) {
				
			  saldo -= sacar ;
			 
			
		}
		 //depositando dinheiro
		 void depositar(double deposi) {
				
			 saldo += deposi;
			 
			
			
		}
		 
		//construtores
		public ContaBancaria() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ContaBancaria(String nomeCliente, String tipoCliente, String tipoConta, String numeroConta, double saldo) {
			super();
			this.nomeCliente = nomeCliente;
			this.tipoCliente = tipoCliente;
			TipoConta = tipoConta;
			this.numeroConta = numeroConta;
			this.saldo = saldo;
		}
		
		//get set
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		public String getTipoCliente() {
			return tipoCliente;
		}
		public void setTipoCliente(String tipoCliente) {
			this.tipoCliente = tipoCliente;
		}
		public String getTipoConta() {
			return TipoConta;
		}
		public void setTipoConta(String tipoConta) {
			TipoConta = tipoConta;
		}
		public String getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(String numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
		
		

}
