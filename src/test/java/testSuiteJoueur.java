
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import monopopo.monopopo.Dees;
import monopopo.monopopo.Joueur;
import monopopo.monopopo.aaPartiePreDet;

@SelectPackages({"com.howtodoinjava.junit5.examples.packageA"
				,"com.howtodoinjava.junit5.examples.packageB"})

@IncludeTags("production")
@Suite
@SelectClasses( Joueur.class )
public class testSuiteJoueur {
	
}