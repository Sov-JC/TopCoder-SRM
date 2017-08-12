import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PlatypusPaternity {
	
	public int maxFamily(String[] femaleCompatibility, String[] maleCompatibility, String[] siblingGroups) {
		int n = siblingGroups[0].length(); //total children

		int familySize = 0;
		for(String sg: siblingGroups){
			for(String mc: maleCompatibility){
				for(String fc: femaleCompatibility){

					int count = 2;
					for(int i=0; i<n; i++){
						if(sg.charAt(i) == 'Y'){
							if (mc.charAt(i) == 'Y' && fc.charAt(i) == 'Y') {
								count++;
							}else{
								count = 0;
								break;
							}
						}
					}

					familySize = Math.max(familySize, count);
				}
			}
		}

		return familySize;
	}
}
