package monopopo.monopopo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//begin of modifiable zone(Javadoc).......C/a812a7f9-c2c1-47bb-ab27-755af79e7969

//end of modifiable zone(Javadoc).........E/a812a7f9-c2c1-47bb-ab27-755af79e7969
public class Monopoly {
//begin of modifiable zone(Javadoc).......C/dbc6d24a-2226-4f89-a3ba-c2c73122acc1

	int playerCounter = 0;
	
	public static CaseDepart createCases() {			
		
		  
	    Couleur Marron = new Couleur("Marron", 50, 50);
	    Couleur BlueL = new Couleur("Bleu Clair", 50, 50);
	    Couleur Rose = new Couleur("Rose", 100, 100);; 
	    Couleur Orange = new Couleur("Orange", 100, 100);;
	    Couleur Rouge = new Couleur("Rouge", 150, 150);;
	    Couleur Jaune = new Couleur("Jaune", 150, 150);;
	    Couleur Vert = new Couleur("Vert", 200, 200);;
	    Couleur BlueD = new Couleur("Bleu Fonc�", 200, 200);;
		// Liste de toutes les cases propri�t�s 
	    // Param : Nom, loyerVide, loyer1Maison, loyer2Maisons, loyer3Maisons, loyer4Maisons, loyerHotel
	    Rue marron1 = new Rue("Boulevard de Belleville",Marron , 60, 2, 10, 30, 90, 160, 250);
	    Rue marron2 = new Rue("Rue Lecourbe",Marron, 60, 4, 20, 60, 180, 320, 450);
	    
		Rue bleuClair1 = new Rue("Rue de Vaugirad",BlueL, 100, 6, 30, 90, 270, 400, 550);
	    Rue bleuClair2 = new Rue("Rue de Courcelles",BlueL, 100, 6, 30, 90, 270, 400, 550);
	    Rue bleuClair3 = new Rue("Avenue de la r�publique",BlueL, 120, 8, 40, 100, 300, 450, 600);
	    
		Rue rose1 = new Rue("Boulevard de la villette",Rose, 140, 10, 50, 150, 450, 625, 750);
	    Rue rose2 = new Rue("Avenue de  Neuilly",Rose, 140, 10, 50, 150, 450, 625, 750);
	    Rue rose3 = new Rue("Rue du paradis",Rose, 160, 12, 60, 180, 500, 700, 900);
	    
		Rue orange1 = new Rue("Avenue Mozart",Orange, 180, 14, 70, 200, 550, 750, 950);
	    Rue orange2 = new Rue("Boulevard Saint-Michel",Orange, 180, 14, 70, 200, 550, 750, 950);
	    Rue orange3 = new Rue("Place Pigalle",Orange, 200, 16, 80, 220, 600, 800, 1000);
	    
		Rue rouge1 = new Rue("Avenue Matignon",Rouge, 220, 18, 90, 250, 700, 875, 1050);
	    Rue rouge2 = new Rue("Boulevard Malesherbes",Rouge, 220, 18, 90, 250, 700, 875, 1050);
	    Rue rouge3 = new Rue("Avenue Henri-Martin",Rouge, 240, 20, 100, 300, 750, 925, 1100);
	    
		Rue jaune1 = new Rue("Faubourg Saint-Honor�",Jaune, 260, 22, 110, 330, 800, 975, 150);
	    Rue jaune2 = new Rue("Place de la Bourse",Jaune, 260, 22, 110, 330, 800, 975, 150);
	    Rue jaune3 = new Rue("Rue de la fayette",Jaune, 280, 24, 120, 360, 850, 1025, 1200);
	    
		Rue vert1 = new Rue("Avenue de Breteuil",Vert, 300, 26, 130, 390, 900, 1100, 1275);
	    Rue vert2 = new Rue("Avenue Foch",Vert, 300, 26, 130, 390, 900, 1100, 1275);
	    Rue vert3 = new Rue("Boulevard des capucines",Vert, 320, 28, 150, 450, 1000, 1200, 1400);
	    
		Rue bleuFonce1 = new Rue("Avenue des Champs-�lys�es",BlueD, 350, 35, 175, 500, 1100, 1300, 1500);
	    Rue bleuFonce2 = new Rue("Rue de la paix",BlueD, 400, 50, 200, 600, 1400, 1700, 2000);

	    
	    // Les cases taxes
	    // Param : Nom, prixAPayer
	    Jeu taxe1 = new Jeu("Imp�ts sur le revenu", 200);
	    Jeu taxe2 = new Jeu("Taxe de luxe", 100);

	    // Les cases gares
	    // Param : Nom (loyer et prixAchat sont les m�mes pour tous)
	    Gare gare1 = new Gare("Gare Montparnasse");
	    Gare gare2 = new Gare("Gare de lyon");
	    Gare gare3 = new Gare("Gare du nord");
	    Gare gare4 = new Gare("Gare Saint-Lazard");

	    // Les cases energies
	    // Param : Nom, PrixAchat (pourrait ne pas y �tre))
	    Service energie1 = new Service("Compagnie de distribution d'�lectricit�", 150);
	    Service energie2 = new Service("Compagnie de distribution des eaux", 150);

	    // Les 4 cases dans les angles 
	    CaseDepart depart = new CaseDepart("D�part");
	    Case visitePrison = new Jeu("Simple visite",0);
	    Case parcGratuit = new Jeu("Parc gratuit",0);
	    CasePrison prison = new CasePrison("Prison");
	    
	    ArrayList<Case> toutesLesCases = new ArrayList<Case>();
	    toutesLesCases.add(depart);
	    toutesLesCases.add(marron1);
	    toutesLesCases.add(marron2);
	    toutesLesCases.add(taxe1);
	    toutesLesCases.add(gare1);
	    toutesLesCases.add(bleuClair1);
	    toutesLesCases.add(bleuClair2);
	    toutesLesCases.add(bleuClair3);
	    toutesLesCases.add(visitePrison);
	    toutesLesCases.add(rose1);
	    toutesLesCases.add(energie1);
	    toutesLesCases.add(rose2);
	    toutesLesCases.add(rose3);
	    toutesLesCases.add(gare2);
	    toutesLesCases.add(orange1);
	    toutesLesCases.add(orange2);
	    toutesLesCases.add(orange3);
	    toutesLesCases.add(parcGratuit);
	    toutesLesCases.add(rouge1);
	    toutesLesCases.add(rouge2);
	    toutesLesCases.add(rouge3);
	    toutesLesCases.add(gare3);
	    toutesLesCases.add(jaune1);
	    toutesLesCases.add(jaune2);
	    toutesLesCases.add(energie2);
	    toutesLesCases.add(jaune3);
	    toutesLesCases.add(prison);
	    toutesLesCases.add(vert1);
	    toutesLesCases.add(vert2);
	    toutesLesCases.add(vert3);
	    toutesLesCases.add(gare4);
	    toutesLesCases.add(bleuFonce1);
	    toutesLesCases.add(taxe2);
	    toutesLesCases.add(bleuFonce2);
	    
	    for(int i =0;i < toutesLesCases.size();i++) {
	    	toutesLesCases.get(i).suivant = toutesLesCases.get((i+1)%toutesLesCases.size());
	    }
	    
	    return depart;
}

	
//end of modifiable zone(Javadoc).........E/dbc6d24a-2226-4f89-a3ba-c2c73122acc1
    public List<Joueur> joueur = new ArrayList<Joueur> ();
    CaseDepart caseDepart = createCases();
    
//begin of modifiable zone(Javadoc).......C/a38349a5-c0b9-4957-821c-0ff7d3d0c8ee

//end of modifiable zone(Javadoc).........E/a38349a5-c0b9-4957-821c-0ff7d3d0c8ee
    public Dees dees = new Dees();

//begin of modifiable zone(Javadoc).......C/0a964204-bc45-42bb-8aec-b8ada4c91865

//end of modifiable zone(Javadoc).........E/0a964204-bc45-42bb-8aec-b8ada4c91865
    public Case qase;

//begin of modifiable zone(Javadoc).......C/75c1560e-5aeb-49a8-9155-05f0b63bd0fe

//end of modifiable zone(Javadoc).........E/75c1560e-5aeb-49a8-9155-05f0b63bd0fe
    public int lancerDes() {
    	return dees.lancerDes();
    }

//begin of modifiable zone(Javadoc).......C/b6c8c4b9-9ca0-4b90-994b-591a64ef9a79

//end of modifiable zone(Javadoc).........E/b6c8c4b9-9ca0-4b90-994b-591a64ef9a79
    public Case getCase(final int p1) {
//begin of modifiable zone(JavaCode)......C/b6c8c4b9-9ca0-4b90-994b-591a64ef9a79
    	return caseDepart.suivant(p1, null);
//end of modifiable zone(JavaCode)........E/b6c8c4b9-9ca0-4b90-994b-591a64ef9a79
    }

//begin of modifiable zone(Javadoc).......C/ac63d247-218e-4947-86b9-73d7b82ea640

//end of modifiable zone(Javadoc).........E/ac63d247-218e-4947-86b9-73d7b82ea640
    public void passerTour() {
//begin of modifiable zone(JavaCode)......C/ac63d247-218e-4947-86b9-73d7b82ea640
    	joueur.get((++playerCounter)%this.joueur.size()).round();
//end of modifiable zone(JavaCode)........E/ac63d247-218e-4947-86b9-73d7b82ea640
    }
 //begin of modifiable zone(Javadoc).......C/ac63d247-218e-4947-86b9-73d7b82ea640

    public static void main (String[] args){
    	System.out.println("Working Directory = " + System.getProperty("user.dir"));
    	(new Monopoly()).nouvellePartie();
    }
    
//end of modifiable zone(Javadoc).........E/ac63d247-218e-4947-86b9-73d7b82ea640    
    public void nouvellePartie() {
    	Scanner sc = new Scanner(System.in);
    	if(!aaPartiePreDet.utiliserFichier)
	   		 sc= new Scanner(System.in);
	   	else
	   		sc = aaPartiePreDet.sc();
//begin of modifiable zone(JavaCode)......C/ac63d247-218e-4947-86b9-73d7b82ea640
    	System.out.println("debut de la partie donner minimum 2 joueurs ");
		System.out.println("donner le nom du joueur :");
		String playername = sc.nextLine();
		this.joueur.add(new Joueur(playername, this,2000,caseDepart));
		System.out.println("donner le nom du joueur :");
		playername = sc.nextLine();
		
		this.joueur.add(new Joueur(playername, this,2000,caseDepart));
		
    	
    	for(int i = 0 ; i < 2 ; i++) {
    		System.out.println("donner le nom du joueur :");
    		playername = sc.nextLine();
    		if(playername != "stop")
    			this.joueur.add(new Joueur(playername, this,2000,caseDepart));
    		else 
    			break;
    	}
    	this.joueur.get(0).round();
//end of modifiable zone(JavaCode)........E/ac63d247-218e-4947-86b9-73d7b82ea640
    }

    
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
