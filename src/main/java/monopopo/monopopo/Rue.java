package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/bb13f95f-4c85-44de-9a73-30d6da57b009

//end of modifiable zone(Javadoc).........E/bb13f95f-4c85-44de-9a73-30d6da57b009
public class Rue extends Achetable {
//begin of modifiable zone(Javadoc).......C/e2591f85-be12-48fc-8ffd-2486d2ea9d45

	
	
	Couleur quartier;
	
//end of modifiable zone(Javadoc).........E/e2591f85-be12-48fc-8ffd-2486d2ea9d45
    public String nombreDeMaison;

//begin of modifiable zone(Javadoc).......C/2e9a8a5d-1c71-4f8a-88e4-82c872c90cfb

//end of modifiable zone(Javadoc).........E/2e9a8a5d-1c71-4f8a-88e4-82c872c90cfb
    public etatCase etatCase;

public int prixAchat;

public int loyerVide;

public int loyer1Maison;

public int loyer3Maison;

public int loyer4Maison;

public int loyer2Maison;

public int loyerHotel;

int nbmaison = 0;

//begin of modifiable zone(Javadoc).......C/78adb844-11cd-4553-b0dd-54cb1406ba0e
 // Param : Nom, loyerVide, loyer1Maison, loyer2Maisons, loyer3Maisons, loyer4Maisons, loyerHotel
    public Rue(String Nom, Couleur gquartier,int hprixAchat, int iloyerVide, int jloyer1Maison, int kloyer2Maisons, int lloyer3Maisons, int mloyer4Maisons, int nloyerHotel) {
    	super(Nom);
    	this.nom = Nom;
    	
    	quartier = gquartier;
    	prixAchat = hprixAchat;
    	loyerVide = iloyerVide;
    	loyer1Maison = jloyer1Maison;
    	loyer2Maison = kloyer2Maisons;
    	loyer3Maison = lloyer3Maisons;
    	loyer4Maison = mloyer4Maisons;
    	loyerHotel = nloyerHotel;
    	
    	gquartier.achetable.add(this);
    	
    	etatCase = new EtatDisponible(this);
	}

	//end of modifiable zone(Javadoc).........E/78adb844-11cd-4553-b0dd-54cb1406ba0e
    public void acheter(final Joueur p1) {
//begin of modifiable zone(JavaCode)......C/78adb844-11cd-4553-b0dd-54cb1406ba0e
    	((EtatDisponible) this.etatCase).acheter(p1);
//end of modifiable zone(JavaCode)........E/78adb844-11cd-4553-b0dd-54cb1406ba0e
    }

//begin of modifiable zone(Javadoc).......C/88bace82-4703-42e9-8875-8fd60c65b62f

//end of modifiable zone(Javadoc).........E/88bace82-4703-42e9-8875-8fd60c65b62f
    public void setEtat(final etatCase etat) {
//begin of modifiable zone(JavaCode)......C/88bace82-4703-42e9-8875-8fd60c65b62f

//end of modifiable zone(JavaCode)........E/88bace82-4703-42e9-8875-8fd60c65b62f
    }

//begin of modifiable zone(Javadoc).......C/969cb1fd-cc11-4c4d-a8b9-05ca0ae379b2

//end of modifiable zone(Javadoc).........E/969cb1fd-cc11-4c4d-a8b9-05ca0ae379b2
    public boolean monopole(final Joueur joueur, Object callerobj) {
//begin of modifiable zone(JavaCode)......C/969cb1fd-cc11-4c4d-a8b9-05ca0ae379b2

//end of modifiable zone(JavaCode)........E/969cb1fd-cc11-4c4d-a8b9-05ca0ae379b2
    	return this.etatCase.monopole(callerobj, joueur);
//begin of modifiable zone(JavaReturned)..C/969cb1fd-cc11-4c4d-a8b9-05ca0ae379b2

//end of modifiable zone(JavaReturned)....E/969cb1fd-cc11-4c4d-a8b9-05ca0ae379b2
    }
    
    public void setmonopole() {
    	this.etatCase.setmonopole();
    }

	public int getPrix() {
		// TODO Auto-generated method stub
		return this.prixAchat;
	}

	@Override
	public void ActionCase(Joueur caller, int soldes, int roll, ArrayList<String> options) {
		// TODO Auto-generated method stub
		etatCase.ActionCase(caller, soldes, roll, options);
		
	}

	public void afficherOptionConstructible(ArrayList<String> options) {
		etatCase.afficherOptionConstructible();
	}

	public void Construire(Joueur j) {
		// TODO Auto-generated method stub
		((EtatConstructible)this.etatCase).Construire(j);
		
	}

	public void Payer(Joueur joueur) {
		// TODO Auto-generated method stub
		this.etatCase.Payer(joueur);
		
	}



}
