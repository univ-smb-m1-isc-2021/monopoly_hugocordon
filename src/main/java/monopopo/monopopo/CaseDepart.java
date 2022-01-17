package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/143f6ef1-7e3f-408b-a37e-8adda1543961

//end of modifiable zone(Javadoc).........E/143f6ef1-7e3f-408b-a37e-8adda1543961
public class CaseDepart extends Jeu {

	public CaseDepart(String string) {
		super(string,-200);
	}
	
	public Case suivant(int nb,Joueur a){
		if(nb >= 0)
			a.crediter(200);
		if(nb == 0)
			return this;
		return suivant.suivant(nb-1,a);
	}
	
	@Override
	public void ActionCase(Joueur caller, int soldes, int roll, ArrayList<String> options) {
		// TODO Auto-generated method stub
		
	}
}
