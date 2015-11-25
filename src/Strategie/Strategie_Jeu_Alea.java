package Strategie;
import Coup.*;

public class Strategie_Jeu_Alea implements Strategie_Jeu{

	public Strategie_Jeu_Alea(){
		
	}
	
	public Coup choisirCoup(){
		int choix = (int) (Math.random()*3);
		switch(choix){
			case 1:return new Coup_Pierre();
			case 2:return new Coup_Papier();
			case 3:return new Coup_Ciseaux();
			default:return new Coup_Pierre();
		}
	}
}
