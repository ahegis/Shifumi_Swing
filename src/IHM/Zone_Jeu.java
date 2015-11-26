package IHM;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Core.Joueur;

@SuppressWarnings("serial")
public class Zone_Jeu extends JPanel{
	JPanel bordGauche = new JPanel();
	JPanel bordDroit = new JPanel();
	JPanel centre = new JPanel();
	Joueur joueur1,joueur2;
	int mode;
	
	JLabel labelCentreHaut = new JLabel();
	JLabel labelCentreMilieu = new JLabel();
	JLabel labelCentreBas = new JLabel();
	public Zone_Jeu(int i){
		mode=i;
		this.setLayout(new GridLayout(1,3));
		bordGauche.setLayout(new GridLayout(3,1,20,20));
		bordDroit.setLayout(new GridLayout(3,1,20,20));
		if(i == 1){
			joueur1=new Joueur(1);joueur1.jouerInterface(0);			
			joueur2=new Joueur(2);joueur2.jouerInterface(0);
			
			PackBouton 	packBoutonGauche=new PackBouton(joueur1,this),
						packBoutonDroit=new PackBouton(joueur2,this);
			JButton[] 	tabBoutonGauche=packBoutonGauche.creerPackBouton(),
						tabBoutonDroit=packBoutonDroit.creerPackBouton();
			
			for(int j=0;j<3;j++){
				bordGauche.add(tabBoutonGauche[j]);
				bordDroit.add(tabBoutonDroit[j]);				
			}
		}
		else{
			joueur1=new Joueur(1);joueur1.jouerInterface(0);			
			if(i==2)
				joueur2=new Joueur(4);
			else if(i==3)
				joueur2=new Joueur(3);
			
			joueur2.appliquerStrategie();
			PackBouton packBoutonGauche=new PackBouton(joueur1,this);
			
			JButton[] tabBoutonGauche=packBoutonGauche.creerPackBouton();
			
			for(int j=0;j<3;j++){
				tabBoutonGauche[j].addActionListener(
						new ActionListener(){
							public void actionPerformed(ActionEvent e){
								joueur2.appliquerStrategie();
							}
						});
				bordGauche.add(tabBoutonGauche[j]);				
			}
		}
		
		centre.setLayout(new GridLayout(3,1,0,0));
		centre.add(labelCentreHaut);
		centre.add(labelCentreMilieu);
		centre.add(labelCentreBas);
		this.add(bordGauche);
		this.add(centre);
		bordGauche.setBounds(0, 0, 50, 100);
		if(i==1){
			bordDroit.setBounds(200, 0, 50, 100);
			this.add(bordDroit);
		}
		
		this.setVisible(true);
	}
	
	@SuppressWarnings("unused")
	public void afficherCoup(){
		JLabel coup1 = new JLabel(joueur1.getCoup().toString());
		JLabel coup2 = new JLabel(joueur2.getCoup().toString());
		
		String pathVictory="D:\\Shifumi_Swing\\src\\Media\\victory.png";
		String pathDefeat="D:\\Shifumi_Swing\\src\\Media\\defeat.png";
		String pathEgalite="D:\\Shifumi_Swing\\src\\Media\\egalite.png";
		
		   
		   
		labelCentreHaut.setVisible(false);
		labelCentreMilieu.setVisible(false);
		labelCentreBas.setVisible(false);
		
		centre.remove(labelCentreHaut);
		centre.remove(labelCentreMilieu);
		centre.remove(labelCentreBas);
	
		try {
			JLabel picDefeat = new JLabel(new ImageIcon(ImageIO.read(new File(pathDefeat))));
			if(joueur1.getCoup().toString()!="" && joueur2.getCoup().toString()!="")
				if(joueur1.getCoup().gagner(joueur2.getCoup())==-1)
					if(mode==1)labelCentreMilieu=new JLabel("Le joueur 2 gagne");
					else labelCentreMilieu=picDefeat;
		} catch (IOException e) {
			if(joueur1.getCoup().toString()!="" && joueur2.getCoup().toString()!="")
				if(joueur1.getCoup().gagner(joueur2.getCoup())==-1)
					if(mode==1)labelCentreMilieu=new JLabel("Le joueur 2 gagne");
					else labelCentreMilieu=new JLabel("L'Ordinateur Gagne");
		}
		
		try {
			JLabel picVictory = new JLabel(new ImageIcon(ImageIO.read(new File(pathVictory))));
			if(joueur1.getCoup().toString()!="" && joueur2.getCoup().toString()!="")
				if(joueur1.getCoup().gagner(joueur2.getCoup())==1)
					if(mode==1)labelCentreMilieu=new JLabel("Le joueur 1 gagne");
					else labelCentreMilieu=picVictory;
		} catch (IOException e) {
			if(joueur1.getCoup().toString()!="" && joueur2.getCoup().toString()!="")
				if(joueur1.getCoup().gagner(joueur2.getCoup())==1)
					if(mode==1)labelCentreMilieu=new JLabel("Le joueur 1 gagne");
					else labelCentreMilieu=new JLabel("Le Joueur Gagne");
		}
			
		try {
			JLabel picEgalite = new JLabel(new ImageIcon(ImageIO.read(new File(pathEgalite))));
			if(joueur1.getCoup().toString()!="" && joueur2.getCoup().toString()!="")
				if(joueur1.getCoup().gagner(joueur2.getCoup())==0)
					labelCentreMilieu=picEgalite;
		} catch (IOException e) {
			if(joueur1.getCoup().toString()!="" && joueur2.getCoup().toString()!="")
				if(joueur1.getCoup().gagner(joueur2.getCoup())==0)
					labelCentreMilieu=new JLabel("Egalité");
		}

		
		labelCentreHaut=joueur1.getCoup().getLabel();
		labelCentreBas=joueur2.getCoup().getLabel();
		
		
		centre.add(labelCentreHaut);
		centre.add(labelCentreMilieu);
		centre.add(labelCentreBas);
		
		labelCentreHaut.setVisible(true);
		labelCentreMilieu.setVisible(true);
		labelCentreBas.setVisible(true);
	}
		
}
