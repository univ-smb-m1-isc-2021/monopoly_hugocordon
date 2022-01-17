package monopopo.monopopo;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class aaPartiePreDet {
	
	public static Scanner sc = null;

	public static boolean utiliserFichier = true;
	
	public static Scanner sc(){

		try {
			Path path = Paths.get(aaPartiePreDet.class.getResource("partie1.txt").toURI());
			File file = new File(path.toString());
	    	
	    	if(sc == null)
	    		sc = new Scanner(file);
	    	
			return sc;
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			sc = new Scanner(System.in);
			return sc;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sc = new Scanner(System.in);
			return sc;
		}
	
	}

}