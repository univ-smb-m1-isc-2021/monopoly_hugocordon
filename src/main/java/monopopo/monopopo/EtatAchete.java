package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/c12b0275-2310-4c32-8e12-8800845f49f9

//end of modifiable zone(Javadoc).........E/c12b0275-2310-4c32-8e12-8800845f49f9
public class EtatAchete extends etatCase {
//begin of modifiable zone(Javadoc).......C/22674238-dc13-4a9e-a3f6-911f6efc200e

//end of modifiable zone(Javadoc).........E/22674238-dc13-4a9e-a3f6-911f6efc200e
    public void acheter() {
//begin of modifiable zone(JavaCode)......C/22674238-dc13-4a9e-a3f6-911f6efc200e
    	return;
//end of modifiable zone(JavaCode)........E/22674238-dc13-4a9e-a3f6-911f6efc200e
    }

//begin of modifiable zone(Javadoc).......C/7421fcb0-b752-483b-8a4e-5e9b9cdc9ff2

//end of modifiable zone(Javadoc).........E/7421fcb0-b752-483b-8a4e-5e9b9cdc9ff2
    public void ActionCase(Joueur caller,final int soldes, final int roll,ArrayList<String> options) {
//begin of modifiable zone(JavaCode)......C/7421fcb0-b752-483b-8a4e-5e9b9cdc9ff2
    	if(!this.qase.isOwner(caller) && roll != 0) {
    		System.out.println(options.size() + "payer");
    		options.add("payer");
    	}
//end of modifiable zone(JavaCode)........E/7421fcb0-b752-483b-8a4e-5e9b9cdc9ff2
    }

    public void setmonopole() {
    	System.out.println(this.qase.nom + " devient constructible ");
    	EtatConstructible a = new EtatConstructible();
    	a.qase = this.qase;
    	this.qase.etatCase = a;
    }
    
//begin of modifiable zone(Javadoc).......C/3c0d746b-39a6-4999-958d-e91fbd0962e4
//end of modifiable zone(Javadoc).........E/3c0d746b-39a6-4999-958d-e91fbd0962e4
    public void Payer(Joueur j) {
//begin of modifiable zone(JavaCode)......C/3c0d746b-39a6-4999-958d-e91fbd0962e4
    	this.qase.owner.crediter(j.debiter(((Rue)this.qase).loyerVide, true));
//end of modifiable zone(JavaCode)........E/3c0d746b-39a6-4999-958d-e91fbd0962e4
    }

//begin of modifiable zone(Javadoc).......C/0e5e3ce7-0b8b-457b-bd3b-cdc5b52b595b

    public boolean monopole(Joueur j1) {
    	boolean ret = true;
    	for(int i = 0; i < this.qase.quartier.achetable.size();i++)
	    		if(this.qase.quartier.achetable.get(i).owner != j1 )
	    			ret = false;
    	if(ret)
    		for(int i = 0; i < this.qase.quartier.achetable.size();i++)
    			this.qase.quartier.achetable.get(i).setmonopole();
    	return ret;
    }
    
//end of modifiable zone(Javadoc).........E/0e5e3ce7-0b8b-457b-bd3b-cdc5b52b595b
    public EtatAchete() {
//begin of modifiable zone(JavaSuper).....C/0e5e3ce7-0b8b-457b-bd3b-cdc5b52b595b

//end of modifiable zone(JavaSuper).......E/0e5e3ce7-0b8b-457b-bd3b-cdc5b52b595b
//begin of modifiable zone(JavaCode)......C/0e5e3ce7-0b8b-457b-bd3b-cdc5b52b595b

//end of modifiable zone(JavaCode)........E/0e5e3ce7-0b8b-457b-bd3b-cdc5b52b595b
    }

	@Override
	protected void afficherOptionConstructible() {
		// TODO Auto-generated method stub
		
	}

}
