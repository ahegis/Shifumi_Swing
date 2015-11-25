package IHM;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Menu extends JPanel{
	JPanel centre = new JPanel();
	Fenetre fenetre;
	public Menu(Fenetre fenetre){
		this.fenetre=fenetre;
		initMenu();
		this.add(centre);
	}
	
	public void initMenu(){
		GridLayout grille = new GridLayout(3,1,20,40);
		centre.setLayout(grille);
		JButton bouton1v1 = new JButton();
		bouton1v1.setText("Humain VS Humain");
		bouton1v1.setSize(400,200);
		bouton1v1.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							fenetre.changerPanel(1);
						}
					});
		centre.add(bouton1v1);
		
		JButton bouton1vAlea = new JButton();
		bouton1vAlea.setText("Humain VS IA Aleatoire");
		bouton1vAlea.setSize(400,200);
		bouton1vAlea.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						fenetre.changerPanel(2);
					}
				});			
		centre.add(bouton1vAlea);
		
		JButton bouton1vCycle = new JButton();
		bouton1vCycle.setText("Humain VS IA Cycle");
		bouton1vCycle.setSize(400,200);
		bouton1vCycle.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						fenetre.changerPanel(3);
					}
				});
		centre.add(bouton1vCycle);
	}
}
