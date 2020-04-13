package CamadaXadrez;

import jogoTabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8); 
	}
	
	
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getQuant_linhas()][tabuleiro.getQuant_coluna()];
		for(int i = 0; i < tabuleiro.getQuant_linhas(); i++) {
			for(int j = 0; j < tabuleiro.getQuant_coluna(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		
		return mat;
		
	}

}
