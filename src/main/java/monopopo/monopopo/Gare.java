package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/b7c0a826-abb5-433c-b326-518e221f3990

//end of modifiable zone(Javadoc).........E/b7c0a826-abb5-433c-b326-518e221f3990
public class Gare extends Achetable {
//begin of modifiable zone(Javadoc).......C/b0f1ac20-f092-4f7c-8310-b61f3ea7d178

	
public Gare(String string) {
	
	super(string);
		// TODO Auto-generated constructor stub
	}

	public void setNbgare(int i) {
		nbGares = i;
	}

	public void acheter(Joueur j1) {
		if(j1.achat(this, 200)) {
			owner = j1;
			nbGares = j1.nbgares();
		}
	}


	//end of modifiable zone(Javadoc).........E/b0f1ac20-f092-4f7c-8310-b61f3ea7d178
    public int nbGares = 0;

	@Override
	public void ActionCase(Joueur caller, int soldes, int roll, ArrayList<String> options) {
		if(nbGares == 0) {
			System.out.println(options.size() + "acheter");
    		options.add("acheter");
		}
		if(!this.isOwner(caller) && nbGares != 0) {
			System.out.println(options.size() + "payer");
    		options.add("payer");
		}
	}

	@Override
	protected void Payer(Joueur joueur) {
		// TODO Auto-generated method stub
		this.owner.crediter(joueur.debiter(50*nbGares, true));
	}

}
