package monopopo.monopopo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//begin of modifiable zone(Javadoc).......C/a80076ba-138b-4602-970e-678bf5cfd70f

//end of modifiable zone(Javadoc).........E/a80076ba-138b-4602-970e-678bf5cfd70f
public class Joueur {
	public String name = "default";
	
//begin of modifiable zone(Javadoc).......C/7718194e-7c46-4867-aab2-cd484e967627

//end of modifiable zone(Javadoc).........E/7718194e-7c46-4867-aab2-cd484e967627
    public int Soldes;

//begin of modifiable zone(Javadoc).......C/9bbfd31f-1236-4796-9c51-3443e0c838e9

//end of modifiable zone(Javadoc).........E/9bbfd31f-1236-4796-9c51-3443e0c838e9
    public boolean peutConstruire;

//begin of modifiable zone(Javadoc).......C/db8ac73a-5d93-4525-9abf-1df86bb30bb2

//end of modifiable zone(Javadoc).........E/db8ac73a-5d93-4525-9abf-1df86bb30bb2
    public Case qase;

//begin of modifiable zone(Javadoc).......C/b5f6a29f-f97f-4dd9-8b5f-ce91d462852b

//end of modifiable zone(Javadoc).........E/b5f6a29f-f97f-4dd9-8b5f-ce91d462852b
    public List<Achetable> achetable = new ArrayList<Achetable> ();

//begin of modifiable zone(Javadoc).......C/20c9e5c9-b9c0-4004-aa70-431795c1dde6

//end of modifiable zone(Javadoc).........E/20c9e5c9-b9c0-4004-aa70-431795c1dde6
    public Monopoly game;

    
    public Joueur( String name ,Monopoly origin,int Solde,CaseDepart depart ){
    	game = origin;
    	Soldes = Solde;
    	this.name = name;
    	qase = depart;
    }
    
//begin of modifiable zone(Javadoc).......C/c5f7055e-126a-484e-888e-e1fdeea34236
    boolean bankrupt = false;
    
//end of modifiable zone(Javadoc).........E/c5f7055e-126a-484e-888e-e1fdeea34236
    public void round() {
//begin of modifiable zone(JavaCode)......C/c5f7055e-126a-484e-888e-e1fdeea34236
    	System.out.println("Tour de "+this.name+"  ");
    	if(bankrupt)
    		return;
    	afficherOptions(0,0);
//end of modifiable zone(JavaCode)........E/c5f7055e-126a-484e-888e-e1fdeea34236
    }

//begin of modifiable zone(Javadoc).......C/e943377b-5485-423c-87f6-2d0281d0b27a
  	boolean cont = true;
  	int roll = 0;
//end of modifiable zone(Javadoc).........E/e943377b-5485-423c-87f6-2d0281d0b27a
    public void afficherOptions(int roll,int turn) {
//begin of modifiable zone(JavaCode)......C/e943377b-5485-423c-87f6-2d0281d0b27a
    	Scanner sc;
    	if(!aaPartiePreDet.utiliserFichier)
    		 sc = new Scanner(System.in);
    	else
    		sc = aaPartiePreDet.sc();
    	options = new ArrayList<String>();
		System.out.println(this.name+" choisir une option ");
		this.qase.ActionCase(this,Soldes, roll, options);
		if(turn == 0) {
			afficherOption("lancer d�es");
		}
		if(turn != 0)
			afficherOption("Terminer tour");
	
		afficherPropConstructible();
		
		int in = sc.nextInt();
		choisirOption(in);
		if(turn == 0) return;
		
		afficherOptions(0,turn++);
		
//end of modifiable zone(JavaCode)........E/e943377b-5485-423c-87f6-2d0281d0b27a
//begin of modifiable zone(JavaReturned)..C/e943377b-5485-423c-87f6-2d0281d0b27a

//end of modifiable zone(JavaReturned)....E/e943377b-5485-423c-87f6-2d0281d0b27a
    }
    
    void afficherPropConstructible(){
    	for(int i = 0;i < this.achetable.size();i++) {
    		if(this.achetable.get(i) instanceof Rue)
    			((Rue)this.achetable.get(i)).afficherOptionConstructible(options);
    	}
    }
    
   private ArrayList<String> options = new ArrayList();

	public void afficherOption(String a ) {
		System.out.println(this.options.size() + a);
		options.add(a);
	}
    
//begin of modifiable zone(Javadoc).......C/6126a623-41d4-42a8-9d85-8e7c9c6245af

//end of modifiable zone(Javadoc).........E/6126a623-41d4-42a8-9d85-8e7c9c6245af
    public void terminerTour() {
//begin of modifiable zone(JavaCode)......C/6126a623-41d4-42a8-9d85-8e7c9c6245af
    	
//end of modifiable zone(JavaCode)........E/6126a623-41d4-42a8-9d85-8e7c9c6245af
    }

//begin of modifiable zone(Javadoc).......C/677ddfd2-af6c-4e6f-bcb4-4c14f3782958

//end of modifiable zone(Javadoc).........E/677ddfd2-af6c-4e6f-bcb4-4c14f3782958
    public void choisirOption(int a) {
//begin of modifiable zone(JavaCode)......C/677ddfd2-af6c-4e6f-bcb4-4c14f3782958
    	String option = options.get(a);
    	int res;
    	if(option.contains("lancer ")) {
    		res = game.lancerDes();
    		this.qase = qase.suivant(res,this);
    		System.out.println(this.name + "arrive sur"+ qase.nom);
    		afficherOptions(res,1);
    	}
    	if(option.contains("acheter")) {
    		((Achetable)this.qase).acheter(this);
    	}
     	if(option.contains("payer")) {
    		((Achetable)this.qase).Payer(this);
    	}
     	if(option.contains("construire")) {
    		((Rue)this.qase).Construire(this);
    	}
    	if(option.contains("Terminer t")) {
    		cont = false;
    		game.passerTour();
    	}
//end of modifiable zone(JavaCode)........E/677ddfd2-af6c-4e6f-bcb4-4c14f3782958
    }

//begin of modifiable zone(Javadoc).......C/f41df9fc-22a3-49b0-98dd-327e920ac50e

//end of modifiable zone(Javadoc).........E/f41df9fc-22a3-49b0-98dd-327e920ac50e
    public int debiter(final int money, final boolean obligatoire) {
    	System.out.println("Joueur "+this.name+" a �t� debiter de "+money);
    	if ( this.Soldes > money ) {
    		this.Soldes -= money;
    		return money;	
    	}
    	else
    	{	
    		if(obligatoire) {
	    		bankrupt();
	    		return this.Soldes;
	    	}
    		else {
    			return 0;
    		}
    	}
    }
    


private void bankrupt() {
	// TODO Auto-generated method stub
	
}

//begin of modifiable zone(Javadoc).......C/eab100df-9418-4acb-b7f5-0e18e6ee065a

//end of modifiable zone(Javadoc).........E/eab100df-9418-4acb-b7f5-0e18e6ee065a
    public void crediter(final int money) {
//begin of modifiable zone(JavaCode)......C/eab100df-9418-4acb-b7f5-0e18e6ee065a
    	System.out.println("Joueur "+this.name+" a �t� crediter de "+money);
    	this.Soldes += money;
    	
//end of modifiable zone(JavaCode)........E/eab100df-9418-4acb-b7f5-0e18e6ee065a
    }

//begin of modifiable zone(Javadoc).......C/d4e7f768-9cdd-4b23-a2c8-a36ae20e90ff

//end of modifiable zone(Javadoc).........E/d4e7f768-9cdd-4b23-a2c8-a36ae20e90ff
    public boolean achat(final Achetable self, final int prix) {
    	if(this.debiter(prix,false) == prix) {
    		this.achetable.add(self); 
    		
    		return true;
    	}else {
    		return false;
    	}
    }

//begin of modifiable zone(Javadoc).......C/0a3f74a3-280a-4b57-8cc4-64f034dba9e7

//end of modifiable zone(Javadoc).........E/0a3f74a3-280a-4b57-8cc4-64f034dba9e7
    public void afficherTerminer(final String ActionCase) {
//begin of modifiable zone(JavaCode)......C/0a3f74a3-280a-4b57-8cc4-64f034dba9e7
    	
//end of modifiable zone(JavaCode)........E/0a3f74a3-280a-4b57-8cc4-64f034dba9e7
    }

//begin of modifiable zone(Javadoc).......C/1d20c221-874a-4099-841d-94480a990f9d

//end of modifiable zone(Javadoc).........E/1d20c221-874a-4099-841d-94480a990f9d
    public void afficheConstructible() {
    	System.out.println("Construire sur :");
//begin of modifiable zone(JavaCode)......C/1d20c221-874a-4099-841d-94480a990f9d
    	for(int i = 0;i < this.achetable.size();i++) {
    		if(this.achetable.get(i).Constructible() != 0)
    		System.out.println(i+ " : "+this.achetable.get(i).nom);
    	}
//end of modifiable zone(JavaCode)........E/1d20c221-874a-4099-841d-94480a990f9d
    }

	public int nbgares() {
		int nbgares = 0;
		for(int i = 0;i < this.achetable.size();i++) {
			if(this.achetable.get(i) instanceof Gare) {
				nbgares++;
			}
		}
		for(int i = 0;i < this.achetable.size();i++) {
			if(this.achetable.get(i) instanceof Gare) {
				((Gare) this.achetable.get(i)).setNbgare(nbgares);
			}
		}
		return nbgares;
	}

}
