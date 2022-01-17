
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import monopopo.monopopo.Case;
import monopopo.monopopo.Dees;
import monopopo.monopopo.Joueur;
import monopopo.monopopo.Monopoly;
import monopopo.monopopo.aaPartiePreDet;

@SelectPackages({"com.howtodoinjava.junit5.examples.packageA"
				,"com.howtodoinjava.junit5.examples.packageB"})

@IncludeTags("production")
@Suite
@SelectClasses( Monopoly.class )
public class testSuiteMonopoly {
	
	@Test 
	void validGameStartqm() {
		
		Case depart = Monopoly.createCases() ;
		Case defile = depart;
		
		Set<Case> lcase = new HashSet<Case>();
		
		for(int i = 0; i < 36 && (defile.nom != depart.nom && i != 0);i++) {
			
			lcase.add(defile);
			
			defile = defile.suivant;
		}
		
		assert(!(lcase.size() > 36));	// trop de case
		assert(!(lcase.size() < 36));	// pas assez de case
		
	}
	
}