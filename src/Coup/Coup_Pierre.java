package Coup;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Coup_Pierre implements Coup{

	public Coup_Pierre(){
		
	}
	
	@Override
	public int gagner(Coup coup) {
		if (coup.toString().equals("Pierre"))
				return 0;
		else if (coup.toString().equals("Ciseaux")){
				return 1;
		}
		else return -1;
	}

	public String toString(){
		return "Pierre";
	}

	@Override
	public JLabel getLabel() {
		String pathPierre="D:\\Shifumi_Swing\\src\\Media\\caillou.png";
		try {
			JLabel picPierre = new JLabel(new ImageIcon(ImageIO.read(new File(pathPierre))));
			return picPierre;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
