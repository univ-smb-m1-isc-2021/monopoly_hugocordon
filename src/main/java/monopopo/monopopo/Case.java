package monopopo.monopopo;
//begin of modifiable zone(Javadoc).......C/8d2732f1-a08b-4bb6-8fbb-915dd59b6a97

import java.util.ArrayList;

//end of modifiable zone(Javadoc).........E/8d2732f1-a08b-4bb6-8fbb-915dd59b6a97
public abstract class Case {

	
	protected String nom;
	
	public Case(String nom ) {
		this.nom = nom;
	}
	
//begin of modifiable zone(Javadoc).......C/34e06a52-1882-4f3b-8e2a-5f6b5ee088d4

//end of modifiable zone(Javadoc).........E/34e06a52-1882-4f3b-8e2a-5f6b5ee088d4
//begin of modifiable zone(Javadoc).......C/119c8322-5e50-45f3-a028-8615e3d6ea65

//end of modifiable zone(Javadoc).........E/119c8322-5e50-45f3-a028-8615e3d6ea65
    public Case qase;
    public Case suivant;

//begin of modifiable zone(Javadoc).......C/1d9e8389-3834-4ded-8fba-dd6c6f1d8ac3

//end of modifiable zone(Javadoc).........E/1d9e8389-3834-4ded-8fba-dd6c6f1d8ac3
    public String getEtat() {
//begin of modifiable zone(JavaCode)......C/1d9e8389-3834-4ded-8fba-dd6c6f1d8ac3

//end of modifiable zone(JavaCode)........E/1d9e8389-3834-4ded-8fba-dd6c6f1d8ac3
    	return "";
    	
//begin of modifiable zone(JavaReturned)..C/1d9e8389-3834-4ded-8fba-dd6c6f1d8ac3

//end of modifiable zone(JavaReturned)....E/1d9e8389-3834-4ded-8fba-dd6c6f1d8ac3
    }

//begin of modifiable zone(Javadoc).......C/c1cc2f35-efe7-430d-bb03-779bad24f0ed

//end of modifiable zone(Javadoc).........E/c1cc2f35-efe7-430d-bb03-779bad24f0ed
   abstract public void ActionCase(Joueur caller,final int soldes, final int roll,ArrayList<String> options);
//begin of modifiable zone(Javadoc).......C/0b97b499-ce69-47a3-aedb-7780aad119a0

//end of modifiable zone(Javadoc).........E/0b97b499-ce69-47a3-aedb-7780aad119a0


//begin of modifiable zone(Javadoc).......C/028078d3-84b0-4f4d-b617-ce983ed97fc1

//end of modifiable zone(Javadoc).........E/028078d3-84b0-4f4d-b617-ce983ed97fc1
    public Case suivant(final int nb, Joueur a) {
//begin of modifiable zone(JavaCode)......C/028078d3-84b0-4f4d-b617-ce983ed97fc1
    	if(nb == 0) {
    		System.out.println(a.name + " arrive sur " + this.nom);
    		return this;
    	}
    	System.out.println(a.name + " passe sur " + this.nom);
    	return suivant.suivant(nb-1,a);
//end of modifiable zone(JavaCode)........E/028078d3-84b0-4f4d-b617-ce983ed97fc1
    }

//begin of modifiable zone(Javadoc).......C/b0dcb89b-824d-4431-8154-1228ce25919f

//end of modifiable zone(Javadoc).........E/b0dcb89b-824d-4431-8154-1228ce25919f
    public int Constructible() {
//begin of modifiable zone(JavaCode)......C/b0dcb89b-824d-4431-8154-1228ce25919f

//end of modifiable zone(JavaCode)........E/b0dcb89b-824d-4431-8154-1228ce25919f
    	return 0;
//begin of modifiable zone(JavaReturned)..C/b0dcb89b-824d-4431-8154-1228ce25919f

//end of modifiable zone(JavaReturned)....E/b0dcb89b-824d-4431-8154-1228ce25919f
    }

//begin of modifiable zone(Javadoc).......C/f80303a2-b40b-4a9a-a064-018c327fe0a4

//end of modifiable zone(Javadoc).........E/f80303a2-b40b-4a9a-a064-018c327fe0a4


}
