import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class CityMap {
	
	public String getLegend(String[] cityMap, int[] POIs) {
		int[] letters = new int[26];
		String ans = "";

		for(int i=0; i<cityMap.length; i++){
			for(int j=0; j<cityMap[0].length(); j++) {
				char c = cityMap[i].charAt(j);
				if (c <= 'Z' && c >= 'A')
					letters[c - 'A']++;
			}
		}

		for(int i=0; i<POIs.length; i++){
			for(int j=0; j< letters.length; j++){
				if(letters[j] == POIs[i])
					ans += (char)('A' + j);
			}
		}

		return ans;
	}
}
