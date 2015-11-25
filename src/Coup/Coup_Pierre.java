package Coup;

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
}
