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
	
	//Colocando as pecas no tabuleiro
	private void configInical() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7,4));
	}

}
