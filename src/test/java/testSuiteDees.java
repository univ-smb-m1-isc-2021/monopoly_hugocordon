
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import monopopo.monopopo.Dees;
import monopopo.monopopo.aaPartiePreDet;

@SelectPackages({"com.howtodoinjava.junit5.examples.packageA"
				,"com.howtodoinjava.junit5.examples.packageB"})

@IncludeTags("production")
@Suite
@SelectClasses( Dees.class )
public class testSuiteDees {

	
	boolean niceSpreadqm(int[] nums,int nbthrows)
	{
		double[] rightProbabilities2die = {0,0,1/36,2/36,3/36,4/36,5/36,6/36,5/36,4/36,3/36,2/36,1/36};
		double[] rP2d = rightProbabilities2die;
		for(int i = 0; i < 13;i++) {
			if(Math.abs(rP2d[i] - (float)nums[i]/(float)nbthrows) > 0.1 )
				return false;
			
		}
		
		return true;
	}
	@Test
	void testAlea(){
		boolean oldUseFile = aaPartiePreDet.utiliserFichier;
		
			Dees testDice = new Dees();
			
			int nbthro;
			int[] numbers = {0,0,0,0,0,0,0,0,0,0,0,0};
			for(int i = 0; i < (nbthro = 100000);i++) {
				int diceResult = testDice.lancerDes(); 
				assert(diceResult < 13); // pb >
				assert(diceResult > 1);	// pb <
				
				numbers[diceResult]++;
			}
			
			assert(niceSpreadqm(numbers,nbthro)); // pb spread
	
		aaPartiePreDet.utiliserFichier = oldUseFile;
		
	}

	
	
}