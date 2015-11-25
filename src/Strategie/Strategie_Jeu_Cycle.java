package Strategie;
import Coup.*;

public class Strategie_Jeu_Cycle implements Strategie_Jeu{
	private int rangCycle;
	
	public Strategie_Jeu_Cycle(){
		rangCycle=0;
	}
	
	public Coup choisirCoup(){
		rangCycle=(rangCycle+1)%3;
		
		switch(rangCycle){
			case 0:return new Coup_Pierre();
			case 1:return new Coup_Papier();
			case 2:return new Coup_Ciseaux();
			default:return new Coup_Pierre();
		}
	}
}
