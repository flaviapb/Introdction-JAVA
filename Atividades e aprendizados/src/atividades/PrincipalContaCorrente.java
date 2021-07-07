package atividades;

/*
 * @author FláviaRenata
 * 
 * */

import java.util.*;

public class PrincipalContaCorrente {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
		
		String nome,sobrenome,cpf,numero;
		double saldoinicial, saldofinal, deposito,saque,transferencia;
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		System.out.println("\nDigite seu sobrenome: ");
		sobrenome = input.next();
		
		
		System.out.println("\nDigite seu CPF: ");
		cpf = input.next();
		
		
		System.out.println("\nDigite seu número de telefone: ");
		numero = input.next();
		conta.setnumero(numero);
		
		System.out.println("\nDigite seu Saldo: ");
		saldoinicial = input.nextDouble();
		conta.setsaldo(saldoinicial);
		
		Date dataatual = new Date(); //Pegando a data atual do sistema.
		conta.setdata(dataatual);
		
	
		System.out.println("\nDigite o valor do seu deposito para sua conta: ");
		deposito = input.nextDouble();
		conta.Depositar(deposito);
		
		
		System.out.println("\nDigite o valor do seu saque: ");
		saque = input.nextDouble();
		conta.Sacar(saque);
		
		System.out.println("\nDigite o valor da sua tranferencia: ");
		transferencia = input.nextDouble();
		conta.Transferir(transferencia);
		
		saldofinal = ((saldoinicial + deposito) - saque - transferencia); //Calculando o saldo final, ou seja, depois de todas as operações.
		
		conta.ExibirExtrato(cpf,nome,sobrenome,saldofinal,(saldoinicial + deposito));
	}

}
