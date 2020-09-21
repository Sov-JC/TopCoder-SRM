import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PalindromeDecoding {
	
	public String decode(String code, int[] position, int[] length) {

		String cummulativeStr = code;

		for(int i=0; i<position.length; i++){
			System.out.println(cummulativeStr);
			System.out.println("position[i]: " + position[i]);
			String substr = cummulativeStr.substring(position[i], (position[i]+length[i]));
			System.out.println("substr: " + substr);
			String substrReverse = "";

			for(int j=substr.length()-1; j>=0; j--){
				substrReverse+=(Character.toString(substr.charAt(j)));
			}

			System.out.println("substrReverse: " + substrReverse);

			int pos = position[i] + length[i];

			String left = cummulativeStr.substring(0, pos);
			String right = cummulativeStr.substring(pos, cummulativeStr.length());

			cummulativeStr = left + substrReverse + right;
		}
		return cummulativeStr;
	}
}
