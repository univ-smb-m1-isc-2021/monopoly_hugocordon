package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/349cc0bf-b1f4-447b-8050-46e538d43c8e

//end of modifiable zone(Javadoc).........E/349cc0bf-b1f4-447b-8050-46e538d43c8e
public abstract class Achetable extends Case {
//begin of modifiable zone(Javadoc).......C/772ee2e4-35bd-47bc-b485-9e2177e503db

public Achetable(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	//end of modifiable zone(Javadoc).........E/772ee2e4-35bd-47bc-b485-9e2177e503db
    public Joueur owner = null;

//begin of modifiable zone(Javadoc).......C/5469adbd-45e7-4b57-aca8-034e285d03ef

//end of modifiable zone(Javadoc).........E/5469adbd-45e7-4b57-aca8-034e285d03ef
    public Couleur quartier;

//begin of modifiable zone(Javadoc).......C/eb3abcb4-9604-4806s-aeaa-37bb51637e04

//end of modifiable zone(Javadoc).........E/eb3abcb4-9604-4806-aeaa-37bb51637e04
    public abstract void acheter(Joueur joueur) ;

//begin of modifiable zone(Javadoc).......C/d145168a-e4fb-47a9-b12f-d53f218aca7e

//end of modifiable zone(Javadoc).........E/d145168a-e4fb-47a9-b12f-d53f218aca7e
    public boolean isOwner(final Joueur p1) {
//begin of modifiable zone(JavaCode)......C/d145168a-e4fb-47a9-b12f-d53f218aca7e
    		return this.owner == p1;
//end of modifiable zone(JavaCode)........E/d145168a-e4fb-47a9-b12f-d53f218aca7e
    }

	protected abstract void Payer(Joueur joueur);




}
