package atividades;

import java.util.Date;

/*
 * @author FláviaRenata
 * 
 * */

public class ContaCorrente extends Cliente{ //Usei um conceito chamado herança, ou seja, a classe ContaCorrente tem acesso aos gets e sets da class Cliente.

	private String numero;
	private double saldo;
	private Date data;
		
	
	public String getnumero() {
		return numero;
	}
	
	public void setnumero(String numero) {
		this.numero = numero;
	}
	
	
	public Date getdata() {
		return data;
	}
	
	public void setdata(Date dataatual) {
		this.data = dataatual;
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
	
	

	public void  ExibirExtrato(String cpf, String nome, String sobrenome, double saldofinal,double saldoinicial) {
		System.out.println("\n----------------------------- Mini extrato----------------------------------\n");
		System.out.printf("O nome e sobrenome do cliente: %s %s\n",nome,sobrenome);
		System.out.printf("O número do cliente é : %s\n",numero);
		System.out.printf("O CPF do cliente: %s\n",cpf);
		System.out.printf("O saldo inicial : %.1f\n",saldoinicial);
		System.out.printf("O saldo final: %.1f\n",saldofinal);
		System.out.printf("A data de acesso foi: %s\n",data);
		
	}
	
	
	
}
