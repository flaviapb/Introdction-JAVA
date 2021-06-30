package atividades;

public class ContaCorrente extends Cliente{

	private String numero;
	private double saldo;
	private String data;
		
	
	public String getnumero() {
		return numero;
	}
	
	public void setnumero(String numero) {
		this.numero = numero;
	}
	
	
	public String getdata() {
		return data;
	}
	
	public void setdata(String data) {
		this.data = data;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void Depositar(double valordeposito) {
		saldo  = saldo +  valordeposito;
		System.out.printf("\nValor depositado: %.1f\n",valordeposito);
	}
	
	public void Sacar(double valorsaque) {
		
		if(valorsaque <= saldo) {
			saldo = saldo - valorsaque;
			System.out.printf("\nSaque de = " + valorsaque + ". Efetuado com sucesso!!\n");
		}
		
		else {
			System.out.println("\nImpossivel retirar\n");
		}
		
	}
	
	public void Transferir(double valortransferir) {
		
		System.out.printf("\nTranferencia de %.1f, foi feita com sucesso!\n",valortransferir);
	}
	
	

	public void  ExibirExtrato() {
		System.out.printf("\nO número do cliente é : %s\n",numero);
		System.out.printf("O saldo inicial : %.1f\n",saldo);
		System.out.printf("A data de acesso foi: %s\n",data);
		
	}
	
	
	
}
