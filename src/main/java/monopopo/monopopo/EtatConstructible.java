package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/ab85a105-7e71-4ad3-ba54-617ffd89f807

//end of modifiable zone(Javadoc).........E/ab85a105-7e71-4ad3-ba54-617ffd89f807
public class EtatConstructible extends etatCase {
//begin of modifiable zone(Javadoc).......C/cc9c3282-76a5-4cea-8bfc-ba7e1f4d3368

//end of modifiable zone(Javadoc).........E/cc9c3282-76a5-4cea-8bfc-ba7e1f4d3368
    public void Payer() {
//begin of modifiable zone(JavaCode)......C/cc9c3282-76a5-4cea-8bfc-ba7e1f4d3368

//end of modifiable zone(JavaCode)........E/cc9c3282-76a5-4cea-8bfc-ba7e1f4d3368
    }

//begin of modifiable zone(Javadoc).......C/5b3c89d2-204c-4b6b-b55d-72d3a3967147

//end of modifiable zone(Javadoc).........E/5b3c89d2-204c-4b6b-b55d-72d3a3967147
    public void ActionCase(Joueur caller,final int soldes, final int roll,ArrayList<String> options) {
//begin of modifiable zone(JavaCode)......C/c1cc2f35-efe7-430d-bb03-779bad24f0ed
    	
    	if(this.qase.isOwner(caller)) {
			System.out.println(options.size() + "construire");
			options.add("construire");
    	}
    	if(!this.qase.isOwner(caller) && roll != 0) {
    		System.out.println(options.size() + "payer");
    		options.add("payer");
    	}
    		
//end of modifiable zone(JavaCode)........E/c1cc2f35-efe7-430d-bb03-779bad24f0ed
    }

//begin of modifiable zone(Javadoc).......C/87f7933d-0f76-4ea1-8af4-9f54a0baaa50

//end of modifiable zone(Javadoc).........E/87f7933d-0f76-4ea1-8af4-9f54a0baaa50
    public EtatConstructible() {
//begin of modifiable zone(JavaSuper).....C/87f7933d-0f76-4ea1-8af4-9f54a0baaa50
    	System.out.println("la case est constructible ");
//end of modifiable zone(JavaSuper).......E/87f7933d-0f76-4ea1-8af4-9f54a0baaa50
//begin of modifiable zone(JavaCode)......C/87f7933d-0f76-4ea1-8af4-9f54a0baaa50

//end of modifiable zone(JavaCode)........E/87f7933d-0f76-4ea1-8af4-9f54a0baaa50
    }

//begin of modifiable zone(Javadoc).......C/ad358ab7-8e82-49a2-9411-1bc612de37be

//end of modifiable zone(Javadoc).........E/ad358ab7-8e82-49a2-9411-1bc612de37be
    public boolean monopole(final Object selfType,Joueur a) {
//begin of modifiable zone(JavaCode)......C/ad358ab7-8e82-49a2-9411-1bc612de37be

//end of modifiable zone(JavaCode)........E/ad358ab7-8e82-49a2-9411-1bc612de37be
    	return true;
//begin of modifiable zone(JavaReturned)..C/ad358ab7-8e82-49a2-9411-1bc612de37be

//end of modifiable zone(JavaReturned)....E/ad358ab7-8e82-49a2-9411-1bc612de37be
    }

//begin of modifiable zone(Javadoc).......C/b0a2e2c1-49eb-46bc-96a3-d1295ce57537

//end of modifiable zone(Javadoc).........E/b0a2e2c1-49eb-46bc-96a3-d1295ce57537
    public void Construire(Joueur p) {
//begin of modifiable zone(JavaCode)......C/b0a2e2c1-49eb-46bc-96a3-d1295ce57537
    	if(p.debiter(qase.quartier.prixNvl,false) == qase.quartier.prixNvl) {
    		System.out.println(p.name + " a ajouter une maison sur " + this.qase.nom);
    		this.qase.nbmaison++;
    		if(this.qase.nbmaison == 5) {
    			System.out.println(p.name + " a obtenu un hotel sur " + this.qase.nom);
    			EtatConstruit tmp = new EtatConstruit();
    			tmp.qase = this.qase;
    			this.qase.etatCase = tmp;
    		}
    	}
//end of modifiable zone(JavaCode)........E/b0a2e2c1-49eb-46bc-96a3-d1295ce57537
    }

//begin of modifiable zone(Javadoc).......C/8d8fa40e-79d4-4ace-ac72-3afabb9eaafd

//end of modifiable zone(Javadoc).........E/8d8fa40e-79d4-4ace-ac72-3afabb9eaafd
    public int Constructible() {
//begin of modifiable zone(JavaCode)......C/8d8fa40e-79d4-4ace-ac72-3afabb9eaafd

//end of modifiable zone(JavaCode)........E/8d8fa40e-79d4-4ace-ac72-3afabb9eaafd
    	return 5-qase.nbmaison;
    	//begin of modifiable zone(JavaReturned)..C/8d8fa40e-79d4-4ace-ac72-3afabb9eaafd

//end of modifiable zone(JavaReturned)....E/8d8fa40e-79d4-4ace-ac72-3afabb9eaafd
    }

    
	@Override
	protected void afficherOptionConstructible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void Payer(Joueur joueur) {
		if(this.qase.nbmaison == 0)
			this.qase.owner.crediter(joueur.debiter(this.qase.loyerVide*2, false));
		this.qase.owner.crediter(joueur.debiter(this.qase.loyer1Maison, false));
		
	}

    
}
