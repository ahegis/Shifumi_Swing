package Coup;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Coup_Nul implements Coup{

	public Coup_Nul(){
		
	}
	
	@Override
	public int gagner(Coup coup) {
		return -2;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public JLabel getLabel() {
		String pathBlank="D:\\Shifumi_Swing\\src\\Media\\blank.png";
		try {
			JLabel picBlank = new JLabel(new ImageIcon(ImageIO.read(new File(pathBlank))));
			return picBlank;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
