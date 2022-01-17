package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/d97a5f01-8e10-4155-a8d1-b27df09f6402

//end of modifiable zone(Javadoc).........E/d97a5f01-8e10-4155-a8d1-b27df09f6402
public class Service extends Achetable {
//begin of modifiable zone(Javadoc).......C/8e2d38b2-799c-4bf8-b973-12c11891652a

	int roll = 0;
	
	public void Payer() {
		
	}
	
	public Service(String string, int i) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	//end of modifiable zone(Javadoc).........E/8e2d38b2-799c-4bf8-b973-12c11891652a
    public boolean monopole;

	@Override
	public void ActionCase(Joueur caller, int soldes, int roll, ArrayList<String> options) {
		// TODO Auto-generated method stub
		this.roll = roll;
		if(this.owner == null) {
    		System.out.println(options.size() + "acheter");
    		options.add("acheter");
		}
		if(!this.isOwner(caller)) {
    		System.out.println(options.size() + "payer");
    		options.add("payer");
		}
		
	}

	@Override
	public void acheter(Joueur caller) {
		
	}

	@Override
	protected void Payer(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

}
