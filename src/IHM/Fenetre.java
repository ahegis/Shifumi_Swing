package IHM;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	private Menu menu = new Menu(this);
	private JPanel panelActif;
	
	public Fenetre(){
		this.setTitle("Shifumi");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		JLabel label = new JLabel();
		label.setText("Label'");
		this.add(label);
		panelActif=menu;
		this.add(panelActif);
		
	}

	public void changerPanel(int i){
		panelActif.setVisible(false);
		this.remove(panelActif);
		switch(i){
			case 1:panelActif=new Zone_Jeu(1);break;
			case 2:panelActif=new Zone_Jeu(2);break;
			case 3:panelActif=new Zone_Jeu(3);break;
		}
		this.add(panelActif);
		panelActif.setVisible(true);
	}
}
