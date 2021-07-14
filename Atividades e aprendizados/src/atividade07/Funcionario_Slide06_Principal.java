package atividade07;

public class Funcionario_Slide06_Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Flávia","345.564.231-10","30/06/2020", 20210134,
				TipoFuncionario.ANALISTA_JR,(float) 5000, (float) 150.50);
		
		Funcionario funcionario2 = new Funcionario("Rosa","675.432.876-25","30/06/2018",20210236,
				TipoFuncionario.ANALISTA, (float) 7000, (float) 350.00);

		Funcionario funcionario3 = new Funcionario("Bianca", "654.321.852-01", "30/01/2017", 20210567,
				TipoFuncionario.GERENTE, (float) 10000, (float) 500);
		
		tracadoComNome("1");
		ImprimirDadosFuncionario(funcionario1);
		tracadoSemNome();
		
		pularlinha();
		
		tracadoComNome("2");
		ImprimirDadosFuncionario(funcionario2);
		tracadoSemNome();
		
		pularlinha();
		
		tracadoComNome("3");
		ImprimirDadosFuncionario(funcionario3);
		tracadoSemNome();
		
		pularlinha();
				
	}
	
	public static void pularlinha() {
		System.out.print("\n");
	}
	
	public static void tracadoComNome(String letra) {
		System.out.printf("---------------------------------Funcionario %s------------------------------------------\n", letra);
	}
	
	public static void tracadoSemNome() {
		System.out.print("------------------------------------------------------------------------------------------");
	}
	
	public static void ImprimirDadosFuncionario(Funcionario funcionario) {
		funcionario.Exibirfuncionario();
		System.out.printf("O total de impostos pagos por 1 ano: %.2f",funcionario.calcularImposto()); //OKAY
		pularlinha();
		funcionario.calcularGanhoBrutalAnual();
		pularlinha();
		funcionario.receberAumento(funcionario.getSalario()); //OKAY
		pularlinha();
		System.out.printf("O ganho liquido mensal: %.2f",funcionario.calcularGanhoLiquidoMensal());
		pularlinha();
		System.out.printf("O ganho líquido anual: %.2f",funcionario.calcularGanhoLiquidoAnual());
		pularlinha();
	}

}
