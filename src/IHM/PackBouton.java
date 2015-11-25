package IHM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Core.*;

public class PackBouton {
	
	private Joueur joueur;
	private Zone_Jeu zone;
	
	public PackBouton(Joueur joueur,Zone_Jeu zone){
		this.joueur=joueur;
		this.zone=zone;
	}
	
	public JButton[] creerPackBouton(){
		
	JButton boutonPierre = new JButton();
	boutonPierre.setSize(200,80);
	boutonPierre.setText("PIERRE");
	boutonPierre.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){	joueur.jouerInterface(1);																
																zone.afficherCoup();}	});
	
	
	JButton boutonPapier = new JButton();
	boutonPapier.setSize(200,80);
	boutonPapier.setText("PAPIER");
	boutonPapier.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){	joueur.jouerInterface(2);
																zone.afficherCoup();}	});
	
	JButton boutonCiseaux = new JButton();
	boutonCiseaux.setSize(200,80);
	boutonCiseaux.setText("CISEAUX");
	boutonCiseaux.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){	joueur.jouerInterface(3);
																zone.afficherCoup();}	});
	
	JButton[] tab_bouton = new JButton[3];
	tab_bouton[0]=boutonPierre;
	tab_bouton[1]=boutonPapier;
	tab_bouton[2]=boutonCiseaux;
	
	return tab_bouton;
	}
}

