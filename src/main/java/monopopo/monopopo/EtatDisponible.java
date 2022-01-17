package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/34d293cc-7f21-47a2-abe9-7d2a48a30cf3

//end of modifiable zone(Javadoc).........E/34d293cc-7f21-47a2-abe9-7d2a48a30cf3
public class EtatDisponible extends etatCase {
//begin of modifiable zone(Javadoc).......C/8545e87d-0668-4a44-9a03-7a6e4bcc9d9f

//end of modifiable zone(Javadoc).........E/8545e87d-0668-4a44-9a03-7a6e4bcc9d9f
    public void acheter(Joueur j1) {
    	if(j1.achat(qase, this.qase.getPrix())) {
    		qase.owner = j1;
    		int i = 0;
    		for( ; i < this.qase.quartier.achetable.size(); i++)
	    		if(this.qase.quartier.achetable.get(i).owner != j1) {
	    			break;
	    		}
    		if(i == this.qase.quartier.achetable.size()) {
    			for(i = 0 ; i < this.qase.quartier.achetable.size(); i++) {
    				EtatConstructible a = new EtatConstructible();
    				a.qase = this.qase.quartier.achetable.get(i);
    				this.qase.quartier.achetable.get(i).etatCase = a;
    			}
    			return;
    		}
    		EtatAchete ec = new EtatAchete();
    		ec.qase = this.qase;
    		this.qase.etatCase = ec;
    	}
    }

    public void setmonopole() {
    	EtatConstructible a = new EtatConstructible();
    	a.qase = this.qase;
    	this.qase.etatCase = a;
    }

    public boolean monopole(final Object selfobj,Joueur a) {
	    	for(int i = 0; i < this.qase.quartier.achetable.size();i++)
	    		if(this.qase.quartier.achetable.get(i).owner != a )
	    			return false;
		return true;   		
    }
    
        
    
//begin of modifiable zone(Javadoc).......C/177249ac-f675-45f6-ba39-45f5cebf87b4

//end of modifiable zone(Javadoc).........E/177249ac-f675-45f6-ba39-45f5cebf87b4
    public void ActionCase(Joueur caller,final int soldes, final int roll,ArrayList<String> options) {
//begin of modifiable zone(JavaCode)......C/c1cc2f35-efe7-430d-bb03-779bad24f0ed
    	if(soldes > this.qase.getPrix()) {
	    		System.out.println(options.size() + "acheter");
	    		options.add("acheter");
    	}

	    		
//end of modifiable zone(JavaCode)........E/c1cc2f35-efe7-430d-bb03-779bad24f0ed
    }

//begin of modifiable zone(Javadoc).......C/0def2044-aceb-4e9f-ab48-969368ba41cf

//end of modifiable zone(Javadoc).........E/0def2044-aceb-4e9f-ab48-969368ba41cf
    public void Payer() {
//begin of modifiable zone(JavaCode)......C/0def2044-aceb-4e9f-ab48-969368ba41cf
    	return;
//end of modifiable zone(JavaCode)........E/0def2044-aceb-4e9f-ab48-969368ba41cf
    }

//begin of modifiable zone(Javadoc).......C/c3e38744-9d36-4a2a-85dd-dc8568ffee0d

//end of modifiable zone(Javadoc).........E/c3e38744-9d36-4a2a-85dd-dc8568ffee0d
    public EtatDisponible(Rue rue) {
//begin of modifiable zone(JavaSuper).....C/c3e38744-9d36-4a2a-85dd-dc8568ffee0d

//end of modifiable zone(JavaSuper).......E/c3e38744-9d36-4a2a-85dd-dc8568ffee0d
    	this.qase = rue;
//begin of modifiable zone(JavaCode)......C/c3e38744-9d36-4a2a-85dd-dc8568ffee0d

//end of modifiable zone(JavaCode)........E/c3e38744-9d36-4a2a-85dd-dc8568ffee0d
    }

//begin of modifiable zone(Javadoc).......C/dbabc945-d44c-42f3-920b-3dee0ad17fbf

//end of modifiable zone(Javadoc).........E/dbabc945-d44c-42f3-920b-3dee0ad17fbf
    public int Constructible() {
//begin of modifiable zone(JavaCode)......C/dbabc945-d44c-42f3-920b-3dee0ad17fbf

//end of modifiable zone(JavaCode)........E/dbabc945-d44c-42f3-920b-3dee0ad17fbf*
    	return 0;
//begin of modifiable zone(JavaReturned)..C/dbabc945-d44c-42f3-920b-3dee0ad17fbf

//end of modifiable zone(JavaReturned)....E/dbabc945-d44c-42f3-920b-3dee0ad17fbf
    }

	@Override
	protected void afficherOptionConstructible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void Payer(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

}
