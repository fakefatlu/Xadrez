package CamadaXadrez;

import CamadaXadrez.pecas.Rei;
import CamadaXadrez.pecas.Torre;
import jogoTabuleiro.Posicao;
import jogoTabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8); 
		configInical();
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
	
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
		
	}
	
	//Colocando as pecas no tabuleiro
	private void configInical() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	}

}
