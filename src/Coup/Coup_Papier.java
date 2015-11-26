package Coup;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Coup_Papier implements Coup{

	public Coup_Papier(){
		
	}
	
	@Override
	public int gagner(Coup coup) {
		if (coup.toString().equals("Papier"))
			return 0;
	else if (coup.toString().equals("Pierre")){
			return 1;
	}
	else return -1;
	}
	
	public String toString(){
		return "Papier";
	}

	@Override
	public JLabel getLabel() {
		String pathPapier="D:\\Shifumi_Swing\\src\\Media\\feuille.png";
		try {
			JLabel picPapier = new JLabel(new ImageIcon(ImageIO.read(new File(pathPapier))));
			return picPapier;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
