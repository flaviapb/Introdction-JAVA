package atividade06_slide14;

public class Filme {
	
	private String nomeFilme;
	private float duracaoEmMinutos;
	
	public Filme() {
		
	}
	
	public Filme(String nomeFilme, Integer duracaoEmMinitos) {
		this.nomeFilme = nomeFilme;
		this.duracaoEmMinutos = duracaoEmMinitos;
	}
	
	
	public void exibirDuracaoEmHoras() {
		
		float horas = 0;
		
		horas = getDuracaoEmMinutos()/60;
		
		
		System.out.printf("O filme %s possui %d horas e %d minutos\n", getNomeFilme(),(int) horas,(int)Math.round((horas - (int)horas) * 100));
	}

	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public float getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
}
