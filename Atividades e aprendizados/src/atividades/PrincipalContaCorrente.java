package atividades;

public class PrincipalContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setNome("Flávia");
		conta.setSobrenome("Renata");
		conta.setCpf("123.456.789-29");
		conta.setnumero("99419-6563");
		conta.setsaldo(5000);
		conta.setdata("30/06/2021");
		
		conta.Exibirnome();
		conta.Depositar(300);
		conta.Sacar(200);
		conta.Transferir(100);
		conta.ExibirExtrato();
	}

}
