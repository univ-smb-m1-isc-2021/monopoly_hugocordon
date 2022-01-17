package monopopo.monopopo;
import java.util.ArrayList;
import java.util.List;

//begin of modifiable zone(Javadoc).......C/f121e4fd-6fb1-447d-92e0-09c412114549

//end of modifiable zone(Javadoc).........E/f121e4fd-6fb1-447d-92e0-09c412114549
public class Couleur {
//begin of modifiable zone(Javadoc).......C/3a245028-175c-481b-ba90-040541ccf9c6

//end of modifiable zone(Javadoc).........E/3a245028-175c-481b-ba90-040541ccf9c6
    public List<Rue> achetable = new ArrayList<Rue> ();
    public int prixNvl;
    public int payerNvl;
    
//begin of modifiable zone(Javadoc).......C/8e8a892d-3654-425e-9bb2-6fd045fb48e6
    
    public Couleur(String string, int i, int j) {
    	prixNvl = i;
    	prixNvl = i;
		// TODO Auto-generated constructor stub
	}

	//end of modifiable zone(Javadoc).........E/8e8a892d-3654-425e-9bb2-6fd045fb48e6
    public boolean monopole(Joueur p1, Object object) {
//begin of modifiable zone(JavaCode)......C/8e8a892d-3654-425e-9bb2-6fd045fb48e6

//end of modifiable zone(JavaCode)........E/8e8a892d-3654-425e-9bb2-6fd045fb48e6


    	for(int i = 0; i < achetable.size(); i++) {
    		if(achetable.get(i).monopole(p1,null) == false)
    			return false;
    	}
    	if(object == null)
    	{
    		for(int i = 0; i < achetable.size(); i++) 
        		achetable.get(i).setmonopole();
    	}
    	return true;
//begin of modifiable zone(JavaReturned)..C/8e8a892d-3654-425e-9bb2-6fd045fb48e6

//end of modifiable zone(JavaReturned)....E/8e8a892d-3654-425e-9bb2-6fd045fb48e6
    }

}
