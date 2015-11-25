package Core;
import Coup.*;
import Strategie.*;

public class Joueur {
	private int score;
	private Strategie_Jeu strategie;
	private Coup coup;
	
	public Joueur(int strategie){
		score=0;
		switch(strategie){
			case 1:this.strategie=new Strategie_Jeu_Humain();break;
			case 2:this.strategie=new Strategie_Jeu_Mono(1);break;
			case 3:this.strategie=new Strategie_Jeu_Cycle();break;
			case 4:this.strategie=new Strategie_Jeu_Alea();break;
			default:this.strategie=new Strategie_Jeu_Humain();break;
		}
	}
	
	public void appliquerStrategie(){
		coup=strategie.choisirCoup();
	}
	
	public Coup jouer(){
		appliquerStrategie();
		return coup;
	}
	public void jouerInterface(int i){
		switch(i){
			case 1:coup= new Coup_Pierre();break;
			case 2:coup= new Coup_Papier();break;
			case 3:coup= new Coup_Ciseaux();break;
			default:coup= new Coup_Nul();break;
		}
	}
	
	public Coup getCoup(){
		return coup;
	}
	
	public void monterScore(boolean unOuDeux){
		if(unOuDeux)score++;
		else score=score+2;
	}

	public int getScore(){
		return score;
	}
}
