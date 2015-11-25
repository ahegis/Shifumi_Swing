package Coup;

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
}
