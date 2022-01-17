package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/ba862341-fcb2-4dd2-b196-a533397e2ffd

//end of modifiable zone(Javadoc).........E/ba862341-fcb2-4dd2-b196-a533397e2ffd
public class Jeu extends Case {

	int prix;
	
	public Jeu(String string, int i) {
		super(string);
		prix = i;
	}


	@Override
	public void ActionCase(Joueur caller, int soldes, int roll, ArrayList<String> options) {
		// TODO Auto-generated method stub
		
	}
}
