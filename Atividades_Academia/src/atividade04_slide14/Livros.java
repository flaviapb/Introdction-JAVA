package atividade04_slide14;

public class Livros {

	private String titulo;
	private Integer qntdPaginas, qntdPaginasLidas;
	
	
	public Livros() {
		
	}
	
	
	public Livros(String titulo, Integer qntdPaginas) {
		this.titulo = titulo;
		this.qntdPaginas = qntdPaginas;
	}
	
	public void verificarProgresso(Integer qntdPaginas, Integer qntdPaginasLidas) {
		float porcentagem = 0;
		
		porcentagem = (qntdPaginasLidas * 100)/qntdPaginas;
		
		System.out.printf("\nVocê leu %.1f por cento do livro '%s'.\n",porcentagem,getTitulo());
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Integer getQntdPaginas() {
		return qntdPaginas;
	}


	public void setQntdPaginas(Integer qntdPaginas) {
		this.qntdPaginas = qntdPaginas;
	}


	public Integer getQntdPaginasLidas() {
		return qntdPaginasLidas;
	}


	public void setQntdPaginasLidas(Integer qntdPaginasLidas) {
		this.qntdPaginasLidas = qntdPaginasLidas;
	}
	
	
}
