package Coup;

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

}
