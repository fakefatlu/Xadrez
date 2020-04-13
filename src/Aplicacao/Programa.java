package Aplicacao;

import CamadaXadrez.PartidaXadrez;

public class Programa {

	public static void main(String[] args) {
		
		
		PartidaXadrez partida = new PartidaXadrez();
		UI.printTabela(partida.getPecas());
	
	}

}
