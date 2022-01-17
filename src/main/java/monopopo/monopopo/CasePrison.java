package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/73a8e7ff-4662-4342-bbe0-2a4738e37ca9

//end of modifiable zone(Javadoc).........E/73a8e7ff-4662-4342-bbe0-2a4738e37ca9
public class CasePrison extends Jeu {

	public CasePrison(String string) {
		super(string,0);
	}
	@Override
	 public void ActionCase(Joueur caller,final int soldes, final int roll,ArrayList<String> options) {
	    	System.out.println(options.size() + "aller en prison");
	    	options.add("aller en prison");
	}
	 
	 
}
