package monopopo.monopopo;

import java.util.ArrayList;

//begin of modifiable zone(Javadoc).......C/384f9c02-b6bf-4542-b1c5-e1e2541030aa

//end of modifiable zone(Javadoc).........E/384f9c02-b6bf-4542-b1c5-e1e2541030aa
public class EtatConstruit extends etatCase {
//begin of modifiable zone(Javadoc).......C/c9c16822-bbc9-4a86-a4c8-30bb6fb9e3e0

        public void ActionCase(Joueur caller,final int soldes, final int roll,ArrayList<String> options) {
        	//begin of modifiable zone(JavaCode)......C/c1cc2f35-efe7-430d-bb03-779bad24f0ed
        	    	

        	if(!this.qase.isOwner(caller) && roll != 0) {
        		System.out.println(options.size() + "payer");
        		options.add("payer");
        	}
        	    		

//end of modifiable zone(JavaCode)........E/c1cc2f35-efe7-430d-bb03-779bad24f0ed
    }

//begin of modifiable zone(Javadoc).......C/b7a26ee7-91f8-4474-b310-e9fc05c26ddb

//end of modifiable zone(Javadoc).........E/b7a26ee7-91f8-4474-b310-e9fc05c26ddb
    public void Payer() {
//begin of modifiable zone(JavaCode)......C/b7a26ee7-91f8-4474-b310-e9fc05c26ddb

//end of modifiable zone(JavaCode)........E/b7a26ee7-91f8-4474-b310-e9fc05c26ddb
    }

//begin of modifiable zone(Javadoc).......C/de6e0ead-925e-4a8b-96db-4a4198f3b0f2

//end of modifiable zone(Javadoc).........E/de6e0ead-925e-4a8b-96db-4a4198f3b0f2
    public EtatConstruit() {
//begin of modifiable zone(JavaSuper).....C/de6e0ead-925e-4a8b-96db-4a4198f3b0f2

//end of modifiable zone(JavaSuper).......E/de6e0ead-925e-4a8b-96db-4a4198f3b0f2
//begin of modifiable zone(JavaCode)......C/de6e0ead-925e-4a8b-96db-4a4198f3b0f2

//end of modifiable zone(JavaCode)........E/de6e0ead-925e-4a8b-96db-4a4198f3b0f2
    }

//begin of modifiable zone(Javadoc).......C/b9752a57-40ca-47a8-b414-634e17279865

//end of modifiable zone(Javadoc).........E/b9752a57-40ca-47a8-b414-634e17279865
    public int Constructible() {
//begin of modifiable zone(JavaCode)......C/b9752a57-40ca-47a8-b414-634e17279865

//end of modifiable zone(JavaCode)........E/b9752a57-40ca-47a8-b414-634e17279865
    	return 0;
//begin of modifiable zone(JavaReturned)..C/b9752a57-40ca-47a8-b414-634e17279865

//end of modifiable zone(JavaReturned)....E/b9752a57-40ca-47a8-b414-634e17279865
    }

	@Override
	protected void afficherOptionConstructible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void Payer(Joueur joueur) {
		// TODO Auto-generated method stub
		this.qase.owner.crediter(joueur.debiter(this.qase.loyerHotel, false));
	}

}
