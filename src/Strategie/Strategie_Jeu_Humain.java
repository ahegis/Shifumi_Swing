package Strategie;
import Coup.*;
import java.util.Scanner;

public class Strategie_Jeu_Humain implements Strategie_Jeu{

	public Strategie_Jeu_Humain(){
		
	}
	
	@Override
	public Coup choisirCoup() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Choix du coup :");
		System.out.println("1) Pierre");
		System.out.println("2) Papier");
		System.out.println("3) Ciseaux");
		int choix = scan.nextInt();
		
		switch(choix){
			case 1: return new Coup_Pierre();
			case 2: return new Coup_Papier();
			case 3: return new Coup_Ciseaux();
			default : return new Coup_Pierre();
		}
		
	}



}
