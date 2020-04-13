package jogoTabuleiro;

public class Tabuleiro {
	private int quant_linhas;
	private int quant_coluna;
	private Peca[][] pecas;
	
	
	public Tabuleiro(int quant_linhas, int quant_coluna) {
		this.quant_linhas = quant_linhas;
		this.quant_coluna = quant_coluna;
		
		pecas = new Peca[quant_linhas][quant_coluna];
	}


	public int getQuant_linhas() {
		return quant_linhas;
	}


	public void setQuant_linhas(int quant_linhas) {
		this.quant_linhas = quant_linhas;
	}


	public int getQuant_coluna() {
		return quant_coluna;
	}


	public void setQuant_coluna(int quant_coluna) {
		this.quant_coluna = quant_coluna;
	}
}
