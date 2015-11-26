package Coup;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Coup_Ciseaux implements Coup{

	public Coup_Ciseaux(){
		
	}
	
	@Override
	public int gagner(Coup coup) {
		if (coup.toString().equals("Ciseaux"))
			return 0;
		else if (coup.toString().equals("Papier")){
				return 1;
		}
		else return -1;
	}

	public String toString(){
		return "Ciseaux";
	}

	@Override
	public JLabel getLabel() {
		String pathCiseaux="D:\\Shifumi_Swing\\src\\Media\\ciseaux.png";
		try {
			JLabel picCiseaux = new JLabel(new ImageIcon(ImageIO.read(new File(pathCiseaux))));
			return picCiseaux;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
