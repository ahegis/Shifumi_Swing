package IHM;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Menu extends JPanel{
	JPanel centre = new JPanel();
	Fenetre fenetre;
	public Menu(Fenetre fenetre){
		this.fenetre=fenetre;
		initMenu();
		//this.add(centre);
	}
	
	public void initMenu(){
		//GridLayout grille = new GridLayout(3,1,20,40);
		this.setLayout(null);
		JButton bouton1v1 = new JButton("Humain VS Humain");
		bouton1v1.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							fenetre.changerPanel(1);
						}
					});
		
		
		JButton bouton1vAlea = new JButton("Humain VS IA Aleatoire");
		bouton1vAlea.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						fenetre.changerPanel(2);
					}
				});			
		
		JButton bouton1vCycle = new JButton("Humain VS IA Cycle");
		bouton1vCycle.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						fenetre.changerPanel(3);
					}
				});
		

		this.add(bouton1vAlea);
		this.add(bouton1v1);
		this.add(bouton1vCycle);
		
		bouton1v1.setBounds(25, 50, 150, 50);
		bouton1vAlea.setBounds(212, 50, 150, 50);
		bouton1vCycle.setBounds(400, 50, 150, 50);
		
		
		
		try {
			   String pathShifumi="D:\\Shifumi_Swing\\src\\Media\\shifumi_facebook_style.png";
			   String pathFondAccueil="D:\\Shifumi_Swing\\src\\Media\\fond_accueil.png";
			   JLabel picShifumi = new JLabel(new ImageIcon(ImageIO.read(new File(pathShifumi))));
			   JLabel picFondAccueil = new JLabel(new ImageIcon(ImageIO.read(new File(pathFondAccueil))));
			   this.add(picShifumi);
			   this.add(picFondAccueil);
			   picShifumi.setBounds(0,127,600,227);
			   picFondAccueil.setBounds(0,0,600,173);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
