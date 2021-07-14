package atividade07;

public class Funcionario {

	private String nome, cpf, dataAdmissao;
	private int matricula;
	private float salario,imposto;
	private TipoFuncionario funcao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public TipoFuncionario getFuncao() {
		return funcao;
	}

	public void setFuncao(TipoFuncionario funcao) {
		this.funcao = funcao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String dataAdmissao, int matricula,TipoFuncionario funcao ,float salario, float imposto) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
		this.funcao = funcao;
		this.salario = salario;
		this.imposto = imposto;
	}
	
	public void Exibirfuncionario() {
		System.out.print("Dados do funcionário "+getNome()+"\nCPF: "+getCpf() + "\nNúmero de matrícula: "+
						getMatricula() + "\nTrabalha na função de "+ getFuncao() + " desde o dia: " + getDataAdmissao() + "\n");
	}
	
	public void receberAumento(float salario) {
	
		System.out.printf("Salário inicial = %.2f. E agora com aumento de 10 por cento: %.2f  ",salario,salario * 1.1);//0,1
	}
	
	public void calcularGanhoBrutalAnual() {
		System.out.printf("O ganho bruto anual: %.2f",salario * 12);
	}
	
	public float calcularImposto() {
		
		return imposto * 12;
	}
	
	public float calcularGanhoLiquidoMensal() {
		
		float inss,impostoRenda;
		inss = (float) (salario * 0.11);
		impostoRenda = (float) (salario * 0.175);
		return salario - (inss + impostoRenda) ;
	}
	
	public float calcularGanhoLiquidoAnual() {
		 return calcularGanhoLiquidoMensal() * 12;
	}
}
