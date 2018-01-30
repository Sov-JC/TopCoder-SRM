import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RollingDiceDivTwo {
	
	public int minimumFaces(String[] rolls) {
		int dices = rolls[0].length();
		char[] min = new char[dices];
		for(int i=0; i<min.length; i++){
			min[i] = '1';
		}

		for(String r: rolls){
			char[] r_charArray;
			r_charArray = r.toCharArray();

			Arrays.sort(r_charArray);

			for(int i=0; i<r_charArray.length; i++){
				if(min[i] < r_charArray[i])
					min[i] = r_charArray[i];
			}
		}

		int sum=0;
		for(char c: min)
			sum+=Integer.parseInt(c+"");

		return sum;
	}
}
