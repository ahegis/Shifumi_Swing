package Coup;

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
}
