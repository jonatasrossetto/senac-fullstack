
public class Acervo {

	private final int tamanhoAcervo = 100;
	private Livro[] acervo = new Livro[tamanhoAcervo];
	private int lastPatrimonio = 1;
	
	public void incluirLivro (String titulo, String autores, String referencia) {
		int patrimonio = lastPatrimonio+1;
		acervo[patrimonio].setTitulo(titulo);
		acervo[patrimonio].setAutores(autores);
		acervo[patrimonio].setReferencia(referencia);
		acervo[patrimonio].setPatrimonio(patrimonio);
	}

	
	
	
}
