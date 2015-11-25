package Strategie;
import Coup.*;

public class Strategie_Jeu_Mono implements Strategie_Jeu{

	private int coup;
	
	public Strategie_Jeu_Mono(int coup){
		if(coup>3 || coup<1)this.coup=1;
		else this.coup=coup;
	}
	@Override
	public Coup choisirCoup() {
		switch(coup){
			case 1:return new Coup_Pierre();
			case 2:return new Coup_Papier();
			case 3:return new Coup_Ciseaux();
			default : return new Coup_Pierre();
		}
		
	}


}
