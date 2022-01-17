package monopopo.monopopo;

import java.util.Scanner;

//begin of modifiable zone(Javadoc).......C/49816504-a7ab-475d-bc72-e9a0dc095291

//end of modifiable zone(Javadoc).........E/49816504-a7ab-475d-bc72-e9a0dc095291
public class Dees {
//begin of modifiable zone(Javadoc).......C/471057d8-11cd-4032-a119-9d7610a72369

	boolean userDice = false;
//end of modifiable zone(Javadoc).........E/471057d8-11cd-4032-a119-9d7610a72369
    public int lancerDes() {
    	if(aaPartiePreDet.utiliserFichier)
    		return desfichier();
    	int ret = (int)(Math.random() * 5.0) + 1 + (int)(Math.random() * 5.0) + 1;
    	System.out.println("resultat d�es : "+ret);
    	return ret;
    }

	private int desfichier() {
			Scanner sc = aaPartiePreDet.sc();
			int a = sc.nextInt();
			if(userDice) {
				Scanner udc = new Scanner(System.in);
				a = udc.nextInt();
			}
			System.out.println("	dees: " + a);


		return a;
	}

}
