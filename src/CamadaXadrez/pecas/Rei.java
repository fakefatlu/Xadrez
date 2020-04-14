package CamadaXadrez.pecas;

import CamadaXadrez.Cor;
import CamadaXadrez.PecaXadrez;
import jogoTabuleiro.Tabuleiro;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	
	@Override
	public String toString() {
		return " R ";
	}
	
	
}
