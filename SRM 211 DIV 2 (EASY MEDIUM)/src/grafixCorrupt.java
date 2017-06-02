import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class grafixCorrupt {
	
	public int selectWord(String[] dictionary, String candidate) {

		int[] count = new int[dictionary.length];

		int maxIndex =0;
		for(int i=0; i<dictionary.length; i++){
			for(int j=0; j<dictionary[0].length(); j++)
				if(dictionary[i].charAt(j) == candidate.charAt(j)) {
					++count[i];
				}
		}

		maxIndex=0;
		for(int i=0; i<count.length; i++){
			if(count[i]>count[maxIndex])
				maxIndex=i;
		}

		return count[maxIndex] == 0 ? -1 : maxIndex;
	}
}
