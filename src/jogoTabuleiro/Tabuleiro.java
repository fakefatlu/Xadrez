package jogoTabuleiro;

public class Tabuleiro {
	private int quant_linhas;
	private int quant_coluna;
	private Peca[][] pecas;
		
	public Tabuleiro(int quant_linhas, int quant_coluna) {
		if(quant_linhas < 1 || quant_coluna < 1 ) {
			throw new PlacaExecao("Erro na criação do tabuleiro: É nescessario que haja pelo menos uma linha e uma coluna. ");
		}
		
		this.quant_linhas = quant_linhas;
		this.quant_coluna = quant_coluna;
		
		pecas = new Peca[quant_linhas][quant_coluna];
	}

	public int getQuant_linhas() {
		return quant_linhas;
	}

	public int getQuant_coluna() {
		return quant_coluna;
	}

	public Peca peca(int linha, int coluna) {
		if(!posicaoExistente(linha,coluna)) {
			throw new PlacaExecao("Posição invalida!");
			
		}
		return pecas[linha][coluna];
	}
	
	// sobrecarga
	public Peca peca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new PlacaExecao("Posição invalida!");
			
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(pecaExistente(posicao)) {
			throw new PlacaExecao("já existe uma peça onde posiciona" + posicao);
		}
		
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao; // metodo protected 
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < quant_linhas && coluna >= 0 && coluna < quant_coluna;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean pecaExistente(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new PlacaExecao("Posição invalida!");	
		}
		return peca(posicao) != null;
	}
	
}
